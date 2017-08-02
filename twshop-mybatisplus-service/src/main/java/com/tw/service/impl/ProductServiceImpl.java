package com.tw.service.impl;

import com.tw.model.Product;
import com.tw.mapper.ProductMapper;
import com.tw.service.ProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 										 服务实现类
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
	
}
