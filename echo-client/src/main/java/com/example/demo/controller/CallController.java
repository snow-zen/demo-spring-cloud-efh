package com.example.demo.controller;

import com.example.demo.api.EchoApi;
import com.example.demo.request.EchoRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author snow-zen
 */
@Slf4j
@RestController
public class CallController {

    @Autowired
    private EchoApi echoApi;

    @PostMapping("call-echo")
    public void callEcho(@RequestBody EchoRequest request) throws Exception {
        String echo = echoApi.echo(request);
        log.info("echo client: {}", echo);
    }
}
