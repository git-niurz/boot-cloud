package com.fh.shop.brand.api;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("fh-shop-brand-producer")
public interface BrandApiFeignClient extends BrandApi {
}
