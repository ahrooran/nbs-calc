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

}
