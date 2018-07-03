package com.moonzhou.designPattern.proxy.statical;

import com.moonzhou.designPattern.proxy.HandsomeBoy;
import com.moonzhou.designPattern.proxy.Person;

/**
 * 静态代理，这个代理类也必须要实现和被代理类相同的Person接口
 * 
 * 我们根据加载被代理类的时机不同，将代理分为静态代理和动态代理。
 * 如果我们在代码编译时就确定了被代理的类是哪一个，那么就可以直接使用静态代理；
 * 如果不能确定，那么可以使用类的动态加载机制，在代码运行期间加载被代理的类这就是动态代理，比如RPC框架和Spring AOP机制。
 * 
 * @author moon-zhou
 *
 */
public class StaticProxyTest implements Person {

	private Person o;

	public StaticProxyTest(Person o) {
		this.o = o;
	}

	public static void main(String[] args) {
		// s为被代理的对象，某些情况下 我们不希望修改已有的代码，我们采用代理来间接访问
		Person s = new HandsomeBoy();
		
		// 创建代理类对象
		StaticProxyTest proxy = new StaticProxyTest(s);
		
		// 调用代理类对象的方法
		proxy.sayHello("welcome to java", 20);
		
		System.out.println("******");
		
		// 调用代理类对象的方法
		proxy.sayGoodBye(true, 100);

	}

	public void sayHello(String content, int age) {
		System.out.println("ProxyTest sayHello begin");
		
		// 在代理类的方法中 间接访问被代理对象的方法
		o.sayHello(content, age);
		
		System.out.println("ProxyTest sayHello end");
	}

	public void sayGoodBye(boolean seeAgin, double time) {
		System.out.println("ProxyTest sayHello begin");
		
		// 在代理类的方法中 间接访问被代理对象的方法
		o.sayGoodBye(seeAgin, time);
		
		System.out.println("ProxyTest sayHello end");
	}

}
