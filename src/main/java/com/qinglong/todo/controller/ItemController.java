package com.qinglong.todo.controller;

import com.qinglong.todo.entity.Item;
import com.qinglong.todo.service.ItemService;
import com.qinglong.todo.service.PanelService;
import com.qinglong.todo.service.impl.PanelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/item", method = RequestMethod.GET)
    public List<Item> findAll() {
        return itemService.findAll();
    }

    /**
     * 通过id找到Item
     */
    @RequestMapping(value = "/item/findByID/{itemid}", method = RequestMethod.GET)
    public Item findById(Integer itemid) {
        return itemService.findById(itemid);

    }

    /**
     * 增加item,成功返回1失败返回0
     */
    @RequestMapping(value = "/item/service/add", method = RequestMethod.POST)
    public int add(Item item) {
        return itemService.add(item);
    }

    /**
     * 修改item
     */
    @RequestMapping(value = "/item/service/update", method = RequestMethod.PUT)
    public int update(Item item) {
        return itemService.update(item);
    }

    /**
     * 删除item
     */
    @RequestMapping(value = "/item/service/delete", method = RequestMethod.DELETE)
    public int delete(int id) {
        return itemService.delete(id);
    }

    /**
     * 删除panle下的所有item
     */
    @RequestMapping(value = "/item/service/deleteAll", method = RequestMethod.DELETE)
    public int deleteAll(int panelId) {
        return itemService.deleteAll(panelId);
    }
}
