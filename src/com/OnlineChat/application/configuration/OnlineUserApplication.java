package com.OnlineChat.application.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.OnlineChat.application.repository.OnlineUserRepository;

@Configuration
@SpringBootApplication
@ComponentScan(basePackages="com.OnlineChat.application.*")
@EntityScan(basePackages="com.OnlineChat.application.bean")
public class OnlineUserApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineUserApplication.class, args);
	}
	
	
}
