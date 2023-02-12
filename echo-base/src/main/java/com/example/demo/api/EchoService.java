package com.example.demo.api;

import com.example.demo.request.EchoRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author snow-zen
 */
public interface EchoService {

    @PostMapping("/echo")
    String echo(@RequestBody EchoRequest request) throws Exception;
}
