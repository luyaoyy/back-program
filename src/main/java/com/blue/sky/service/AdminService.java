package com.blue.sky.service;

import com.blue.sky.bean.Admin;

public interface AdminService {
    Admin CheckLogin(String aname, String apassword);
}
