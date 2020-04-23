package com.qinglong.todo.dao;

import com.qinglong.todo.entity.Panel;

import java.util.List;

/**
 * @author 廖高兴
 */
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
    List<Panel> findAll();

    /**
     * 通过id查找Panel
     *
     * @param id Panel。id
     * @return 返回找到的Panel
     */
    Panel findById(int id);

    /**
     * 添加panel
     *
     * @param p 要添加的panel对象
     * @return 成功返回1失败返回0
     */
    int add(Panel p);

    /**
     * 更新panel
     *
     * @param p 传入要更新的panel
     * @return 成功返回1失败返回0
     */
    int update(Panel p);

    /**
     * 删除panel
     *
     * @param id 传入id
     * @return 成功返回1失败返回0
     */
    int delete(int id);


}
