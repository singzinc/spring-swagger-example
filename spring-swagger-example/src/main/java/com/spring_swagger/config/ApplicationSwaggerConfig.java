package com.spring_swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ApplicationSwaggerConfig {

	@Bean
	public Docket addUserDocket() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
		//ApiInfo apiInfo = new ApiInfo("restfule API", "API Document", "V.test", "www.google.com", "sing.zinc.hk@gmail.com", "", "");

		Contact contact = new Contact("sing", "", "sing.zinc.hk@gamil.com");

		//	ApiInfo apiInfo = new ApiInfo("restful API", "API Document", "V.test", "www.google.com", "my Email", "aaaa", "bbbb");
		ApiInfo apiInfo = new ApiInfo("restful API - title", "WEB API doc -description", "V0.0.1", "", contact, "", "");

		docket.apiInfo(apiInfo);
		return docket;
	}
}
