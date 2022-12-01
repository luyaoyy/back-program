package com.blue.sky.mapper;

import com.blue.sky.bean.Admin;
import org.apache.ibatis.annotations.Param;


public interface AdminMapper {
    Admin CheckLogin(@Param("aname") String aname, @Param("apassword") String apassword);
}
