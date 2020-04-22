package com.qinglong.todo.service.impl;

import com.qinglong.todo.dao.Panel_itemDao;
import com.qinglong.todo.entity.Item;
import com.qinglong.todo.entity.Panel_Item;
import com.qinglong.todo.service.Panel_itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Panel_itemServiceImpl implements Panel_itemService {
    @Autowired
    private Panel_itemDao piDao;

    /**
     * 查找所有panel_item
     */
    @Override
    public List<Panel_Item> findAll() {
        return piDao.findAll();
    }

    /**
     * 通过id查找panel_item
     */
    @Override
    public Panel_Item findById(int id) {
        return piDao.findById(id);
    }



    /**
     * 增加panel_item
     */
    @Override
    public int add(Panel_Item pi) {
        return piDao.add(pi);
    }

    /**
     * 修改panel_item
     */
    @Override
    public int update(Panel_Item pi) {
        return piDao.update(pi);
    }

    /**
     * 删除panel_item
     */
    @Override
    public int delete(int id) {
        return piDao.delete(id);
    }

    /**
     * 删除所有关系
     */
    @Override
    public int deleteAll(int id) {
        return piDao.deleteAll(id);
    }
}
