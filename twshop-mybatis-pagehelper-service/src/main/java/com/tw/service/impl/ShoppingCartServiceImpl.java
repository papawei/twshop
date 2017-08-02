package com.tw.service.impl;

import io.z77z.entity.ShoppingCart;
import io.z77z.mapper.ShoppingCartMapper;
import io.z77z.service.IShoppingCartService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车 服务实现类
 * </p>
 *
 * @author tw
 * @since 2017-07-31
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements IShoppingCartService {
	
}
