package com.qinglong.todo;

import com.qinglong.todo.entity.PanelItem;
import com.qinglong.todo.service.PanelItemService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.Date;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class PanelItemControllerTest {

    @Autowired
    private PanelItemService piService;

    @Test
    void findAll() {
        System.out.println(piService.findAll());
    }

    @Test
    void findById() {
        System.out.println(piService.findById(1));
    }

    @Test
    void add() {
        Date t = new Date();
        PanelItem p1 = new PanelItem();
        p1.setId(2);
        p1.setPanelId(2);
        p1.setItemId(2);
        p1.setCreateTime(t);
        p1.setUpdateTime(t);
        piService.add(p1);
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
        piService.delete(2);
    }

    @Test
    void deleteAll() {
    }
}