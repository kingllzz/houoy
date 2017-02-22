package com.houoy.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by andyzhao
 * @SpringBootApplication 标注启动配置入口，可以发现通过一个main方法启动。
 * 使用这个注解的类必须放置于最外层包中，因为默认扫描这个类以下的包。否则需要自己配置@ComponentScan。
 */
@SpringBootApplication
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class);


    }
}
