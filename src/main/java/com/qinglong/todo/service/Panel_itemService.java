package com.qinglong.todo.service;

import com.qinglong.todo.entity.Item;
import com.qinglong.todo.entity.Panel_Item;

import java.util.List;

public interface Panel_itemService {
    /**
     * 查找所有panel_item
     */
    List<Panel_Item> findAll();

    /**
     * 通过id查找panel_item
     */
    Panel_Item findById(int id);



    /**
     * 增加panel_item
     */
    int add(Panel_Item pi);

    /**
     * 修改panel_item
     */
    int update(Panel_Item pi);

    /**
     * 删除panel_item
     */
    int delete(int id);

    /**
     * 删除所有关系
     */
    int deleteAll(int id);
}
