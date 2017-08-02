package com.tw.service;

import java.util.List;

/**
 * Created by tengw on 2017/5/21.
 */
public interface ProductService {
    List<Product> findAll();

    int insert(Product record);
}
