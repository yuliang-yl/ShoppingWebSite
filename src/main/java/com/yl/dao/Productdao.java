package com.yl.dao;

import com.yl.po.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-24-2:52
 */
public interface Productdao {
    List<Product> findall();
    int insert(Product pro);
    Product findbyid(@Param("id") String id);
    int update(Product pro);
    int delete(String id);
}
