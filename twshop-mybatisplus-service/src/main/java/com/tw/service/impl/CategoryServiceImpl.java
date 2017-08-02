package com.tw.service.impl;

import com.tw.model.Category;
import com.tw.mapper.CategoryMapper;
import com.tw.service.CategoryService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分类表 服务实现类
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
	
}
