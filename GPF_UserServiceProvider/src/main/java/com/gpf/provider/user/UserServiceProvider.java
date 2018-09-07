package com.gpf.provider.user;

import com.gpf.mapper.user.UserMapper;
import com.gpf.service.user.UserService;
import com.gpf.domain.User;
import com.gpf.common.result.R;
import com.gpf.common.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceProvider implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public R save(User user) {

        System.err.println("provider---1111"+user.getUsername());
        return ResultUtil.createResult(userMapper.insert(user));
    }
}
