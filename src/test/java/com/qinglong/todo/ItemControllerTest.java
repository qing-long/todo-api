package com.qinglong.todo.test;

import com.qinglong.todo.TodoApplication;
import com.qinglong.todo.service.ItemService;
import com.qinglong.todo.service.impl.ItemServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = TodoApplication.class)
class ItemControllerTest {
    @Autowired
    private ItemService itemService;

    @Test
    public void findName() {
        itemService.findAll();
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void add() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteAll() {
    }
}