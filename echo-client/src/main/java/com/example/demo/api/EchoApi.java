package com.example.demo.api;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author snow-zen
 */
@FeignClient("demo-echo-server")
public interface EchoApi extends EchoService {


}
