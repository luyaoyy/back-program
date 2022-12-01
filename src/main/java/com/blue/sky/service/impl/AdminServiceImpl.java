package com.blue.sky.service.impl;

import com.blue.sky.bean.Admin;
import com.blue.sky.mapper.AdminMapper;
import com.blue.sky.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin CheckLogin(String aname, String apassword) {
        return adminMapper.CheckLogin(aname,apassword);
    }
}
