package com.gaoyang.loadparm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@Controller
@MapperScan("com.gaoyang.loadparm.mapper")
public class LoadparmApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadparmApplication.class, args);
	}

}
