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
// 注意，这里左边有个绿色的图标才可以
public class AppConfig {

}
