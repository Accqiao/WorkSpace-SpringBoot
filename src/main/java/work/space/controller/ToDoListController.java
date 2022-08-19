package work.space.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import work.space.entity.ResultObject;
import work.space.entity.Todolist;
import work.space.service.TodolistService;
import javax.annotation.Resource;
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
        int total = todolistService.selectFinishCount(sign);
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
        int total = todolistService.selectDeleteCount(sign);
        jobj.put("list",todolists);
        jobj.put("page",page);
        jobj.put("num",num);
        jobj.put("total",total);
        return jobj;
    }


    @RequestMapping("insert")
    public ResultObject insert(@RequestBody String jstr){
        JSONObject jobj = JSONObject.parseObject(jstr);
        Todolist todolist = new Todolist();
        todolist.setContent(jobj.getString("content"));
        todolist.setMark(jobj.getString("mark"));
        int row = todolistService.insertSelective(todolist);

        ResultObject resObj = new ResultObject();
        resObj.setOK(row == 1);
        return resObj;
    }
    @RequestMapping("update")
    public ResultObject update(@RequestBody String jstr){
        System.out.println(jstr);
        JSONObject jobj = JSONObject.parseObject(jstr);

        Todolist todolist = new Todolist();
        todolist.setId(jobj.getInteger("id"));
        todolist.setContent(jobj.getString("content"));
        todolist.setMark(jobj.getString("mark"));
        todolist.setOksign(0);

        ResultObject resObj = new ResultObject();
        int row = todolistService.updateByPrimaryKeySelective(todolist);
        resObj.setOK(row == 1);
        return resObj;
    }
    @RequestMapping("change")
    public ResultObject change(@RequestBody String jstr){
        JSONObject jobj = JSONObject.parseObject(jstr);

        Todolist todolist = new Todolist();
        todolist.setId(jobj.getInteger("id"));
        if(jobj.getString("type").equals("finish")){
            todolist.setOksign(jobj.getInteger("sign"));
        }else {
            todolist.setDelsign(jobj.getInteger("sign"));
        }
        int row = todolistService.updateByPrimaryKeySelective(todolist);

        ResultObject resObj = new ResultObject();
        resObj.setOK(row == 1);
        return resObj;
    }

    @RequestMapping("delete")
    public ResultObject delete(@RequestBody String jstr){
        JSONObject jobj = JSONObject.parseObject(jstr);
        ResultObject resObj = new ResultObject();
        int row = todolistService.deleteByPrimaryKey(jobj.getString("id"));
        resObj.setOK(row == 1);
        return resObj;
    }







}
