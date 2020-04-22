package com.qinglong.todo.dao;

import com.qinglong.todo.entity.Item;

import java.util.List;

public interface ItemDao {
    /**
     * 找到所有Item
     */
    List<Item> findAll();

    /**
     * 通过id找到Item
     */
    Item findById(int id);

    /**
     * 增加item,成功返回1失败返回0
     */
    int add(Item item);

    /**
     * 修改item
     */
    int update(Item item);

    /**
     * 删除item
     */
    int delete(int id);

    /**
     * 删除panle下的所有item
     */
    int deleteAll(int panelId);
}
