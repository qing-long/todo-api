package com.qinglong.todo.service.impl;

import com.qinglong.todo.dao.PanelDao;
import com.qinglong.todo.entity.Panel;
import com.qinglong.todo.service.PanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanelServiceImpl implements PanelService {
    @Autowired
    private PanelDao panelDao;

    @Override
    public Panel find() {
        Panel p = panelDao.find();
        return p;
    }

    /**
     * 找到所有panel
     *
     * @return
     */
    @Override
    public List<Panel> findAll() {
        List<Panel> list = panelDao.findAll();
        return list;
    }

    /**
     * 通过id查找panel
     */
    @Override
    public Panel findById(int id) {
        return panelDao.findById(id);
    }

    /**
     * 添加panel
     */
    @Override
    public int add(Panel p) {
        return panelDao.add(p);
    }

    /**
     * 更新panel
     */
    @Override
    public int update(Panel p) {
        return panelDao.update(p);
    }

    /**
     * 通过id删除panel
     */
    @Override
    public int delete(int id) {
        return panelDao.delete(id);
    }
}
