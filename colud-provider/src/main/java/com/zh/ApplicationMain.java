package com.zh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.zh.mapper")
@EnableEurekaClient
//@EnableDiscoveryClient
@EnableTransactionManagement
public class ApplicationMain {

	public static void main(String[] args) {

		SpringApplication.run(ApplicationMain.class, args);
	}

}
