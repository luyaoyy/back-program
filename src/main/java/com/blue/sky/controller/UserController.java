package com.blue.sky.controller;

import com.blue.sky.bean.*;
import com.blue.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/HandleUserRegister")
    @ResponseBody
    public void HandleUserRegister(@RequestBody User user) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String time = df.format(date);
        user.setUregisterTime(time);
        userService.HandleUserRegister(user);
    }

    @GetMapping("/CheckName")
    @ResponseBody
    public boolean CheckName(String username) {
        int row = userService.CheckName(username);
        return row == 0 ? true : false;
    }

    @GetMapping("/UserLogin")
    @ResponseBody
    public Map<String, Object> userLogin(String uname, String upassword, String inputCode, HttpSession session) {
        Map<String, Object> map = new HashMap();
        User user = userService.CheckLogin(uname, upassword);
        map.put("user", user);
        String code = (String) session.getAttribute("checkcode");
        if (user == null) {
            map.put("is", false);
            map.put("message", "用户名或密码错误!");
        } else if (user != null && !code.equals(inputCode)) {
            map.put("is", false);
            map.put("message", "验证码有误!");
        } else if (user != null && code.equals(inputCode)) {
            map.put("is", true);
            map.put("message", "登入成功!");
            map.put("user", user);
        }
        return map;
    }

    @GetMapping("/GetUserPaidTicketList")
    @ResponseBody
    public List<TicketOrder> getUserPaidTicketList(int uid) {
        return userService.getUserPaidTicketList(uid);
    }

    @PostMapping("/UpdateBalance")
    @ResponseBody
    public User updateBalance(int money, int uid) {
        userService.updateBalance(money, uid);
        return userService.getUserByUid(uid);
    }


    @GetMapping("/UpDateUserInfo")
    @ResponseBody
    public User upDateUserInfo(int uid) {
        return userService.getUserByUid(uid);
    }


    @GetMapping("/GeTWaitPaidUserOrderList")
    @ResponseBody
    public List<TicketOrder> geTWaitPaidUserOrderList(int uid) {
        return userService.geTWaitPaidUserOrderList(uid);
    }

    @PostMapping("UpdateTicketStatus")
    @ResponseBody
    public Map<String, Object> updateTicketStatus(String number, int total, int uid) {
        Map<String, Object> map = new HashMap<>();
        try {
            userService.updateTicketStatus(number, total, uid);
            map.put("isSuccess", true);
            map.put("result", userService.geTWaitPaidUserOrderList(uid));
            return map;
        } catch (Exception e) {
            map.put("isSuccess", false);
            map.put("result", "你的余额不足!");
            return map;
        }
    }

//    @PostMapping("/Test")  测试文件+普通数据上传，对应前端代码在tabs_page C2组件中
//    @ResponseBody
//    public void test(@RequestParam("img") MultipartFile img,HttpSession session,User user) throws IOException {
//        String fileName = img.getOriginalFilename();
//        System.out.println(fileName);
//        System.out.println(user);
//        //处理文件重名问题
//        String hzName = fileName.substring(fileName.lastIndexOf("."));
//        fileName = UUID.randomUUID().toString() + hzName;
//        //获取服务器中photo目录的路径
//        ServletContext servletContext = session.getServletContext();
//        String photoPath = servletContext.getRealPath("test");
//        File file = new File(photoPath);
//        if (!file.exists()) {
//            file.mkdir();
//        }
//        String finalPath = photoPath + File.separator + fileName;
//        //实现上传功能,其实即文件转移到对应文件夹下
//        img.transferTo(new File(finalPath));
//    }


    @PostMapping("/HandleDeleteUserOrder")
    @ResponseBody
    public void handleDeleteUserOrder(String number) {
        System.out.println(number);
        userService.handleDeleteUserOrder(number);
    }

    @GetMapping("/HandleUpdateUserOrderList")
    @ResponseBody
    public List<TicketOrder> HandleUpdateUserOrderList(int uid) {
        return userService.geTWaitPaidUserOrderList(uid);
    }


    @PostMapping("/AddComment")
    @ResponseBody
    public void addComment(Comment comment) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        comment.setTime(dateFormat.format(new Date()));
        userService.addComment(comment);
    }

    @GetMapping("/GetCommentList")
    @ResponseBody
    public List<Comment> getCommentList(int uid, int mid) {
        List<Comment> comments = userService.getCommentList(mid);
        for (int i = 0; i < comments.size(); i++) {
            int cId = comments.get(i).getCid();
            CommentLike commentLike = userService.isExistCommentLike(uid, cId);
            if (commentLike == null)
                comments.get(i).setLike(false);
            else
                comments.get(i).setLike(true);
        }
        return comments;
    }

    @PostMapping("/DelLike")
    @ResponseBody
    public List<Comment> delLike(int uid, int cid, int mid) {
        userService.delLike(uid, cid);
        List<Comment> comments = userService.getCommentList(mid);
        for (int i = 0; i < comments.size(); i++) {
            int cId = comments.get(i).getCid();
            CommentLike commentLike = userService.isExistCommentLike(uid, cId);
            if (commentLike == null)
                comments.get(i).setLike(false);
            else
                comments.get(i).setLike(true);
        }
        return comments;
    }

    @PostMapping("/AddLike")
    @ResponseBody
    public List<Comment> addLike(int uid, int cid, int mid) {
        userService.addLike(uid, cid);
        List<Comment> comments = userService.getCommentList(mid);
        for (int i = 0; i < comments.size(); i++) {
            int cId = comments.get(i).getCid();
            CommentLike commentLike = userService.isExistCommentLike(uid, cId);
            if (commentLike == null)
                comments.get(i).setLike(false);
            else
                comments.get(i).setLike(true);
        }
        return comments;
    }

    @PostMapping("/AddFavorite")
    @ResponseBody
    public Map<String, Object> addFavorite(Favorite favorite, String type) {
        Map<String, Object> map = new HashMap<>();
        try {
            if (type.equals("add")) {
                userService.addFavorite(favorite);
                map.put("message", "已添加收藏!");
                map.put("isFavorite", true);
            } else {
                userService.delFavorite(favorite);
                map.put("message", "已取消收藏!");
                map.put("isFavorite", false);
            }
            map.put("isError", false);
        } catch (Exception e) {
            map.put("message", "操作失败!");
            map.put("isError", true);
        } finally {
            return map;
        }
    }

    @GetMapping("/IsExistFavorite")
    @ResponseBody
    public boolean isExistFavorite(int uid, int mid) {
        return userService.isExistFavorite(uid, mid) == null ? false : true;
    }
}
