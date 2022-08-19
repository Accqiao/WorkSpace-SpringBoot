package work.space.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import work.space.entity.ResultObject;
import work.space.entity.Todolist;
import work.space.entity.User;
import work.space.service.TodolistService;
import work.space.service.UserService;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todolist")
public class ToDoListController {

    //@PathVariable     |   /user/id       取id
    //@RequestParam     |   /user&id=1     取id
    //@RequestBody      |                  取json


    @Resource
    private TodolistService todolistService;


    @RequestMapping("all")
    public ResultObject All(){
        ResultObject resObj = new ResultObject();
        List<Todolist> todolists = todolistService.selectAllData();
        resObj.setOK(true);
        resObj.setData(todolists);
        return resObj;
    }
    @RequestMapping("allpage")
    public Object ByAllPage(@RequestParam int page,int num){
        JSONObject jobj = new JSONObject();
        List<Todolist> todolists = todolistService.selectByPages(page, num);
        int total = todolistService.selectCount();
        jobj.put("list",todolists);
        jobj.put("page",page);
        jobj.put("num",num);
        jobj.put("total",total);
        return jobj;
    }
    @RequestMapping("okpage")
    public Object ByOKPage(@RequestParam int page,int num,int sign){
        JSONObject jobj = new JSONObject();
        List<Todolist> todolists = todolistService.selectByOkSign(page, num, sign);
        int total = todolistService.selectCount();
        jobj.put("list",todolists);
        jobj.put("page",page);
        jobj.put("num",num);
        jobj.put("total",total);
        return jobj;
    }
    @RequestMapping("delpage")
    public Object ByDelPage(@RequestParam int page,int num,int sign){
        JSONObject jobj = new JSONObject();
        List<Todolist> todolists = todolistService.selectByDelSign(page, num, sign);
        int total = todolistService.selectCount();
        jobj.put("list",todolists);
        jobj.put("page",page);
        jobj.put("num",num);
        jobj.put("total",total);
        return jobj;
    }

    @RequestMapping("delete")
    public ResultObject delete(@RequestParam String id){
        ResultObject resObj = new ResultObject();
        int row = todolistService.deleteByPrimaryKey(id);
        resObj.setOK(row == 1);
        return resObj;
    }



}
