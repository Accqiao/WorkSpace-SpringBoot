package work.space.service;

import work.space.entity.Todolist;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
* @author Accqiao
* @description 针对表 [todolist] 的数据库操作 Service
* @createDate 2022-07-26 00:01:48
*/
public interface TodolistService extends IService<Todolist> {


    int selectCount();
    int selectFinishCount(int sign);
    int selectDeleteCount(int sign);
    List<Todolist> selectByOkSign(int page,int num,int sign);
    List<Todolist> selectByDelSign(int page,int num,int sign);

    //选择 ByPrimaryKey
    Todolist selectByPrimaryKey(String id);
    //选择全部 selectAllData
    List<Todolist> selectAllData();

    //选择 ByPrimaryPages
    List<Todolist> selectByPages(int page,int num);
    //选择 ByPrimaryRows
    List<Todolist> selectByRows(int rows,int num);

    //删除 ByPrimaryKey
    int deleteByPrimaryKey(String id);

    //插入一条数据
    int insert(Todolist record);
    int insertSelective(Todolist record);

    //更新一条数据
    int updateByPrimaryKey(Todolist record);
    int updateByPrimaryKeySelective(Todolist record);

    //插入一条数据，如果该数据存在则直接更新该数据
    int toInsertOrUpdate(Todolist record);
    int toInsertOrUpdateSelective(Todolist record);

}
