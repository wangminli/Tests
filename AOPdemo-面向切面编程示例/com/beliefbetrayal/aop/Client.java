package com.beliefbetrayal.aop;

public class Client
{
	public static void main(String[] args) throws Exception
	{
		/*获得代理*/
		Calculator arithmeticCalculatorProxy = (Calculator)new ArithmeticCalculatorInvocationHandler(
				 new ArithmeticCalculator()).getProxy();
		
		Calculator argValidatorProxy = (Calculator)new ArithmeticCalculatorArgsInvocationHandler(arithmeticCalculatorProxy).getProxy();

		/*调用add方法*/
		argValidatorProxy.add(-10, 10);
	}
}
