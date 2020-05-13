package com.smcgrath.spring_annotations.cameras;

import org.springframework.stereotype.Component;

import com.smcgrath.spring_annotations.interfaces.Camera;

@Component
public class Toshiba implements Camera {

	@Override
	public void returnCamera() {
		System.out.println("Toshiba 12MP Camera");
	}

}
