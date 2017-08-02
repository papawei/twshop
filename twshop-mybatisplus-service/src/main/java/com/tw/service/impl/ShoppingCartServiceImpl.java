package com.tw.service.impl;

import com.tw.model.ShoppingCart;
import com.tw.mapper.ShoppingCartMapper;
import com.tw.service.ShoppingCartService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车 服务实现类
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
	
}
