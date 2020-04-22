package com.qinglong.todo.dao;

import com.qinglong.todo.entity.Panel;

import java.util.List;

public interface PanelDao {
    Panel find();

    List<Panel> findAll();

    Panel findById(int id);

    int add(Panel p);

    int update(Panel p);

    int delete(int id);


}
