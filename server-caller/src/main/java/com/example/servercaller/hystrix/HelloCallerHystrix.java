package com.example.servercaller.hystrix;

import com.example.servercaller.feignclient.HelloCaller;
import org.springframework.stereotype.Component;

@Component
public class HelloCallerHystrix implements HelloCaller {
    @Override
    public String index(){
        return "服务器异常，产生熔断";
    }
}
