package com.qinglong.todo.service.impl;

import com.qinglong.todo.dao.PanelDao;
import com.qinglong.todo.entity.Panel;
import com.qinglong.todo.service.PanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 84647
 */
@Service
public class PanelServiceImpl implements PanelService {
    @Autowired
    private PanelDao panelDao;

    /**
     * 测试数据是否流通
     *
     * @return 返回数据到网页上
     */
    @Override
    public Panel find() {
        return panelDao.find();
    }

    /**
     * 找到所有panel
     *
     * @return 返回超找到的panel集合
     */
    @Override
    public List<Panel> findAll() {
        return panelDao.findAll();
    }

    /**
     * 通过id查找Panel
     *
     * @param id Panel。id
     * @return 返回找到的Panel
     */
    @Override
    public Panel findById(int id) {
        return panelDao.findById(id);
    }

    /**
     * 添加panel
     *
     * @param panel 传入panel对象
     * @return 成功返回1失败返回0
     */
    @Override
    public int add(Panel panel) {
        return panelDao.add(panel);
    }

    /**
     * 更新panel
     *
     * @param panel 传入要更新的panel
     * @return 成功返回1失败返回0
     */
    @Override
    public int update(Panel panel) {
        return panelDao.update(panel);
    }

    /**
     * 删除panel
     *
     * @param id 传入id
     * @return 成功返回1失败返回0
     */
    @Override
    public int delete(int id) {
        return panelDao.delete(id);
    }
}
