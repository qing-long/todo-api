package com.qinglong.todo.controller;

import com.qinglong.todo.entity.Item;
import com.qinglong.todo.service.ItemService;
import com.qinglong.todo.service.PanelItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * @author 廖高兴
 */
@Controller
public class ItemController {
    private static final String PATH_NAME = "templates/index";
    @Autowired
    private ItemService itemService;
    @Autowired
    PanelItemController piController;
    @RequestMapping(value = "/item/name", method = RequestMethod.GET)
    public String findName(){
      int  id=2;
     return itemService.findName(id).toString();
    }


    @RequestMapping(value = "/item", method = RequestMethod.GET)
    public ModelAndView findAll() {
        ModelAndView model=new ModelAndView("index");
        List<Item> itemList=itemService.findAll();
        model.addObject("itemList",itemList);
        return model;
    }
    /**
     * 通过id找到Item
     */
    @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView findById(@PathVariable("id") int id) {
        ModelAndView model=new ModelAndView("success");
        Item item= itemService.findById(id);
        model.addObject("item",item);
        return model;
    }

    /**
     * 增加item,成功返回1失败返回0
     */
    @RequestMapping(value = "/item", method = RequestMethod.POST)
    public String add(Item item) {

         itemService.add(item);
         return "success";
    }

    /**
     * 修改item
     */
    @RequestMapping(value = "/item", method = RequestMethod.PUT)
    public String update(Item item) {
         itemService.update(item);
         return "success";
    }

    /**
     * 删除item
     */
    @RequestMapping(value = "/item/{id}")
    @ResponseBody
    public String delete(@PathVariable("id")int id) {
         itemService.delete(id);
         return "success";

    }

    /**
     * 删除panle下的所有item
     */
    @RequestMapping(value = "/item")
    public void deleteAll() {
        int id=1;
         itemService.deleteAll(id);
        piController.findPanelAndItem();
    }
}
