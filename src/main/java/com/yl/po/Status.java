package com.yl.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @create 2019-11-24-2:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Status {
    private int status_id;
    private String status_name;

    public Status(String status_name) {
        this.status_name = status_name;
    }

    public Status(int status_id) {
        this.status_id = status_id;
    }
}
