package com.moonzhou.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解方法不能有参数。
 * 注解方法的返回类型局限于原始类型，字符串，枚举，注解，或以上类型构成的数组。
 * 注解方法可以包含默认值。
 * 注解可以包含与其绑定的元注解，元注解为注解提供信息，有四种元注解类型：
 *     @Documented – 表示使用该注解的元素应被javadoc或类似工具文档化，它应用于类型声明，类型声明的注解会影响客户端对注解元素的使用。
 *     如果一个类型声明添加了Documented注解，那么它的注解会成为被注解元素的公共API的一部分。
 *     @Target – 表示支持注解的程序元素的种类，一些可能的值有TYPE, METHOD, CONSTRUCTOR, FIELD等等。如果Target元注解不存在，那么该注解就可以使用在任何程序元素之上。
 *     @Inherited – 表示一个注解类型会被自动继承，如果用户在类声明的时候查询注解类型，同时类声明中也没有这个类型的注解，那么注解类型会自动查询该类的父类，这个过程将会不停地重复，直到该类型的注解被找到为止，或是到达类结构的顶层（Object）。
 *     @Retention – 表示注解类型保留时间的长短，它接收RetentionPolicy参数，可能的值有SOURCE, CLASS, 以及RUNTIME。
 * 
 * http://www.importnew.com/14479.html
 * 
 * @author admin
 *
 */

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    
    String author() default "Pankaj";

    String date();

    int revision() default 1;

    String comments();
}