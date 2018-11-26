package com.fh.shop.category.po;

import java.io.Serializable;

public class Category implements Serializable {
    private static final long serialVersionUID = -636474394718403882L;

    private Integer id;

    private Integer parentId;

    private String categoryName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
