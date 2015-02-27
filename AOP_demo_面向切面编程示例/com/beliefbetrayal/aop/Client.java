package com.beliefbetrayal.aop;

public class Client
{
	public static void main(String[] args) throws Exception
	{
		/*��ô���*/
		Calculator arithmeticCalculatorProxy = (Calculator)new ArithmeticCalculatorInvocationHandler(
				 new ArithmeticCalculator()).getProxy();
		
		Calculator argValidatorProxy = (Calculator)new ArithmeticCalculatorArgsInvocationHandler(arithmeticCalculatorProxy).getProxy();

		/*����add����*/
		argValidatorProxy.add(-10, 10);
	}
}
