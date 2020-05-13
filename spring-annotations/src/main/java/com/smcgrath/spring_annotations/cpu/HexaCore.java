package com.smcgrath.spring_annotations.cpu;

import org.springframework.stereotype.Component;

import com.smcgrath.spring_annotations.interfaces.MobileProcessor;

@Component
public class HexaCore implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("Hexa-core (2x high power Lightning cores at 2.66GHz)");
	}
}
