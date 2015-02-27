package com.beliefbetrayal.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/*使用动态代理需要实现InvocationHandler接口*/
public class ArithmeticCalculatorInvocationHandler implements InvocationHandler
{
	/*要代理的对象，动态代理只有在运行时才知道代理谁，所以定义为Object类型，可以代理任意对象*/
	private Object target = null;
	
	/*通过构造函数传入原对象*/
	public ArithmeticCalculatorInvocationHandler(Object target)
	{
		this.target = target;
	}

	/*InvocationHandler接口的方法，proxy表示代理，method表示原对象被调用的方法，args表示方法的参数*/
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		/*原对象方法调用前处理日志信息*/
		System.out.println("the method ["+method.getName()+"]"+"begin with args ("+Arrays.toString(args)+")");
		
		Object result = method.invoke(this.target, args);
		
		/*原对象方法调用后处理日志信息*/
		System.out.println("the method ["+method.getName()+"]"+"end with result ("+result+")");
		
		return result;
	}
	
	/*获取代理类*/
	public Object getProxy()
	{
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
	}
}
