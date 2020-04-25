package com.qinglong.todo.dao;

import com.qinglong.todo.entity.Panel;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 廖高兴
 */
@Mapper
public interface PanelDao {
    /**
     * 测试例子
     *
     * @return 看能否返回数据成功
     */
    Panel find();

    /**
     * 找到所有Panel
     *
     * @return 返回Panel集合
     */
    @Select("select * from panel")
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
    @Insert("insert into panel values(#{p.id},#{p.name},#{p.createTime},#{p.updateTime})")
    int add(Panel p);

    /**
     * 更新panel
     *
     * @param p 传入要更新的panel
     * @return 成功返回1失败返回0
     */
    @Update("update panel set id=#{p.id},name=#{p.name},create_time=#{p.createTime],update_time=#{p.updateTime}")
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
