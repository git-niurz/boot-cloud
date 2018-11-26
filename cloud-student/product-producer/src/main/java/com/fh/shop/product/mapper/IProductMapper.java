package com.fh.shop.product.mapper;


import com.fh.shop.product.po.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductMapper {

    @Insert("insert into t_product\n" +
            "\t(\n" +
            "\tproductName,\n" +
            "\tproductImage,\n" +
            "\tprice,\n" +
            "\tstock,\n" +
            "\tbrandId,\n" +
            "\tcate1,\n" +
            "\tcate2,\n" +
            "\tcate3,\n" +
            "\tcateInfo\n" +
            "\t)\n" +
            "\tvalues\n" +
            "\t(\n" +
            "\t#{productName},\n" +
            "\t#{productImage},\n" +
            "\t#{price},\n" +
            "\t#{stock},\n" +
            "\t#{brandId},\n" +
            "\t#{cate1},\n" +
            "\t#{cate2},\n" +
            "\t#{cate3},\n" +
            "\t#{cateInfo}\n" +
            "\t)")
    public void addProduct(Product product);

    @Results({
            @Result(column = "productName", property = "productName"),
            @Result(column = "price", property = "price"),
            @Result(column = "brandId", property = "brandId")
    })
    @Select("select  productName,\t\n" +
            "\tprice,\t\n" +
            "\tbrandId\n" +
            "\tfrom t_product")
    List<Product> findList();
}
