package work.space.mapper;

import work.space.entity.Todolist;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

/**
* @author Accqiao
* @description 针对表 [todolist] 的数据库操作 Mapper
* @createDate 2022-01-26 00:01:48
* @Entity work.space.entity.Todolist
*/
public interface TodolistMapper extends BaseMapper<Todolist> {


    int selectCount();

    List<Todolist> selectByOkSign(int rows,int num,int sign);
    List<Todolist> selectByDelSign(int rows,int num,int sign);

    //选择 ByPrimaryKey
    Todolist selectByPrimaryKey(String id);
    //选择全部 selectAllData
    List<Todolist> selectAllData();
    //分页分行 ByPrimaryRows
    List<Todolist> selectByRows(int rows,int num);

    //删除 ByPrimaryKey
    int deleteByPrimaryKey(String id);

    //插入一条数据，全部插入，字段为空则插入空
    int insert(Todolist record);
    //插入一条数据，选择性插入，字段为空则跳过改字段
    int insertSelective(Todolist record);

    //更新一条数据，全部更新，字段为空则更新为空
    int updateByPrimaryKey(Todolist record);
    //更新一条数据，选择性更新，字段为空则跳过改字段
    int updateByPrimaryKeySelective(Todolist record);

    //插入一条数据，如果该数据存在则直接更新改数据
    int toInsertOrUpdate(Todolist record);
    //插入一条数据，如果该数据存在则直接更新改数据,选择性更新
    int toInsertOrUpdateSelective(Todolist record);



}




