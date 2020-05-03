package com.qinglong.todo.controller;

import com.qinglong.todo.entity.Item;
import com.qinglong.todo.entity.Panel;
import com.qinglong.todo.entity.PanelItem;
import com.qinglong.todo.service.ItemService;
import com.qinglong.todo.service.PanelItemService;
import com.qinglong.todo.service.PanelService;
import com.qinglong.todo.service.impl.ItemServiceImpl;
import com.qinglong.todo.service.impl.PanelItemServiceImpl;
import com.qinglong.todo.service.impl.PanelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 廖高兴
 */
@Controller
public class PanelItemController {
    @Autowired
    private PanelItemService piService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private PanelService panelService;

    /**
     * 查找所有panel_item
     *
     * @return 返回Panel_Item的list集合
     */
    @RequestMapping(value = "/panelItem", method = RequestMethod.GET)
    public ModelAndView findAll() {
        ModelAndView model=new ModelAndView("success");
       List<PanelItem> panelItemList=  piService.findAll();
       model.addObject("panelItemList",panelItemList);
       return model;
    }

    /**
     * 通过id查找panel_item
     */
    @RequestMapping(value = "/panelItem/{id}", method = RequestMethod.GET)
    public ModelAndView findById(@PathVariable  int id) {
        ModelAndView model=new ModelAndView("success");
       PanelItem panelItem= piService.findById(id);
       model.addObject("panelItem",panelItem);
       return model;
    }


    /**
     * 增加panel_item
     */
    @RequestMapping(value = "/panelItem", method = RequestMethod.POST)
    public ModelAndView add(PanelItem pi) {
        ModelAndView model=new ModelAndView("success");
        piService.add(pi);
        PanelItem p=piService.findById(pi.getId());
        model.addObject("pi",p);
        return model;
    }
    /**
     * 修改panel_item
     */
    @RequestMapping(value = "/panelItem", method = RequestMethod.PUT)
    public String update(PanelItem panelItem) {
     piService.update(panelItem);
     return "success";
    }

    /**
     * 删除panel_item
     */
    @RequestMapping(value = "/panelItem/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
         piService.delete(id);
         return "success";
    }

    /**
     * 删除所有关系
     */
    @RequestMapping(value = "/panelItem", method = RequestMethod.DELETE)
    public int deleteAll(int id) {
        return piService.deleteAll(id);
    }

    @RequestMapping(value="/panelitem",method = RequestMethod.GET)
    public String findPanelAndItem(){
        ModelAndView model=new ModelAndView("index");
        Map<Panel,List<Item>> map=new HashMap<>();
        List<Panel> panelList=panelService.findAll();
        for(int i=0;i<panelList.size();i++){
            int panelId=panelList.get(i).getId();
            List<Item> itemList=piService.findItemByPanel(panelId);
            map.put(panelList.get(i),itemList);
        }
        model.addObject("mapAll",map);
        return map.toString();
    }
}
