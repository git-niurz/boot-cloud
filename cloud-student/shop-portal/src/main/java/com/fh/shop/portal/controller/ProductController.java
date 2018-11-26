package com.fh.shop.portal.controller;

import com.fh.common.ServerResponse;
import com.fh.util.HttpclientUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@PropertySource("classpath:fh.properties")
public class ProductController {
    @Value("${category.list.url}")
    private String cateListUrl;
    @Value("${brand.list.url}")
    private String brandListUrl;
    @Value("${product.add.url}")
    private String productAddUrl;
    @Value("${product.list.url}")
    private String productListUrl;

    @GetMapping("/category/list")
    public ServerResponse list(Integer id) {
        String result = HttpclientUtil.sendGet( cateListUrl + id);
        System.out.println(result);
        Gson gson = new Gson();
        ServerResponse response = gson.fromJson(result, ServerResponse.class);
        return response;
    }

    @GetMapping("/brand/list")
    public ServerResponse brandList() {
        String result = HttpclientUtil.sendGet(brandListUrl);
        System.out.println(result);
        Gson gson = new Gson();
        ServerResponse response = gson.fromJson(result, ServerResponse.class);
        return response;
    }
    @PostMapping("/products")
    public ServerResponse add(@RequestParam Map product) {
        String result = HttpclientUtil.sendPost(productAddUrl, product, null);
        Gson gson = new Gson();
        ServerResponse response = gson.fromJson(result, ServerResponse.class);
        return response;
    }
    @GetMapping("/products")
    public ServerResponse productList() {
        String result = HttpclientUtil.sendGet(productListUrl);
        Gson gson = new Gson();
        ServerResponse response = gson.fromJson(result, ServerResponse.class);
        return response;
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()+":"+System.currentTimeMillis()/1000);
    }
}
