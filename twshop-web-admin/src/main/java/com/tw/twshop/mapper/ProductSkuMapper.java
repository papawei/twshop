package com.tw.twshop.mapper;

import com.tw.twshop.entity.ProductSku;
import java.util.List;

public interface ProductSkuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_sku
     *
     * @mbg.generated
     */
    int insert(ProductSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_sku
     *
     * @mbg.generated
     */
    List<ProductSku> selectAll();
}