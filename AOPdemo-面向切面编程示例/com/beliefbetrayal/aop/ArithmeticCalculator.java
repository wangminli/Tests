package com.beliefbetrayal.aop;

/*计算器接口的实现类,添加记录日志功能*/
public class ArithmeticCalculator implements Calculator
{
	@Override
	public double add(double num1, double num2) throws Exception
	{
		double result = num1 + num2;
		
		return result;
	}

	@Override
	public double sub(double num1, double num2) throws Exception
	{
		double result = num1 - num2;
		
		return result;
	}

	/*示意代码 暂时不考虑除数0的情况*/
	@Override
	public double div(double num1, double num2) throws Exception
	{
		double result = num1 / num2;
		
		return result;
	}

	@Override
	public double mul(double num1, double num2) throws Exception
	{
		double result = num1 * num2;
		
		return result;
	}
}
