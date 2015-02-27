package com.beliefbetrayal.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/*ʹ�ö�̬������Ҫʵ��InvocationHandler�ӿ�*/
public class ArithmeticCalculatorInvocationHandler implements InvocationHandler
{
	/*Ҫ����Ķ��󣬶�̬����ֻ��������ʱ��֪������˭�����Զ���ΪObject���ͣ����Դ����������*/
	private Object target = null;
	
	/*ͨ�����캯������ԭ����*/
	public ArithmeticCalculatorInvocationHandler(Object target)
	{
		this.target = target;
	}

	/*InvocationHandler�ӿڵķ�����proxy��ʾ����method��ʾԭ���󱻵��õķ�����args��ʾ�����Ĳ���*/
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		/*ԭ���󷽷�����ǰ������־��Ϣ*/
		System.out.println("the method ["+method.getName()+"]"+"begin with args ("+Arrays.toString(args)+")");
		
		Object result = method.invoke(this.target, args);
		
		/*ԭ���󷽷����ú�����־��Ϣ*/
		System.out.println("the method ["+method.getName()+"]"+"end with result ("+result+")");
		
		return result;
	}
	
	/*��ȡ������*/
	public Object getProxy()
	{
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
	}
}
