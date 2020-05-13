package com.smcgrath.spring_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Spring framework annotations
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();

		System.out.println("\n");

		AppleiPhone iPhone = factory.getBean(AppleiPhone.class);
		iPhone.config();
	}
}
