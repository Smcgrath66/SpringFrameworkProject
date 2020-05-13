package com.smcgrath.spring_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.smcgrath.spring_annotations.interfaces.Camera;
import com.smcgrath.spring_annotations.interfaces.MobileProcessor;
import com.smcgrath.spring_annotations.interfaces.RamModule;

@Component
public class AppleiPhone {

	@Autowired
	@Qualifier("hexaCore")
	MobileProcessor cpu;

	@Autowired
	@Qualifier("ldRam")
	RamModule ram;

	@Autowired
	@Qualifier("sony")
	Camera camera;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		// Print the phone properties here
		System.out.println("Following New Device Specs:\nApple iPhone 11 Pro");
		cpu.process();
		ram.processRam();
		camera.returnCamera();
	}

}
