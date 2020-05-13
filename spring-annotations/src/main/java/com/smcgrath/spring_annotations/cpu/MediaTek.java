package com.smcgrath.spring_annotations.cpu;

import org.springframework.stereotype.Component;

import com.smcgrath.spring_annotations.interfaces.MobileProcessor;

@Component
public class MediaTek implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("Second Best CPU");
	}

}
