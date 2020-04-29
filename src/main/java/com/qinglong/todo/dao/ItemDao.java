package com.qinglong.todo.dao;

import com.qinglong.todo.entity.Item;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 * @author 廖高兴
 */
@Mapper
public interface ItemDao {


    /**
     * 找到所有Item
     *
     * @return 返回Item的list集合
     */
    @Select("select * from item")
    @Results(
            id = "itemMap", value= {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "image", column = "image"),
            @Result(property = "description", column = "description"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "updateTime", column = "update_time")
    }
    )
    List<Item> findAll();

    /**
     * 通过id找到Item
     *
     * @param id item.id
     * @return 返回通过id查找到的Item对象
     */
    @Select("select * from item where id=#{id}")
    Item findById(int id);

    /**
     * 增加item,成功返回1失败返回0
     *
     * @param item 传入的item对象参数
     * @return 成功返回1失败返回0
     */
    @Insert("insert into item values(#{id},#{name},#{image},#{description},#{createTime},#{updateTime})")
    int add(Item item);

    /**
     * 修改item
     *
     * @param item 传入修改的item
     * @return 成功返回1失败返回0item.
     */
    @Update("update item set name=#{name},image=#{image},description=#{description},update_time=#{updateTime}  where id=#{id}")
    int update(Item item);

    /**
     * 删除item
     *
     * @param id 传入要删除的item.id
     * @return 成功返回1失败返回0
     */
    @Delete("delete from item where id=#{id}")
    int delete(int id);

    /**
     * 删除panle下的所有item
     *
     * @param panelId 传入要删除的item的对应panelId
     * @return 成功返回1失败返回0
     */
    @Delete("delete from item where id=#{panelId}")
    int deleteAll(int panelId);

    @Select("select name from item where id=2")
    String findName(int id);
}
