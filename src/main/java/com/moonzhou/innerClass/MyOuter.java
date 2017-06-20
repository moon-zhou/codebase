package com.moonzhou.innerClass;

/**
 * 
 * inner class simple demo
 * 
 * @author moon-zhou
 *
 */
public class MyOuter {
    private int x = 100;

    // 创建内部类
    class MyInner {
        private String y = "Hello!";

        public void innerMethod() {
            System.out.println("内部类中 String = " + y);
            System.out.println("外部类中的x = " + x);// 直接访问外部类中的实例变量x
            outerMethod();
            System.out.println("x is " + MyOuter.this.x);
        }
    }

    public void outerMethod() {
        x++;
    }

    public MyInner makeInner() {
        // 在外部类方法中创建内部类实例
        MyInner in = new MyInner();
        return in;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        directCall();

        System.out.println();
        System.out.println();

        indirectCall();
    }

    public static void directCall() {
        MyOuter mo = new MyOuter();

        // 使用外部类构造方法创建mo对象
        MyOuter.MyInner inner = mo.new MyInner();// 常规内部类需要通过外部类的实例才能创建对象，与实例变量需要通过对象来访问相似

        // 创建inner对象
        inner.innerMethod();

        mo.outerMethod();

        inner.innerMethod();
    }

    public static void indirectCall() {
        MyOuter mo = new MyOuter();

        MyOuter.MyInner inner = mo.makeInner();

        inner.innerMethod();

        mo.outerMethod();

        inner.innerMethod();
    }
}