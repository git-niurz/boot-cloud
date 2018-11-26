package com.fh.shop.brand.api;

import com.fh.common.ServerResponse;
import com.fh.shop.brand.api.model.Brand;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BrandApi {

    @GetMapping("/brand/list")
    public ServerResponse<List<Brand>> list();

    @PostMapping("/brand/add")
    public ServerResponse addBrand(Brand brand);

    @DeleteMapping("/brand/{id}")
    public ServerResponse deleteBrand(@PathVariable("id") Integer id);

    @GetMapping("/brand/findBrand")
    public ServerResponse<Brand> findBrand(@RequestParam("id") Integer id);

    @PutMapping("/brand/update")
    public ServerResponse updateBrand(@RequestBody Brand brand);

}
