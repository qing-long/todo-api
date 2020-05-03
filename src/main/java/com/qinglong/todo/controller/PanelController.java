package com.qinglong.todo.controller;

import com.qinglong.todo.entity.Panel;
import com.qinglong.todo.service.PanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 廖高兴
 */
@Controller
public class PanelController {

    @Autowired
    private PanelService panelService;

    @RequestMapping(value = "/GET", method = RequestMethod.GET)
    public String find() {
        Panel p = panelService.find();
        return p.toString();
    }

    /**
     * 查找所有panel
     *
     * @return 返回Panel集合
     */
    @RequestMapping(value = "/panel", method = RequestMethod.GET)
    public ModelAndView findAll() {
        ModelAndView model = new ModelAndView("index");
        List<Panel> panelList = panelService.findAll();
        model.addObject("panelList", panelList);
        return model;
    }

    /**
     * 通过id查找panel
     */

    @RequestMapping(value = "/panel/{id}", method = RequestMethod.GET)
    public ModelAndView findById(@PathVariable int id) {
        ModelAndView model = new ModelAndView("success");
        Panel p = panelService.findById(id);
        model.addObject("panel", p);
        return model;
    }

    /**
     * 添加panel
     */
    @RequestMapping(value = "/panel", method = RequestMethod.POST)
    public ModelAndView add(Panel p) {
        ModelAndView model = new ModelAndView("success");
        panelService.add(p);
        Panel panel = panelService.findById(p.getId());
        model.addObject("panel", panel);
        return model;
    }

    /**
     * 更新panel
     */
    @RequestMapping(value = "/panel", method = RequestMethod.PUT)
    @ResponseBody
    public String update(Panel p) {
        System.out.println(p.getId() + "," + p.getName() + "," + p.getUpdateTime() + "1111111111111111111111111111");
        panelService.update(p);
        return "success";
    }

    /**
     * 删除panel
     */
    @RequestMapping(value = "/panel/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
        panelService.delete(id);
        return "success";
    }

}
