package com.erick.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @Description :
 * @Param
 * @author : Erick
 * @version : 1.0
 * @Date : 2018-10-30
 */
@SpringBootApplication
public class SpringcloudGatewayApplication {

    /**
     * @Description :不通过配置文件采用配置的方式实现路由转发
     * @Param [args]
     * @author : Erick
     * @version : 1.0
     * @Date : 2018-10-26
     */
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route(r->r.path("/gateway/baidu")
//                .uri("http://baidu.com"))
//                .build();
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayApplication.class, args);
    }
}
