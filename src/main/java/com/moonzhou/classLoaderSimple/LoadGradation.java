package com.moonzhou.classLoaderSimple;

/**
 * 
 * 执行顺序可以简单记为：静态区-->非静态区-->构造方法-->使用对象...(唯一需重点注意的是静态区代码仅在该类被加载时执行一次，之后无论该类被实例化多少次，静态区代码都不会再执行！)
 * 
 * 经常静态区要去执行一些诸如加载资源之类的代码，静态变量属于类，所有该类的实例都可以对其进行访问和操作，每一个实例对同一个静态变量进行的操作都会影响到其他实例访问的该静态变量，所以对于多线程编程中，要谨慎处理，避免触发线程安全问题！
 * @author moon-zhou
 *
 */
public class LoadGradation {
    
    public static int a = 1;// 静态变量
    public String b = "a";// 非静态变量
    static {// 静态块
        a = 2;
        
        System.out.println("static block 1.");
    }

    public LoadGradation() {
        a = 6;
        b = "d";
        
        System.out.println("constructor metnod.");
    }

    {
        // 非静态块
        a = 3;
        b = "b";
        
        System.out.println("normal block 1.");
    }

    public static void main(String[] args) {
        
        System.out.println("output......");
        
        System.out.println(LoadGradation.a); // 4
        System.out.println(new LoadGradation().b); // d
        System.out.println(LoadGradation.a); // 6
    }

    static {
        // 静态块
        a = 4;
        
        System.out.println("static block 2.");
    }

    {
        // 非静态块
        a = 5;
        b = "c";
        
        System.out.println("normal block 2.");
    }

}
