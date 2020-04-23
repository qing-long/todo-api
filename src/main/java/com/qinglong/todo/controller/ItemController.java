package com.qinglong.todo.controller;

import com.qinglong.todo.entity.Item;
import com.qinglong.todo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 廖高兴
 */
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/GET/item", method = RequestMethod.GET)
    public List<Item> findAll() {
        return itemService.findAll();
    }

    /**
     * 通过id找到Item
     */
    @RequestMapping(value = "/GET/item/id", method = RequestMethod.GET)
    public Item findById( int itemId) {
        return itemService.findById(itemId);

    }

    /**
     * 增加item,成功返回1失败返回0
     */
    @RequestMapping(value = "/POST/item", method = RequestMethod.POST)
    public int add(Item item) {
        return itemService.add(item);
    }

    /**
     * 修改item
     */
    @RequestMapping(value = "/PUT/item", method = RequestMethod.PUT)
    public int update(Item item) {
        return itemService.update(item);
    }

    /**
     * 删除item
     */
    @RequestMapping(value = "/DELETE/item/id", method = RequestMethod.DELETE)
    public int delete(int id) {
        return itemService.delete(id);
    }

    /**
     * 删除panle下的所有item
     */
    @RequestMapping(value = "/DELETE/item", method = RequestMethod.DELETE)
    public int deleteAll(int panelId) {
        return itemService.deleteAll(panelId);
    }
}
