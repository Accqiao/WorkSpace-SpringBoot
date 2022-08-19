package work.space.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.space.entity.ResultObject;
import work.space.entity.User;
import work.space.service.UserService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;


    @RequestMapping("test")
    public ResultObject test(){
        ResultObject resObj = new ResultObject(true,"到啦!",101);
        User user = new User();
        user.setUid("10010");
        user.setPassword("1234");
        User oldUser = userService.selectByPrimaryKey("10010");
        int row = userService.toInsertOrUpdate(user);
        User newUser = userService.selectByPrimaryKey("10010");
        resObj.setData(newUser);
        return resObj;
    }

}
