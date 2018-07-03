package com.moonzhou.designPattern.staticProxy;

/**
 * 需要被代理的类 实现了一个接口Person
 * 
 * @author moon-zhou
 *
 */
public class HandsomeBoy implements Person {

	public void sayHello(String content, int age) {

		System.out.println(String.format("handsome boy say hello %s, i am %s old.", content, age));
	}

	public void sayGoodBye(boolean seeAgin, double time) {
		System.out.println(String.format("handsome boy say sayGoodBye %s %s.", time, seeAgin));
	}

}
