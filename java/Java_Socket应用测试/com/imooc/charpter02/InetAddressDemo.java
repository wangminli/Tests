package com.imooc.charpter02;

import java.net.InetAddress;

import java.net.UnknownHostException;

import java.util.Arrays;

/*

InetAddress类

*/

public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {

		// 获取本机的InetAddress实例

		InetAddress address = InetAddress.getLocalHost();

		System.out.println("计算名：" + address.getHostName());

		System.out.println("IP地址：" + address.getHostAddress());

		byte[] bytes = address.getAddress();// 获取字节数组形式的IP地址

		System.out.println("字节数组形式的IP：" + Arrays.toString(bytes));

		System.out.println(address);// 直接输出InetAddress对象

		// 根据机器名获取InetAddress实例

		// InetAddress address2=InetAddress.getByName("laurenyang");

		InetAddress address2 = InetAddress.getByName("1.1.1.10");

		System.out.println("计算名：" + address2.getHostName());

		System.out.println("IP地址：" + address2.getHostAddress());

	}

}

/***********************
计算名：wangminlideMacBook-Pro.local
IP地址：192.168.95.14
字节数组形式的IP：[-64, -88, 95, 14]
wangminlideMacBook-Pro.local/192.168.95.14
计算名：1.1.1.10
IP地址：1.1.1.10
***********************/