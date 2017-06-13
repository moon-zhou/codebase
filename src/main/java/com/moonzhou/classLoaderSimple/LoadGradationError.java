package com.moonzhou.classLoaderSimple;

/**
 * 错误的加载示例
 * 
 * 初始化阶段是执行类构造器<clinit>()方法的过程.
 *
 * clinit>()方法是由编译器自动收集类中的所有类变量的赋值动作和静态语句块static{}中的语句合并产生的，
 * 编译器收集的顺序是由语句在源文件中出现的顺序所决定的，静态语句块只能访问到定义在静态语句块之前的变量，
 * 定义在它之后的变量，在前面的静态语句块可以赋值，但是不能访问。
 * 
 * @author moon-zhou
 *
 */
public class LoadGradationError {
    /*static {
        i = 0;
        System.out.println(i); // 这句编译器会报错：Cannot reference a field before it is defined（非法向前应用）
    }
    static int i = 1;*/
}
