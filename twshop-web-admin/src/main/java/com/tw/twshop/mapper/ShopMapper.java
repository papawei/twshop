package com.tw.twshop.mapper;

import com.tw.twshop.entity.Shop;
import java.util.List;

public interface ShopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbg.generated
     */
    int insert(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbg.generated
     */
    List<Shop> selectAll();
}