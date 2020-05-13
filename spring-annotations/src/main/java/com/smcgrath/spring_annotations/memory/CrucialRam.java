package com.smcgrath.spring_annotations.memory;

import org.springframework.stereotype.Component;

import com.smcgrath.spring_annotations.interfaces.RamModule;

@Component
public class CrucialRam implements RamModule {

	@Override
	public void processRam() {
		// TODO Auto-generated method stub
		System.out.println("Crucial Memory - 16GB");
	}

}
