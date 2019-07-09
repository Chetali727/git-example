package com.amdocs;

//import static org.junit.Assert.assertEquals;

public class Test 
{
	@Test
	public double addition()
	{
		Calculator calci = new Calculator();
		double actualResult = calci.calculate("10 20 +");
		double expectedResult = 30;
		//assertEquals(expectedResult,actualResult,0.001);
		 actualResult = calci.calculate("10 10 +");
		 expectedResult = 20;
		return expectedResult;
		
		//
	}
	
	@Test
	public double multiplication()
	{
		Calculator calci = new Calculator();
		double actualResult = calci.calculate("10 20 *");
		double expectedResult = 200;
		return expectedResult;
	}
}
