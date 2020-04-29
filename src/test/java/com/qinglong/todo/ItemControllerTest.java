package com.qinglong.todo;

import com.qinglong.todo.entity.Item;
import com.qinglong.todo.service.ItemService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import javax.annotation.Resource;
import java.util.Date;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ItemControllerTest {

    @Resource
    private ItemService itemService;


    @Test
    public void findName() {
        System.out.println(itemService.findAll());
    }

    @Test
    public void findAll() {
        System.out.println(itemService.findAll());
    }

    @Test
    public void findById() {
        System.out.println(itemService.findById(2));
    }

    @Test
    public void add() {
        Item item1 = new Item();
        item1.setId(7);
        item1.setName("hello6");
        item1.setImage("hello6");
        item1.setDescription("hello6");
        item1.setCreateTime(new Date("2018/7/7 11:11:00"));
        item1.setUpdateTime(new Date("2018/7/7 11:11:00"));
        itemService.add(item1);
    }


    @Test
    public void delete() {
        itemService.delete(5);
    }

    @Test
    public void deleteAll() {
    }
}