package com.yl.service;

import com.yl.dao.Productdao;
import com.yl.po.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-24-3:10
 */
@Service
public class Productserviceimpl implements Productservice {

    @Resource
    public Productdao pd;

    public List<Product> findall() {
        return pd.findall();
    }

    public int insert(Product pro) {
        return pd.insert(pro);
    }

    public Product findbyid(String  id) {
        return pd.findbyid(id);
    }

    public int update(Product pro) {
        return pd.update(pro);
    }

    public int delete(String id) {
        return pd.delete(id);
    }
}
