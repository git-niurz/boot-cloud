package com.fh.shop.category.controller;

import com.fh.common.ServerResponse;
import com.fh.shop.category.biz.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CategoryController {
    @Resource(name = "categoryService")
    private ICategoryService categoryService;

    @GetMapping("/cate/{id}")
    public ServerResponse list(@PathVariable Integer id) {
        return categoryService.findList(id);
    }

}
