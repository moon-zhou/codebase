package com.moonzhou.classLoaderSimple;

public class NotInitialization {
    /**
     * 
     * http://www.importnew.com/18548.html
     * 
     * 为什么没有输出SubClass init。
     * 解释一下：对于静态字段，只有直接定义这个字段的类才会被初始化，因此通过其子类来引用父类中定义的静态字段，
     * 只会触发父类的初始化而不会触发子类的初始化。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
