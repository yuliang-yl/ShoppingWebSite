package com.yl.service;

import com.yl.po.Status;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-28-11:57
 */
public interface Statusservice {
    List<Status> selectall();
    Status selectById(@Param("statusId") int statusId);
}
