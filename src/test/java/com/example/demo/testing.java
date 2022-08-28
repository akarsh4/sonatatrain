package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testing {


	@Test
	 void addTest() {
	helloworld h1 = new helloworld();
	Assertions.assertEquals(20,h1.add(10,10));
	}
}
