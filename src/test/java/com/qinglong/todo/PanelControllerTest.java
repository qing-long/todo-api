package com.qinglong.todo;

import com.qinglong.todo.entity.Panel;
import com.qinglong.todo.service.PanelService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.Date;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class PanelControllerTest {

    @Autowired
    private PanelService panelService;


    @Test
    void findAll() {
        System.out.println(panelService.findAll());

    }

    @Test
    void findById() {
        System.out.println(panelService.findById(1));
    }

    @Test
    void add() {
        Date t = new Date();
        Panel p1 = new Panel();
        p1.setId(2);
        p1.setName("hello2");
        p1.setCreateTime(t);
        p1.setUpdateTime(t);
        panelService.add(p1);
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
        panelService.delete(2);
    }
}