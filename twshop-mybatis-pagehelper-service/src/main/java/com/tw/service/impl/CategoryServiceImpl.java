package com.tw.service.impl;

import io.z77z.entity.Category;
import io.z77z.mapper.CategoryMapper;
import io.z77z.service.ICategoryService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分类表 服务实现类
 * </p>
 *
 * @author tw
 * @since 2017-07-31
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {
	
}
