package com.tw.service.impl;

import io.z77z.entity.Product;
import io.z77z.mapper.ProductMapper;
import io.z77z.service.IProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 										 服务实现类
 * </p>
 *
 * @author tw
 * @since 2017-07-31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {
	
}
