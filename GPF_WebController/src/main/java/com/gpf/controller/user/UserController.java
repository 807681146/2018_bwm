package com.gpf.controller.user;

import com.gpf.service.user.UserService;
import com.gpf.domain.User;
import com.gpf.common.result.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    //新增
    @RequestMapping("/usersave.do")
    public R save(User user){
        System.out.println("a--->"+user);
        return userService.save(user);
    }
}
