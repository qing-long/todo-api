package com.qinglong.todo.controller;

import com.qinglong.todo.entity.Panel;
import com.qinglong.todo.service.PanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PanelController {

    @Autowired
    private PanelService panelService;

    @RequestMapping(value = "/panel", method = RequestMethod.GET)
    public String find() {
        Panel p = panelService.find();
        return p.getCreateTime().toString();
    }

    /**
     * 查找所有panel
     *
     * @return
     */
    @RequestMapping(value = "/panel/findAll", method = RequestMethod.GET)
    public List<Panel> findAll() {
        return panelService.findAll();
    }

    /**
     * 通过id查找panel
     */

    @RequestMapping(value = "/panel/findById", method = RequestMethod.GET)
    public Panel findById(int id) {
        return panelService.findById(id);
    }

    /**
     * 添加panel
     */
    @RequestMapping(value = "/panel/service/add", method = RequestMethod.POST)
    public int add(Panel p) {
        return panelService.add(p);
    }

    /**
     * 更新panel
     */
    @RequestMapping(value = "/panel/service/update", method = RequestMethod.PUT)
    public int update(Panel p) {
        return panelService.update(p);
    }

    /**
     * 删除panel
     */
    @RequestMapping(value = "/panel/service/delete", method = RequestMethod.DELETE)
    public int delete(int id) {
        return panelService.delete(id);
    }
}
