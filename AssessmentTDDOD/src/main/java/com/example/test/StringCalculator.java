package com.example.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringCalculator {
	Logger logger = LoggerFactory.getLogger(StringCalculator.class);
	public int add(String numbers) {
		int sum = 0;
		try {
			String[] number=numbers.split(",");
			for (String num : number) {
				int i=Integer.parseInt(num);
				sum=sum+i;
			}
		} catch (Exception e) {
			logger.warn("Invalid Input");
		}
		return sum;
	}
}
