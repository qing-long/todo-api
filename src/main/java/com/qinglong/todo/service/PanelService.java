package com.qinglong.todo.service;

import com.qinglong.todo.entity.Panel;

import java.util.List;

/**
 * 业务层接口
 */

public interface PanelService {
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
     *添加panel
     *
     * @param panel 传入panel对象
     * @return 成功返回1失败返回0
     */
    int add(Panel panel);

    /**
     * 更新panel
     *
     * @param panel 传入要更新的panel
     * @return 成功返回1失败返回0
     */
    int update(Panel panel);

    /**
     * 删除panel
     *
     * @param id 传入id
     * @return 成功返回1失败返回0
     */
    int delete(int id);

    Panel find();
}
