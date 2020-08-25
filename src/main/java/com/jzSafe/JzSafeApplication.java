package com.jzSafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author xiaoqichao
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class JzSafeApplication
{
    public static void main(String[] args)
    {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(JzSafeApplication.class, args);
        System.out.println("技侦安全后台启动成功");
    }
}
