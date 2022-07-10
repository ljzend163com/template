package com.ljz.formwork.controller;

import com.ljz.formwork.pojo.User;
import com.ljz.formwork.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ljz
 * @since 2022-07-03 17-34-55
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户控制类")
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation(value = "查询所有用户")
    @GetMapping("/all")
    public List<User> all(){
        return userService.list();
    }

    @ApiOperation(value = "用户")
    @PostMapping()
    public String save(@RequestBody User user){
        boolean save = userService.save(user);
        if(save) {
            return "插入成功";
        }else{
            return "插入失败";
        }
    }

}
