package com.beliefbetrayal.aop;

/*�������ӿڵ�ʵ����,��Ӽ�¼��־����*/
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

	/*ʾ����� ��ʱ�����ǳ���0�����*/
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
