package com.qinglong.todo.service;

import com.qinglong.todo.entity.PanelItem;

import java.util.List;

public interface PanelItemService {
    /**
     * 找到所有Item
     *
     * @return 返回查找到的Panel_Item集合
     */
    List<PanelItem> findAll();

    /**
     * 通过id找到Item
     *
     * @param id 传入PanelItem.id
     * @return 返回通过id查找到的PanelItem
     */
    PanelItem findById(int id);

    /**
     * 增加item,成功返回1失败返回0
     *
     * @param pi 传入PanelItem
     * @return 成功返回1失败返回0
     */
    int add(PanelItem pi);

    /**
     * 修改item
     *
     * @param pi 传入PanelItem
     * @return 成功返回1失败返回0
     */
    int update(PanelItem pi);

    /**
     * 删除item
     *
     * @param id 传入PanelItem.id
     * @return 成功返回1失败返回0
     */
    int delete(int id);

    /**
     * 删除panle下的所有item
     *
     * @param id 传入panel.id
     * @return 成功返回1失败返回0
     */
    int deleteAll(int id);
}
