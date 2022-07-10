package com.ljz.formwork.service.impl;

import com.ljz.formwork.pojo.User;
import com.ljz.formwork.mapper.UserMapper;
import com.ljz.formwork.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ljz
 * @since 2022-07-03 17-34-55
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
