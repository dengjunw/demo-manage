package com.dengjunwu.manage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"com.dengjunwu"})
//@ImportResource(locations={"classpath:applicationContext.xml"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Bootstrap {
    public static void main(String[] data){
        ConfigurableApplicationContext context
                = SpringApplication.run(Bootstrap.class, data);
        String[] activeProfiles
                = context.getEnvironment().getActiveProfiles();

        log.info("{} profile is active",
                Arrays.toString(activeProfiles));
    }
}
