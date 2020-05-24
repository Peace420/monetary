package org.rrd.user.controller;

import org.rrd.system.pojo.User;
import org.rrd.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;

/**
 * Created by luyubo on 2020/5/21.
 */
@RestController
@RequestMapping(value = "/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

//    @RequestMapping("/login")
    @GetMapping("/login")
    public boolean login(@RequestParam(name = "id")String id,
                        @RequestParam(name = "password")String password
                        ){
        User user = userService.findByIdAndPassword(id,password);
        System.out.println("user:"+user);
        if(user!=null){
            return true;
        }
        return false;
    }
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {


    @Autowired
    private UserService userService;



    //注册1
    @RequestMapping("/zhuce")
    public String zhuce(@RequestBody User user){

        if (userService.zhuce(user)>0)
            return "注册成功";

        return "注册失败";
    }


    //登录
    @PostMapping("/login")
    public User login(@RequestBody User user){

        User user1 = userService.login(user);
        if (user1!=null){
            return user1;
        }

        return null;

    }


>>>>>>> 95524300c850d0489ab95f470a767bcd966b17d2
}
