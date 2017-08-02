package com.tw.service.impl;

import io.z77z.entity.UserLog;
import io.z77z.mapper.UserLogMapper;
import io.z77z.service.IUserLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志 服务实现类
 * </p>
 *
 * @author tw
 * @since 2017-07-31
 */
@Service
public class UserLogServiceImpl extends ServiceImpl<UserLogMapper, UserLog> implements IUserLogService {
	
}
