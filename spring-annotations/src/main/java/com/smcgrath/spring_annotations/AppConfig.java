package com.smcgrath.spring_annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.smcgrath.spring_annotations")
public class AppConfig {

	// Don't need to add Beans with annotations
//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//	};
//
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new Snapdragon();
//	}

}
