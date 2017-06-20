package com.moonzhou.innerClass;

/**
 * 静态内部类 与类的其他成员相似，可以用static修饰内部类，这样的类称为静态内部类。 静态内部类与静态内部方法相似，只能访问外部类的static成员，不能直接访问外部类的实例变量，与实例方法，只有通过对象引用才能访问。
 * 
 * @author moon-zhou
 *
 */
public class MyOuterStatic {
    public static int x = 100;

    private String name = "moon";
    
    public static class MyInner {
        private String y = "Hello!";

        public void innerMethod() {
            System.out.println("x=" + x);
            System.out.println("y=" + y);
            
            // compile error
            //System.out.println("name = " + name);

        }

    }
    
    public static void main(String[] args) {
        // 静态内部类不通过外部实例就可以创建对象；与类变量可以通过类名访问相似
        MyOuterStatic.MyInner si = new MyOuterStatic.MyInner();
        si.innerMethod();
    }
}
