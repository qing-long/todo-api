package com.qinglong.todo.dao;

import com.qinglong.todo.entity.Item;
import com.qinglong.todo.entity.Panel_Item;

import java.util.List;

public interface Panel_itemDao {

    /**
     * 找到所有Item
     */
    List<Panel_Item> findAll();

    /**
     * 通过id找到Item
     */
    Panel_Item findById(int id);


    /**
     * 增加item,成功返回1失败返回0
     */
    int add(Panel_Item pi);

    /**
     * 修改item
     */
    int update(Panel_Item pi);

    /**
     * 删除item
     */
    int delete(int id);

    /**
     * 删除panle下的所有item
     */
    int deleteAll(int id);
}
