package com.qinglong.todo.dao;

import com.qinglong.todo.entity.Panel;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 * @author 廖高兴
 */
@Mapper
public interface PanelDao {
    @Results(
            id = "panelMap", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "name", column = "name"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "updateTime", column = "update_time")
    }
    )
    /**
     * @return  返回找到的id为2的panel
     */
    @Select("select * from panel where id=2")
    Panel find();

    /**
     * 找到所有Panel
     *
     * @return 返回Panel集合
     */
    @Select("select * from panel")
    @ResultMap("panelMap")
    List<Panel> findAll();

    /**
     * 通过id查找Panel
     *
     * @param id Panel。id
     * @return 返回找到的Panel
     */
    @Select("select * from panel where id=#{id}")
    Panel findById(int id);

    /**
     * 添加panel
     *
     * @param p 要添加的panel对象
     * @return 成功返回1失败返回0
     */
    @Insert("insert into panel values(#{id},#{name},#{createTime},#{updateTime})")
    int add(Panel p);

    /**
     * 更新panel
     *
     * @param p 传入要更新的panel
     * @return 成功返回1失败返回0
     */
    @Update("update panel set name=#{name},update_time=#{updateTime} where id=#{id}")
    int update(Panel p);

    /**
     * 删除panel
     *
     * @param id 传入id
     * @return 成功返回1失败返回0
     */
    @Delete("delete from panel where id=#{id}")
    int delete(int id);
}
