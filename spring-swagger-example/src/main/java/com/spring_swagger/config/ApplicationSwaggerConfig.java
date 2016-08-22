package com.spring_swagger.config;

import org.springframework.context.annotation.Bean;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class ApplicationSwaggerConfig {

	@Bean
	public Docket addUserDocket() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
		ApiInfo apiInfo = new ApiInfo("restfule API", "API Document", "V.test", "www.google.com", "my Email", "", "");
		docket.apiInfo(apiInfo);
		return docket;
	}
}
