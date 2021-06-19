package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Program: cloud2020
 * @Description:
 * @Author: 韩放
 * @Date: 2021/06/15 16:02:32
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customeRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_test",t -> t.path("/guonei").uri("https://news.baidu.com"));
        routes.route("path_route_test2",t -> t.path("/guoji").uri("https://news.baidu.com"));
        return routes.build();
    }

   /* @Bean
    public RouteLocator custome2RouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_test2",t -> t.path("/guoji").uri("https://news.baidu.com"));
        return routes.build();
    }*/
}
