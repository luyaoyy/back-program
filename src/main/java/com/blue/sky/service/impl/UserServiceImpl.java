package com.blue.sky.service.impl;

import com.blue.sky.bean.Comment;
import com.blue.sky.bean.CommentLike;
import com.blue.sky.bean.TicketOrder;
import com.blue.sky.bean.User;
import com.blue.sky.mapper.UserMapper;
import com.blue.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void HandleUserRegister(User user) {
        userMapper.HandleUserRegister(user);
    }

    @Override
    public int CheckName(String name) {
        return userMapper.CheckName(name);
    }

    @Override
    public User CheckLogin(String uname, String upassword) {
        return userMapper.CheckLogin(uname, upassword);
    }

    @Override
    public List<TicketOrder> getUserPaidTicketList(int uid) {
        return userMapper.getUserPaidTicketList(uid);
    }

    @Override
    public User getUserByUid(int uid) {
        return userMapper.getUserByUid(uid);
    }

    @Override
    public void updateBalance(int money, int uid) {
        userMapper.updateBalance(money, uid);
    }

    @Override
    public List<TicketOrder> geTWaitPaidUserOrderList(int uid) {
        return userMapper.geTWaitPaidUserOrderList(uid);
    }


    @Override
    @Transactional
    public void updateTicketStatus(String number, int total, int uid) { //支付电影订单
        userMapper.updateTicketStatus(number);
        userMapper.subBalance(total, uid);
    }


    @Override
    public void handleDeleteUserOrder(String number) {
        userMapper.handleDeleteUserOrder(number);
    }

    @Override
    public void addComment(Comment comment) {
        userMapper.addComment(comment);
    }

    @Override
    public List<Comment> getCommentList(int mid) {
        return userMapper.getCommentList(mid);
    }

    @Override
    public void delLike(int uid,int cid) {
        userMapper.delLike(uid,cid);
    }

    @Override
    public void addLike(int uid, int cid) {
        userMapper.addLike(uid, cid);
    }

    @Override
    public CommentLike isExistCommentLike(int uid, int cid) {
        return userMapper.isExistCommentLike(uid,cid);
    }
}
