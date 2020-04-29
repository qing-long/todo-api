package com.qinglong.todo.dao;
import com.qinglong.todo.entity.Item;
import com.qinglong.todo.entity.PanelItem;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 * @author 廖高兴
 */
@Mapper
public interface PanelItemDao {


    /**
     * 找到所有Item
     *
     * @return 返回查找到的Panel_Item集合
     */
    @Select("select * from panel_item")
    @Results(
            id = "panelItemMap", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "panelId", column = "panel_id"),
            @Result(property = "itemId", column = "item_id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "updateTime", column = "update_time")
    }
    )
    List<PanelItem> findAll();

    /**
     * 通过id找到Item
     *
     * @param id 传入PanelItem.id
     * @return 返回通过id查找到的PanelItem
     */
    @Select("select * from panel_item where id=#{id}")
    PanelItem findById(int id);

    /**
     * 增加item,成功返回1失败返回0
     *
     * @param pi 传入PanelItem
     * @return 成功返回1失败返回0
     */
    @Insert("insert into panel_item values(#{id},#{panelId},#{itemId},#{createTime},#{updateTime})")
    int add(PanelItem pi);

    /**
     * 修改item
     *
     * @param pi 传入PanelItem
     * @return 成功返回1失败返回0
     */
    @Update("update panel_item set panel_id=#{panelId},item_id=#{itemId},update_time=#{updateTime} where id=#{id}")
    int update(PanelItem pi);

    /**
     * 删除item
     *
     * @param id 传入PanelItem.id
     * @return 成功返回1失败返回0
     */
    @Delete("delete from panel_item where id=#{id}")
    int delete(int id);

    /**
     * 删除panle下的所有item
     *
     * @param id 传入panel.id
     * @return 成功返回1失败返回0
     */
    @Delete("delete from panel_item where panel_id=#{id}")
    int deleteAll(int id);

    /**
     * 通过panel找到其下所有item
     */
    @Select("select * from item,panel_item where panel_item.panel_id=#{panelId} and item.id=panel_item.item_id")
    List<Item> findItemByPanel(int panelId);
}
