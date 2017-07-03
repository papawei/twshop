package com.tw.twshop.service.impl;

import com.tw.twshop.entity.Product;
import com.tw.twshop.mapper.ProductMapper;
import com.tw.twshop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tengw on 2017/5/21.
 */
@Service
public class ProductServiceImpl implements IProductService {
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
