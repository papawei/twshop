package com.tw.service.impl;

import com.tw.model.User;
import com.tw.mapper.UserMapper;
import com.tw.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
}
