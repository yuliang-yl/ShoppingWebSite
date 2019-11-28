package com.yl.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @create 2019-11-24-2:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private String product_id;
    private String product_name;
    private String product_sum;
    private double product_price;
    private Status status_id;

    public Product(String product_name, String product_sum, double product_price) {
        this.product_name = product_name;
        this.product_sum = product_sum;
        this.product_price = product_price;
    }

    public Product(String product_id, String product_name, String product_sum, double product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_sum = product_sum;
        this.product_price = product_price;
    }
}
