package com.qinglong.todo.dao;

import com.qinglong.todo.entity.Item;

import java.util.List;

/**
 * @author 廖高兴
 */
public interface ItemDao {
    /**
     * 找到所有Item
     *
     * @return 返回Item的list集合
     */
    List<Item> findAll();

    /**
     * 通过id找到Item
     *
     * @param id item.id
     * @return 返回通过id查找到的Item对象
     */
    Item findById(int id);

    /**
     * 增加item,成功返回1失败返回0
     *
     * @param item 传入的item对象参数
     * @return 成功返回1失败返回0
     */
    int add(Item item);

    /**
     * 修改item
     *
     * @param item 传入修改的item
     * @return 成功返回1失败返回0
     */
    int update(Item item);

    /**
     * 删除item
     *
     * @param id 传入要删除的item.id
     * @return 成功返回1失败返回0
     */
    int delete(int id);

    /**
     * 删除panle下的所有item
     *
     * @param panelId 传入要删除的item的对应panelId
     * @return 成功返回1失败返回0
     */
    int deleteAll(int panelId);
}
