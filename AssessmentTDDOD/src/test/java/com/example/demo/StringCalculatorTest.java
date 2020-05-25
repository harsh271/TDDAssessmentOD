package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.test.StringCalculator;

@SpringBootTest
public class StringCalculatorTest {
	@Test
	void testAdd_WithEmptyString() {
		StringCalculator s= new StringCalculator();
		int expected=0;
		int actual=s.add("");
		assertEquals(expected,actual,"Should return Sum 0");
	} 
	
	

}
