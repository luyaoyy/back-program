package com.blue.sky.service.impl;

import com.blue.sky.bean.*;
import com.blue.sky.mapper.MovieMapper;
import com.blue.sky.service.MovieService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieMapper movieMapper;

    @Override
    public List<Integer> getSeat(int sid) {
        return movieMapper.getSeat(sid);
    }

    @Override
    public Session getSession(int sid) {
        return movieMapper.getSession(sid);
    }

    @Override
    @Transactional //添加事务
    public void buyTicket(List<Ticket> list) {//插入购买的电影票信息,同时修改余额
        movieMapper.buyTicket(list);
    }

    @Override
    public List<Ticket> checkTicket(List<Ticket> tickets) {
        return movieMapper.checkTicket(tickets);
    }

    @Override
    public List<Movie> getAllMovieList() {
        return movieMapper.getAllMovieList();
    }

    @Override
    public List<Session> getMovieSessionList(int mid) {
        return movieMapper.getMovieSessionList(mid);
    }

    @Override
    public PageInfo<Movie> getMovieListPageInfo(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Movie> list = movieMapper.getAllMovieList();
        PageInfo<Movie> page = new PageInfo<>(list, 5);
        return page;
    }

    @Override
    public void delMovieByMid(int mid) {
        movieMapper.delMovieByMid(mid);
    }

    @Override
    public void updateMovie(Movie movie) {
        movieMapper.updateMovie(movie);
    }

    @Override
    public void addMovieSession(Session session) {
        movieMapper.addMovieSession(session);
    }

    @Override
    public long gerTotalMoney() {
        return movieMapper.gerTotalMoney();
    }

    public List<MovieRank> getMovieRankList() {
        return movieMapper.getMovieRankList();
    }

    @Override
    public int getUserCount() {
        return movieMapper.getUserCount();
    }

    @Override
    public int getAdminCount() {
        return movieMapper.getAdminCount();
    }

    @Override
    public int getMovieCount() {
        return movieMapper.getMovieCount();
    }

    @Override
    public int getTicketCount() {
        return movieMapper.getTicketCount();
    }

    @Override
    public void addSlideImg(int mid, String imgUrl, String createTime) {
        movieMapper.addSlideImg(mid, imgUrl, createTime);
    }

    @Override
    public List<SlideImg> getSlideImgList() {
        return movieMapper.getSlideImgList();
    }

    @Override
    public List<Movie> getMovieListByKeyWord(String keyWord) {
        return movieMapper.getMovieListByKeyWord(keyWord);
    }


    @Override
    public PageInfo getTicketOrderList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TicketOrder> list = movieMapper.getTicketOrderList();
        PageInfo<TicketOrder> page = new PageInfo<>(list, 5);
        return page;
    }

    @Override
    public PageInfo getTicketOrderByKeyWord(String type, String keyWord, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TicketOrder> list = movieMapper.getTicketOrderByKeyWord(type, keyWord);
        PageInfo<TicketOrder> page = new PageInfo<>(list, 5);
        return page;
    }

    @Override
    public void delSlideImgById(int id) {
        movieMapper.delSlideImgById(id);
    }

    @Override
    public List<Movie> getHotMovieList() {
        return movieMapper.getHotMovieList();
    }

    @Override
    public List<Movie> getHotMovieByKeyWord(String mclass,String mnation) {
        return movieMapper.getHotMovieByKeyWord(mclass,mnation);
    }

    @Override
    public List<Movie> getMovieSearchResult(String searchType, String searchContent) {
        return movieMapper.getMovieSearchResult(searchType,searchContent);
    }

}
