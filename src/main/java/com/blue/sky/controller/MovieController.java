package com.blue.sky.controller;

import com.blue.sky.bean.*;
import com.blue.sky.service.MovieService;
import com.github.pagehelper.PageInfo;
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
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/MovieSeat")
    @ResponseBody
    public Map<String, Object> getMovieSeat(int sid) {
        Map<String, Object> map = new HashMap<>();
        map.put("seat", movieService.getSeat(sid));
        map.put("session", movieService.getSession(sid));
        return map;
    }

    @PostMapping("/BuyTicket")
    @ResponseBody
    public Map<String, Object> buyTicket(@RequestBody List<Ticket> tickets) {
        Map<String, Object> map = new HashMap<>();
        if (movieService.checkTicket(tickets).size() == 0) {
                movieService.buyTicket(tickets);
                map.put("isSuccess", true);
                map.put("message", "订单提交成功!");
                return map;
        } else {
            map.put("isSuccess", false);
            map.put("message", "该位置有人了哦!");
            return map;
        }
    }



    @GetMapping(value = {"/UserHomePage", "GetAllMovieList"})
    @ResponseBody
    public List<Movie> getAllMovieList() {
        return movieService.getAllMovieList();
    }

    @GetMapping("/MovieSessionList")
    @ResponseBody
    public List<Session> getMovieSessionList(int mid) {
        return movieService.getMovieSessionList(mid);
    }

    @GetMapping("/page/{pageNum}/{pageSize}")
    @ResponseBody
    public PageInfo<Movie> getStuPageInfo(@PathVariable int pageNum, @PathVariable int pageSize) {
        return movieService.getMovieListPageInfo(pageNum, pageSize);
    }

    @PostMapping("/DeleteMovie")
    @ResponseBody
    public void DelMovieServlet(int mid) {
        movieService.delMovieByMid(mid);
    }

    @PostMapping("/MovieEdit")
    @ResponseBody
    public void movieEdit(@RequestBody Movie movie) {
        movieService.updateMovie(movie);
    }

    @PostMapping("/AddMovieSession")
    @ResponseBody
    public void addMovieSession(@RequestBody Session session) {
        session.setStatus(0);
        movieService.addMovieSession(session);
    }


    @GetMapping("/GetChartData")
    @ResponseBody
    public Map<String, Object> getChartData() {
        Map<String, Object> map = new HashMap<>();
        map.put("movieRankList", movieService.getMovieRankList());
        map.put("totalMoney", movieService.gerTotalMoney());
        map.put("userCount", movieService.getUserCount());
        map.put("adminCount", movieService.getAdminCount());
        map.put("movieCount", movieService.getMovieCount());
        map.put("ticketCount", movieService.getTicketCount());
        return map;
    }

    @PostMapping("/SlideImgUpload")
    @ResponseBody
    public void slideImgUpload(MultipartFile img, HttpSession session, int mid) throws IOException {
        //获取上传的文件的文件名
        String fileName = img.getOriginalFilename();
        System.out.println(fileName);
        System.out.println(mid);
        //处理文件重名问题
        String hzName = fileName.substring(fileName.lastIndexOf("."));
        fileName = UUID.randomUUID().toString() + hzName;
        //获取服务器中photo目录的路径
        ServletContext servletContext = session.getServletContext();
        String photoPath = servletContext.getRealPath("photo");
        File file = new File(photoPath);
        if (!file.exists()) {
            file.mkdir();
        }
        String finalPath = photoPath + File.separator + fileName;
        //实现上传功能,其实即文件转移到对应文件夹下
        img.transferTo(new File(finalPath));

        String Name = "photo/" + fileName;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createTime = df.format(new Date());

        movieService.addSlideImg(mid, Name, createTime);

    }

    @GetMapping("/GetSlideImg")
    @ResponseBody
    public List<SlideImg> getSlideImg() {
        return movieService.getSlideImgList();
    }

    @GetMapping("/GetMovieListByKeyWord")
    @ResponseBody
    public List<Movie> getMovieListByKeyWord(String keyWord) {
        return movieService.getMovieListByKeyWord(keyWord);
    }

    @GetMapping("/GetTicketOrderList/{pageNum}/{pageSize}")
    @ResponseBody
    public PageInfo getTicketOrderList(@PathVariable int pageNum, @PathVariable int pageSize) {
        return movieService.getTicketOrderList(pageNum, pageSize);
    }

    @GetMapping("/GetTicketOrderByKeyWord/{pageNum}/{pageSize}")
    @ResponseBody
    public PageInfo getTicketOrderByKeyWord(String type, String keyWord, @PathVariable int pageNum, @PathVariable int pageSize) {
        return movieService.getTicketOrderByKeyWord(type, keyWord, pageNum, pageSize);
    }

    @PostMapping("/DelSlideImgById")
    @ResponseBody
    public void delSlideImgById(int id) {
        movieService.delSlideImgById(id);
    }

    @GetMapping("/GetHotMovieList")
    @ResponseBody
    public List<Movie> getHotMovieList() {
        return movieService.getHotMovieList();
    }

    @GetMapping("/GetHotMovieByKeyWord")
    @ResponseBody
    public List<Movie> getHotMovieByKeyWord(String mclass, String mnation) {
        return movieService.getHotMovieByKeyWord(mclass, mnation);
    }

    @GetMapping("/GetMovieRankList")
    @ResponseBody
    public List<MovieRank> getMovieRankList() {
        return movieService.getMovieRankList();
    }

    @GetMapping("/GetMovieSearchResult")
    @ResponseBody
    public List<Movie> getMovieSearchResult(String searchType, String searchContent) {
        System.out.println(searchType + " " + searchContent);
        return movieService.getMovieSearchResult(searchType, searchContent);
    }
}
