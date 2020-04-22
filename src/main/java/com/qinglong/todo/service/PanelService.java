package com.qinglong.todo.service;

import com.qinglong.todo.entity.Panel;

import java.util.List;

/**
 * 业务层接口
 */

public interface PanelService {
    /**
     * 找到所有panel
     */
    List<Panel> findAll();


    /**
     * 通过id找到panel
     */
    Panel findById(int id);

    /**
     * 增加panel
     */
    int add(Panel panel);


    /**
     * 修改panel
     */
    int update(Panel panel);

    /**
     * 删除panel
     */
    int delete(int id);

    Panel find();
}
