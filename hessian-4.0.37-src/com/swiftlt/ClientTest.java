package com.swiftlt;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

public class ClientTest
{
	public static String url = "http://localhost/HessisanWeb/Hello";

	public static void main(String[] args)
	{
		HessianProxyFactory factory = new HessianProxyFactory();
		try
		{
			IHello iHello = (IHello) factory.create(IHello.class, url);
			System.out.println(iHello.sayHello());
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
	}
}