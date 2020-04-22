package com.qinglong.todo.service.impl;

import com.qinglong.todo.dao.ItemDao;
import com.qinglong.todo.entity.Item;
import com.qinglong.todo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> findAll() {
        return itemDao.findAll();
    }

    /**
     * 通过id找到Item
     */
    @Override
    public Item findById(int id) {
        return itemDao.findById(id);
    }


    /**
     * 增加item,成功返回1失败返回0
     */
    @Override
    public int add(Item item) {
        return itemDao.add(item);
    }

    /**
     * 修改item
     */
    @Override
    public int update(Item item) {
        return itemDao.update(item);
    }

    /**
     * 删除item
     */
    @Override
    public int delete(int id) {
        return itemDao.delete(id);
    }

    /**
     * 删除panle下的所有item
     */
    @Override
    public int deleteAll(int panelId) {
        return itemDao.deleteAll(panelId);
    }
}
