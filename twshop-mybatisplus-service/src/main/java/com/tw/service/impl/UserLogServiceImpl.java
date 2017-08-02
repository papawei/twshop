package com.tw.service.impl;

import com.tw.model.UserLog;
import com.tw.mapper.UserLogMapper;
import com.tw.service.UserLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志 服务实现类
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
@Service
public class UserLogServiceImpl extends ServiceImpl<UserLogMapper, UserLog> implements UserLogService {
	
}
