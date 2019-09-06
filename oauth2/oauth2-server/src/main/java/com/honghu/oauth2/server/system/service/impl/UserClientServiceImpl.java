package com.honghu.oauth2.server.system.service.impl;

import com.honghu.oauth2.system.entity.UserClient;
import com.honghu.oauth2.server.system.mapper.UserClientMapper;
import com.honghu.oauth2.server.system.service.IUserClientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wyf
 * @since 2019-08-28
 */
@Service
public class UserClientServiceImpl extends ServiceImpl<UserClientMapper, UserClient> implements IUserClientService {

}
