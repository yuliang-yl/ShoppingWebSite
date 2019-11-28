package com.yl.handler;

import com.yl.po.Product;
import com.yl.po.Status;
import com.yl.service.Productservice;
import com.yl.service.Statusservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @create 2019-11-24-3:11
 */
@Controller
public class ProductHandler {
    @Resource
    private Productservice ps;
    @Autowired
    private Statusservice ss;
    @RequestMapping("/demo")
    public String findall(Map<String,Object> map,Integer statusId,String productName){
        List<Product> findall = ps.findall();
        if(statusId==null){
            statusId=0;
        }
        map.put("list",findall);
        map.put("list2",ss.selectall());
        map.put("statusId",statusId);
        map.put("productName",productName);

        return "index";
    }
    @RequestMapping("/toinsert")
    public String toinsert(Map<String,Object> map){
        map.put("list2",ss.selectall());
        return "insert1";
    }
    @RequestMapping("/insert")
    public String insert(Product pro, Status status){
        pro.setStatus_id(status);
        int insert = ps.insert(pro);
        System.out.println(insert);
        return "redirect:/demo";
    }
    @RequestMapping("/findbyid")
    public String findbyid(Map<String,Object> map ,String id) {
        System.out.println(id);
        Product findbyid = ps.findbyid(id);
        System.out.println(findbyid);
        map.put("list",findbyid);
        map.put("list2",ss.selectall());
        return "update1";
    }
    @RequestMapping("/update")
    public String update(Product product){
        System.out.println(product);
        ps.update(product);
        return "redirect:/demo";
    }
    @RequestMapping("/delete")
    public String delete(String id){
        System.out.println(id);
        ps.delete(id);
        return "redirect:/demo";
    }
}
