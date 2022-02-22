package com.example.servercaller.feignclient;

import com.example.servercaller.hystrix.HelloCallerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @ Author：niko
 * @ Date：2020/12/15 9:10
 * @ Description：调用application-provider的HelloController类的方法
 */

/**
 * 调用者的接口方法是被调用者方法的声明，映射路径与被调用者方法的映射路径相同
 */
@FeignClient(value = "application-provider",fallback = HelloCallerHystrix.class) //调用的服务名称 ,fallback 熔断返回
public interface HelloCaller {

    @RequestMapping("/hello/index")
    public String index();

}
