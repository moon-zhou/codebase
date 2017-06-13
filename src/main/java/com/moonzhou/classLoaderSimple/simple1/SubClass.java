package com.moonzhou.classLoaderSimple.simple1;

public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init");
    }
    
    static int a;

    public SubClass() {
        System.out.println("init SubClass");
    }
}
