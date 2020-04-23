package com.qinglong.todo.controller;

import com.qinglong.todo.entity.PanelItem;
import com.qinglong.todo.service.impl.PanelItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 廖高兴
 */
@RestController
public class PanelItemController {
    @Autowired
    private PanelItemServiceImpl piService;

    /**
     * 查找所有panel_item
     *
     * @return 返回Panel_Item的list集合
     */
    @RequestMapping(value = "/GET/panelItem", method = RequestMethod.GET)
    public List<PanelItem> findAll() {
        return piService.findAll();
    }

    /**
     * 通过id查找panel_item
     */
    @RequestMapping(value = "/GET/panelItem/id", method = RequestMethod.GET)
    public PanelItem findById(int id) {
        return piService.findById(id);
    }


    /**
     * 增加panel_item
     */
    @RequestMapping(value = "/POST/panelItem", method = RequestMethod.POST)
    public int add(PanelItem pi) {
        return piService.add(pi);
    }

    /**
     * 修改panel_item
     */
    @RequestMapping(value = "/PUT/panelItem", method = RequestMethod.PUT)
    public int update(PanelItem pi) {
        return piService.update(pi);
    }

    /**
     * 删除panel_item
     */
    @RequestMapping(value = "/DELETE/panelItem/id", method = RequestMethod.DELETE)
    public int delete(int id) {
        return piService.delete(id);
    }

    /**
     * 删除所有关系
     */
    @RequestMapping(value = "/DELETE/panelItem", method = RequestMethod.DELETE)
    public int deleteAll(int id) {
        return piService.deleteAll(id);
    }
}
