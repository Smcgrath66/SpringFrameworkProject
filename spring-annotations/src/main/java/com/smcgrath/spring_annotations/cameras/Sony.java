package com.smcgrath.spring_annotations.cameras;

import org.springframework.stereotype.Component;

import com.smcgrath.spring_annotations.interfaces.Camera;

@Component
public class Sony implements Camera {

	@Override
	public void returnCamera() {
		System.out.println("Sony 12MP Exmor IMX365-inspired triple-lens");
	}

}
