package com.qinglong.todo.service.impl;

import com.qinglong.todo.dao.PanelItemDao;
import com.qinglong.todo.entity.Item;
import com.qinglong.todo.entity.PanelItem;
import com.qinglong.todo.service.PanelItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 84647
 */
@Service
public class PanelItemServiceImpl implements PanelItemService {
    @Autowired
    private PanelItemDao piDao;

    /**
     * 查找所有panel_item
     */
    @Override
    public List<PanelItem> findAll() {
        return piDao.findAll();
    }

    /**
     * 通过id查找panel_item
     */
    @Override
    public PanelItem findById(int id) {
        return piDao.findById(id);
    }


    /**
     * 增加panel_item
     */
    @Override
    public int add(PanelItem pi) {
        return piDao.add(pi);
    }

    /**
     * 修改panel_item
     */
    @Override
    public int update(PanelItem pi) {
        return piDao.update(pi);
    }

    /**
     * 删除panel_item
     */
    @Override
    public int delete(int id) {
        return piDao.delete(id);
    }

    /**
     * 删除所有关系
     */
    @Override
    public int deleteAll(int id) {
        return piDao.deleteAll(id);
    }

    @Override
    public List<Item> findItemByPanel(int panelId){
        List<Item> list=piDao.findItemByPanel(panelId);
        return list;
    }
}
