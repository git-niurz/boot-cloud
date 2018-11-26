package com.fh.shop.product.biz;

import com.fh.common.ServerResponse;
import com.fh.shop.brand.api.BrandApiFeignClient;
import com.fh.shop.brand.api.model.Brand;
import com.fh.shop.product.mapper.IProductMapper;
import com.fh.shop.product.po.Product;
import com.fh.shop.product.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("productService")
@Transactional(rollbackFor = Exception.class)
public class IProductServiceImpl implements IProductService {
    @Autowired
    private IProductMapper productMapper;
    @Autowired
    private BrandApiFeignClient brandApiFeignClient;

    @Override
    public ServerResponse addProduct(Product product) {
        productMapper.addProduct(product);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse findList() {
        // 获取产品列表
        List<Product> productList = productMapper.findList();
        List<ProductVo> productVoList = new ArrayList<>();
        for (Product product : productList) {
            ProductVo productVo = new ProductVo();
            productVo.setProductName(product.getProductName());
            productVo.setPrice(product.getPrice());
            Integer brandId = product.getBrandId();
            // 调用品牌微服务
            ServerResponse<Brand> response = brandApiFeignClient.findBrand(brandId);
            Brand data = response.getData();
            String brandName = data.getBrandName();
            productVo.setBrandName(brandName);
            productVoList.add(productVo);
        }
        ServerResponse<List<ProductVo>> success = ServerResponse.success(productVoList);
        return success;
    }
}
