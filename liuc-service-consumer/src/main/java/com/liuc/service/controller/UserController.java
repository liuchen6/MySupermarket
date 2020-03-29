package com.liuc.service.controller;

import com.liuc.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("consumer/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;        //该client包含了拉取的所有服务信息

    @GetMapping
    @ResponseBody
    public User queryUserById(@RequestParam("id")int id) {
        //为使用eureka之前的调用服务的方式
//        return this.restTemplate.getForObject("http://localhost:8889/user/"+id,User.class);

        /**
         * 注册eureka之后，调用服务的方式
         */
        //根据服务名，获取服务
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("service-provider");
        //因为目前只发布了一个服务，故用get（0）获取该服务
        ServiceInstance serviceInstance = serviceInstanceList.get(0);
        //获取该服务的主机名
        String host = serviceInstance.getHost();
        //获取该服务的端口
        int port = serviceInstance.getPort();
        //访问该服务
        return this.restTemplate.getForObject("http://"+host+":"+port+"/user/"+id,User.class);
    }

}
