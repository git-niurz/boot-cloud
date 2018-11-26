package com.fh.shop.category.mapper;


import com.fh.shop.category.po.Category;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ICategoryMapper {

    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "parentId", property = "parentId"),
            @Result(column = "categoryName", property = "categoryName")
    })
    @Select("select id,parentId,categoryName from t_category where parentId=#{value}")
    public List<Category> findList(Integer id);
}
