package work.space.mapper;

import work.space.entity.Userinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Accqiao
* @description 针对表 [userinfo] 的数据库操作 Mapper
* @createDate 2022-07-25 23:10:05
* @Entity work.space.entity.Userinfo
*/
public interface UserinfoMapper extends BaseMapper<Userinfo> {


    //选择 ByPrimaryKey
    Userinfo selectByPrimaryKey(String id);
    //删除 ByPrimaryKey
    int deleteByPrimaryKey(String id);

    //插入一条数据，全部插入，字段为空则插入空
    int insert(Userinfo record);
    //插入一条数据，选择性插入，字段为空则跳过改字段
    int insertSelective(Userinfo record);

    //更新一条数据，全部更新，字段为空则更新为空
    int updateByPrimaryKey(Userinfo record);
    //更新一条数据，选择性更新，字段为空则跳过改字段
    int updateByPrimaryKeySelective(Userinfo record);

    //插入一条数据，如果该数据存在则直接更新改数据
    int toInsertOrUpdate(Userinfo record);
    //插入一条数据，如果该数据存在则直接更新改数据,选择性更新
    int toInsertOrUpdateSelective(Userinfo record);



}




