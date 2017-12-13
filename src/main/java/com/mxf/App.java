package com.mxf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author mengyongfei
 * @date 2017年12月13日 下午5:19:45
 * 
 */
@SpringBootApplication
@MapperScan("com.mxf.dao")
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}
