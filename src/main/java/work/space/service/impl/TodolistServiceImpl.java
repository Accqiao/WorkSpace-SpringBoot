package work.space.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import work.space.entity.Todolist;
import work.space.service.TodolistService;
import work.space.mapper.TodolistMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
* @author Accqiao
* @description 针对表 [todolist] 的数据库操作 Service 实现 Impl
* @createDate 2022-07-26 00:01:48
*/
@Service
public class TodolistServiceImpl extends ServiceImpl<TodolistMapper, Todolist>
    implements TodolistService{

    @Resource
    private TodolistMapper mapper;

    @Override
    public int selectCount() {
        return mapper.selectCount();
    }

    @Override
    public int selectFinishCount(int sign) {
        return mapper.selectFinishCount(sign);
    }

    @Override
    public int selectDeleteCount(int sign) {
        return mapper.selectDeleteCount(sign);
    }

    @Override
    public List<Todolist> selectByOkSign(int page,int num, int sign) {
        int rows = page * num - num;
        return mapper.selectByOkSign(rows,num,sign);
    }

    @Override
    public List<Todolist> selectByDelSign(int page, int num, int sign) {
        int rows = page * num - num;
        return mapper.selectByDelSign(rows,num,sign);
    }

    @Override
    public Todolist selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Todolist> selectAllData() {
        return mapper.selectAllData();
    }

    @Override
    public List<Todolist> selectByPages(int page,int num) {
        int rows = page * num - num;
        return mapper.selectByRows(rows,num);
    }

    @Override
    public List<Todolist> selectByRows(int rows,int num) {
        return mapper.selectByRows(rows,num);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Todolist record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Todolist record) {
        return mapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Todolist record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Todolist record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int toInsertOrUpdate(Todolist record) {
        return mapper.toInsertOrUpdate(record);
    }

    @Override
    public int toInsertOrUpdateSelective(Todolist record) {
        return mapper.toInsertOrUpdateSelective(record);
    }

}




