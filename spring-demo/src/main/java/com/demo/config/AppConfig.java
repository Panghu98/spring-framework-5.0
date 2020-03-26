package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 21:27 2020/2/19
 * @Modified By:
 */
@ComponentScan("com.demo")
@Configuration("config")
@EnableAspectJAutoProxy(exposeProxy = true)
public class AppConfig {

}
