package com.blue.sky.service;

import com.blue.sky.bean.Comment;
import com.blue.sky.bean.CommentLike;
import com.blue.sky.bean.TicketOrder;
import com.blue.sky.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    void HandleUserRegister(User user);

    int CheckName(String name);

    User CheckLogin(String uname, String upassword);

    List<TicketOrder> getUserPaidTicketList(int uid);

    User getUserByUid(int uid);

    void updateBalance(int money, int uid);

    List<TicketOrder> geTWaitPaidUserOrderList(int uid);

    void updateTicketStatus(String number, int total, int uid);

    void handleDeleteUserOrder(String number);

    void addComment(Comment comment);

    List<Comment> getCommentList(int mid);

    void delLike(int uid, int cid);

    void addLike(int uid, int cid);

    CommentLike isExistCommentLike(int uid, int cid);
}
