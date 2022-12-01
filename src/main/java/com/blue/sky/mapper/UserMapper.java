package com.blue.sky.mapper;

import com.blue.sky.bean.Comment;
import com.blue.sky.bean.CommentLike;
import com.blue.sky.bean.TicketOrder;
import com.blue.sky.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    void HandleUserRegister(User user);

    int CheckName(String name);

    User CheckLogin(@Param("uname") String uname, @Param("upassword") String upassword);

    List<TicketOrder> getUserPaidTicketList(int uid);


    @Select("select * from myuser where uid=#{uid}")
    User getUserByUid(int uid);

    @Update("update myuser set ubanlance=ubanlance+${money} where uid=#{uid}")
    void updateBalance(@Param("money") int money, @Param("uid") int uid);


    List<TicketOrder> geTWaitPaidUserOrderList(int uid);

    void updateTicketStatus(String number);

    void subBalance(@Param("total") int total, @Param("uid") int uid);

    @Delete("delete from ticket where number=#{number}")
    void handleDeleteUserOrder(String number);


    void addComment(Comment comment);

    List<Comment> getCommentList(int mid);

    @Delete("delete from commentlike where uid=#{uid} and cid=#{cid}")
    void delLike(@Param("uid") int uid, @Param("cid") int cid);

    @Insert("insert into commentlike(uid,cid) values(#{uid},#{cid})")
    void addLike(@Param("uid") int uid, @Param("cid") int cid);

    CommentLike isExistCommentLike(@Param("uid") int uid, @Param("cid") int cid);
}
