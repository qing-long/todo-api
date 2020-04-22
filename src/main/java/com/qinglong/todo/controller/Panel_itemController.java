package com.qinglong.todo.controller;

import com.qinglong.todo.entity.Item;
import com.qinglong.todo.entity.Panel_Item;
import com.qinglong.todo.service.impl.Panel_itemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Panel_itemController {
    @Autowired
    private Panel_itemServiceImpl piService;

    /**
     * 查找所有panel_item
     * @return
     */
    @RequestMapping(value = "/panel_item", method = RequestMethod.GET)
    public List<Panel_Item> findAll() {
        return piService.findAll();
    }

    /**
     * 通过id查找panel_item
     */
    @RequestMapping(value = "/panel_item/findById/{id}", method = RequestMethod.GET)
    public Panel_Item findById(int id) {
        return piService.findById(id);
    }


    /**
     * 增加panel_item
     */
    @RequestMapping(value = "/panel_item/add", method = RequestMethod.POST)
    public int add(Panel_Item pi) {
        return piService.add(pi);
    }

    /**
     * 修改panel_item
     */
    @RequestMapping(value = "/panel_item/update", method = RequestMethod.PUT)
    public int update(Panel_Item pi) {
        return piService.update(pi);
    }

    /**
     * 删除panel_item
     */
    @RequestMapping(value = "/panel_item/delete", method = RequestMethod.DELETE)
    public int delete(int id) {
        return piService.delete(id);
    }

    /**
     * 删除所有关系
     */
    @RequestMapping(value = "/panel_item/deleteAll", method = RequestMethod.DELETE)
    public int deleteAll(int id) {
        return piService.deleteAll(id);
    }
}
