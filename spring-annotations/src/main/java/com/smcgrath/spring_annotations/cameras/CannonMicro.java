package com.smcgrath.spring_annotations.cameras;

import org.springframework.stereotype.Component;

import com.smcgrath.spring_annotations.interfaces.Camera;

@Component
public class CannonMicro implements Camera {

	@Override
	public void returnCamera() {
		System.out.println("Cannon Micro 12MP");
	}

}
