package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		AddInterface add = new DefaultAdd();
		Assertions.assertEquals(40,add.add(10, 30));
	}

}
