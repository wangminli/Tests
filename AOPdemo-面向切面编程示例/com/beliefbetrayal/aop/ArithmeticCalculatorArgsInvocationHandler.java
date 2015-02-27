package com.beliefbetrayal.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticCalculatorArgsInvocationHandler implements
		InvocationHandler
{
	/*Ҫ����Ķ��󣬶�̬����ֻ��������ʱ��֪������˭�����Զ���ΪObject���ͣ����Դ����������*/
	private Object target = null;
	
	/*ͨ�����캯������ԭ����*/
	public ArithmeticCalculatorArgsInvocationHandler(Object target)
	{
		this.target = target;
	}

	/*InvocationHandler�ӿڵķ�����proxy��ʾ����method��ʾԭ���󱻵��õķ�����args��ʾ�����Ĳ���*/
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		System.out.println("begin valid method ["+method.getName()+"] with args "+Arrays.toString(args));
		
		for(Object arg : args)
		{
			this.argValidtor((Double)arg);
		}
		
		Object result = method.invoke(this.target, args);
		
		return result;
	}
	
	/*��ȡ������*/
	public Object getProxy()
	{
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
	}
	
	private void argValidtor(double arg) throws Exception
	{
		if(arg < 0)
			throw new Exception("��������Ϊ������");
	}
}
