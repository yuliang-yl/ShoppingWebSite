package com.yl.service;

import com.yl.dao.Statusdao;
import com.yl.po.Status;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-28-11:58
 */
@Service
public class Statusserviceimpl implements Statusservice {
    @Resource
    public Statusdao sd;

    public List<Status> selectall() {
        return sd.selectall();
    }

    public Status selectById(int statusId) {
        return sd.selectById(statusId);
    }
}
