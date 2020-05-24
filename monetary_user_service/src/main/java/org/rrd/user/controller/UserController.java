package org.rrd.user.controller;

import org.rrd.system.pojo.User;
import org.rrd.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
