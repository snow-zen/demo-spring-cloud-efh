package com.example.demo.request;

import lombok.Data;

/**
 * @author snow-zen
 */
@Data
public class EchoRequest {

    private Long delay = 0L;

    private String echo;
}
