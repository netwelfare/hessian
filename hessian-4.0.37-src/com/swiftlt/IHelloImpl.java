package com.swiftlt;

import com.caucho.hessian.server.HessianServlet;

public class IHelloImpl extends HessianServlet implements IHello
{
	public String sayHello()
	{
		return "Hello,I from HessianService";
	}

}