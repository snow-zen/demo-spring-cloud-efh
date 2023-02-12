package com.example.demo.controller;

import com.example.demo.api.EchoService;
import com.example.demo.request.EchoRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @author snow-zen
 */
@Slf4j
@RestController
public class EchoController implements EchoService {
    @Override
    public String echo(EchoRequest request) throws Exception {
        if (Objects.nonNull(request.getDelay()) && request.getDelay() > 0L) {
            TimeUnit.MILLISECONDS.sleep(request.getDelay());
        }
        log.info("echo server: {}", request.getEcho());
        return request.getEcho();
    }
}
