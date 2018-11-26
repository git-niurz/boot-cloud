package com.fh.shop.product.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fh.util.BigDecimalJackson;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductVo implements Serializable {
    private static final long serialVersionUID = -1476353960946790632L;
    private String productName;

    @JsonSerialize(using = BigDecimalJackson.class)
    private BigDecimal price;

    private String brandName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
