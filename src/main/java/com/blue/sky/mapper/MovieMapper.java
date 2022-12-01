package com.blue.sky.mapper;

import com.blue.sky.bean.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MovieMapper {
    List<Integer> getSeat(int sid);

    Session getSession(int sid);

    void buyTicket(List<Ticket> list);


    List<Ticket> checkTicket(List<Ticket> list);

    List<Movie> getAllMovieList();

    List<Session> getMovieSessionList(int mid);

    void delMovieByMid(int mid);

    void updateMovie(Movie movie);

    void addMovieSession(Session session);

    long gerTotalMoney();

    List<MovieRank> getMovieRankList();

    @Select("select count(*) from myuser")
    int getUserCount();

    @Select("select count(*) from admin")
    int getAdminCount();

    @Select("select count(*) from mymovie")
    int getMovieCount();

    @Select("select count(*) from ticket")
    int getTicketCount();

    void addSlideImg(@Param("mid") int mid, @Param("imgUrl") String imgUrl, @Param("createTime") String createTime);

    List<SlideImg> getSlideImgList();

    List<Movie> getMovieListByKeyWord(String keyWord);

    List<TicketOrder> getTicketOrderList();

    List<TicketOrder> getTicketOrderByKeyWord(@Param("type") String type, @Param("keyWord") String keyWord);

    @Delete("delete from slideimg where id=#{id}")
    void delSlideImgById(int id);

    @Select("select * from mymovie where ishot=1")
    List<Movie> getHotMovieList();

    List<Movie> getHotMovieByKeyWord(@Param("mclass") String mclass, @Param("mnation") String mnation);

    List<Movie> getMovieSearchResult(@Param("searchType") String searchType, @Param("searchContent") String searchContent);

}
