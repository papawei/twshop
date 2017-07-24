package com.tw.service.impl;

import com.tw.entity.Product;
import com.tw.mapper.ProductMapper;
import com.tw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tengw on 2017/5/21.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> findAll() {
        return productMapper.selectAll();
    }

    @Override
    public int insert(Product record) {
        return productMapper.insert(record);
    }
}
