package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.demo.helloworld;

public class Hellotest {

	@Test
	 void addTest() {
	helloworld h1 = new helloworld();
	Assertions.assertEquals(20,h1.add(10,10));
	}
	
	@Test
	void addTest1() {
		helloworld h2 = new helloworld();
		Assertions.assertEquals(85,h2.add(45, 40));
	}
	
	@Test
	void addTest3() {
		helloworld h3 = new helloworld();
		Assertions.assertEquals(85,h3.add(45, 40));
	}
}
