package com.fh.shop.product.biz;

import com.fh.common.ServerResponse;
import com.fh.shop.product.po.Product;

public interface IProductService {

    public ServerResponse addProduct(Product product);

    ServerResponse findList();


}
