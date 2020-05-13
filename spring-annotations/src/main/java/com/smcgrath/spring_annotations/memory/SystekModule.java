package com.smcgrath.spring_annotations.memory;

import org.springframework.stereotype.Component;

import com.smcgrath.spring_annotations.interfaces.RamModule;

@Component
public class SystekModule implements RamModule {

	@Override
	public void processRam() {

		System.out.println("Systek Memory - 32GB");

	}

}
