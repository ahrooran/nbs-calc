package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTwoNumbersTogetherTest() {
		Calculator calc = new Calculator();
		int result = calc.add(2,2);
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void subtractTwoNumbersTogetherTest() {
		Calculator calc = new Calculator();
		int result = calc.subtract(4,2);
		Assert.assertEquals(2, result);
	}
	
	@Test
	public void divideTwoNumbersTogetherTest() {
		Calculator calc = new Calculator();
		int result = calc.divide(4,2);
		Assert.assertEquals(2, result);
	}
	
	@Test
	public void multiplyTwoNumbersTogetherTest() {
		Calculator calc = new Calculator();
		int result = calc.multiply(4,2);
		Assert.assertEquals(8, result);
	}
	

}
