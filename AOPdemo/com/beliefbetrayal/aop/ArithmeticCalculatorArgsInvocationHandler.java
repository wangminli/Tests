package com.beliefbetrayal.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticCalculatorArgsInvocationHandler implements
		InvocationHandler
{
	/*要代理的对象，动态代理只有在运行时才知道代理谁，所以定义为Object类型，可以代理任意对象*/
	private Object target = null;
	
	/*通过构造函数传入原对象*/
	public ArithmeticCalculatorArgsInvocationHandler(Object target)
	{
		this.target = target;
	}

	/*InvocationHandler接口的方法，proxy表示代理，method表示原对象被调用的方法，args表示方法的参数*/
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
	
	/*获取代理类*/
	public Object getProxy()
	{
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
	}
	
	private void argValidtor(double arg) throws Exception
	{
		if(arg < 0)
			throw new Exception("参数不能为负数！");
	}
}
