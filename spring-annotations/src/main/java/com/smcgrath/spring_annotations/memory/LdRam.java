package com.smcgrath.spring_annotations.memory;

import org.springframework.stereotype.Component;

import com.smcgrath.spring_annotations.interfaces.RamModule;

@Component
public class LdRam implements RamModule {

	@Override
	public void processRam() {
		System.out.println("4 GB LPDDR4X RAM");
	}

}
