package com.fh.shop.brand.controller;

import com.fh.common.ServerResponse;
import com.fh.shop.brand.api.BrandApi;
import com.fh.shop.brand.api.model.Brand;
import com.fh.shop.brand.biz.IBrandService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BrandController implements BrandApi {
    @Resource(name="brandService")
    private IBrandService brandService;


    @Override
    public ServerResponse<List<Brand>> list() {
        return brandService.findBrandList();
    }

    @Override
    public ServerResponse addBrand(Brand brand) {
        return brandService.addBrand(brand);
    }

    @Override
    public ServerResponse deleteBrand(Integer id) {
        return brandService.deleteBrand(id);
    }

    @Override
    public ServerResponse<Brand> findBrand(Integer id) {
        return brandService.findBrand(id);
    }


    @Override
    public ServerResponse updateBrand(Brand brand) {
        return brandService.updateBrand(brand);
    }
}
