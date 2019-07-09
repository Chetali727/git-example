package com.amdocs;

public class Calculator 
{
	private double firstnumber,secondnumber,result;
	
	public double calculate(String mathExpression)
	{
		String [] Tokens=mathExpression.split(" ");
		for(String token: Tokens) 
		{
			 if(token.equals("+")) 
			 {
				 //extractInput();
			     result= firstnumber+secondnumber;
			 }
			 else if(token.equals("*")) 
			 {
				 //extractInput();
			     result= firstnumber*secondnumber;
			 }
		}
		return result;
	}

}
