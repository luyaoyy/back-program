package com.blue.sky.controller;

import com.blue.sky.bean.Admin;
import com.blue.sky.bean.Comment;
import com.blue.sky.bean.User;
import com.blue.sky.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/AdminLogin")
    @ResponseBody
    public Map<String,Object> adminLogin(String aname, String apassword,String inputCode, HttpSession session){
        Map<String, Object> map = new HashMap();
        Admin admin = adminService.CheckLogin(aname, apassword);
        map.put("admin", admin);
        String code = (String) session.getAttribute("checkcode");
        if (admin == null) {
            map.put("is", false);
            map.put("message", "用户名或密码错误!");
        } else if (admin != null && !code.equals(inputCode)) {
            map.put("is", false);
            map.put("message", "验证码有误!");
        } else if (admin != null && code.equals(inputCode)) {
            map.put("is", true);
            map.put("message", "登入成功!");
            map.put("admin", admin);
        }
        return map;
    }

}
