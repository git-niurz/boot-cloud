package com.fh.shop.brand.biz;


import com.fh.common.ServerResponse;
import com.fh.shop.brand.api.model.Brand;

import java.util.List;

public interface IBrandService {

    public ServerResponse<List<Brand>> findBrandList();

    ServerResponse addBrand(Brand brand);

    ServerResponse deleteBrand(Integer id);

    ServerResponse updateBrand(Brand brand);

    ServerResponse<Brand> findBrand(Integer id);
}
