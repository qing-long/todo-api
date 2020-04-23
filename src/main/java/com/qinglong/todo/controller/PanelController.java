package com.qinglong.todo.controller;

import com.qinglong.todo.entity.Panel;
import com.qinglong.todo.service.PanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 廖高兴
 */
@RestController
public class PanelController {

    @Autowired
    private PanelService panelService;

    @RequestMapping(value = "/GET", method = RequestMethod.GET)
    public String find() {
        Panel p = panelService.find();
        return p.getCreateTime().toString();
    }

    /**
     * 查找所有panel
     *
     * @return 返回Panel集合
     */
    @RequestMapping(value = "/GET/panel", method = RequestMethod.GET)
    public List<Panel> findAll() {
        return panelService.findAll();
    }

    /**
     * 通过id查找panel
     */

    @RequestMapping(value = "/GET/panel/id", method = RequestMethod.GET)
    public Panel findById(int id) {
        return panelService.findById(id);
    }

    /**
     * 添加panel
     */
    @RequestMapping(value = "/POST/panel", method = RequestMethod.POST)
    public int add(Panel p) {
        return panelService.add(p);
    }

    /**
     * 更新panel
     */
    @RequestMapping(value = "/PUT/panel", method = RequestMethod.PUT)
    public int update(Panel p) {
        return panelService.update(p);
    }

    /**
     * 删除panel
     */
    @RequestMapping(value = "/DELETE/panel/id", method = RequestMethod.DELETE)
    public int delete(int id) {
        return panelService.delete(id);
    }
}
