package com.devd.spring.bookstorecommons.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: Ankit Agrawal, Date : 2019-07-02
 */
@FeignClient("bookstore-order-service")
public interface OrderFeignClient {


}
