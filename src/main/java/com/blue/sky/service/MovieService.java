package com.blue.sky.service;

import com.blue.sky.bean.*;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MovieService {
    List<Integer> getSeat(int sid);

    Session getSession(int sid);

    void buyTicket(List<Ticket> list);

    List<Ticket> checkTicket(List<Ticket> tickets);

    List<Movie> getAllMovieList();

    List<Session> getMovieSessionList(int mid);

    PageInfo<Movie> getMovieListPageInfo(int pageNum, int pageSize);

    void delMovieByMid(int mid);

    void updateMovie(Movie movie);

    void addMovieSession(Session session);

    long gerTotalMoney();

    List<MovieRank> getMovieRankList();

    int getUserCount();

    int getAdminCount();

    int getMovieCount();

    int getTicketCount();

    void addSlideImg(int mid, String imgUrl, String createTime);

    List<SlideImg> getSlideImgList();

    List<Movie> getMovieListByKeyWord(String keyWord);

    PageInfo getTicketOrderList(int pageNum, int pageSize);

    PageInfo getTicketOrderByKeyWord(String type, String keyWord, int pageNum, int pageSize);

    void delSlideImgById(int id);

    List<Movie> getHotMovieList();

    List<Movie> getHotMovieByKeyWord(String mclass, String mnation);

    List<Movie> getMovieSearchResult(String searchType, String searchContent);



}
