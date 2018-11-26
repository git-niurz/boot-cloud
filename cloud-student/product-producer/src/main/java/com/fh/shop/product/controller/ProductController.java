package com.fh.shop.product.controller;

import com.fh.common.ServerResponse;
import com.fh.shop.product.biz.IProductService;
import com.fh.shop.product.po.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProductController {
    @Resource(name="productService")
    private IProductService productService;

    @PostMapping("/product/add")
    public ServerResponse add(Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/product/list")
    public ServerResponse findList() {
       return productService.findList();
    }
}
