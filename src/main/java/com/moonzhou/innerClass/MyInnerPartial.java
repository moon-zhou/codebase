package com.moonzhou.innerClass;

/**
 * 局部内部类：在方法体或语句块（包括方法、构造方法、局部块或静态初始化块）内部定义的类成为局部内部类。
 * 局部内部类不能加任何访问修饰符，因为它只对局部块有效。
 * 1.局部内部类只在方法体中有效，就想定义的局部变量一样，在定义的方法体外不能创建局部内部类的对象
 * 2.在方法内部定义类时，应注意以下问题：
 *     方法定义局部内部类同方法定义局部变量一样，不能使用private、protected、public等访问修饰说明符修饰，也不能使用static修饰，但可以使用final和   abstract修饰
 *     方法中的内部类可以访问外部类成员。对于方法的参数和局部变量，必须有final修饰才可以访问。
 *     static方法中定义的内部类可以访问外部类定义的static成员
 * @author moon-zhou
 *
 */
public class MyInnerPartial {
    private int size = 5, y = 7;
    private static String name = "moon";

    public Object makeInner(int localVar) {
        final int finalLocalVar = localVar;
        
        int age = 30;
        
        // 创建内部类，该类只在makeInner（）方法有效，就像局部变量一样。在方法体外部不能创建MyInner类的对象
        class MyInner {
            int y = 4;

            public void print() {
                System.out.println(size);
                System.out.println(name);
                
                // compile error
                // System.out.println(age);
                System.out.println();
            }
            
            public String toString() {
                // compile error
                //System.out.println(age);
                
                return "OuterSize = " + size + "\nfinalLocalVar = " + finalLocalVar
                        + " " + "\nthis.y = " + this.y;
            }

        }

        MyInner inner = new MyInner();
        inner.print();
        
        return inner;

    }
    
    public static void main(String[] args) {

        Object obj = new MyInnerPartial().makeInner(47);// 创建Jubu对象obj，并调用它的makeInner（）方法，该方法返回一个
       
        // 该方法返回一个MyInner类型的的对象obj，然后调用其同toString方法。
        System.out.println(obj.toString());
        
        // compile error. can not access to the method.
        //obj.print();
    }
}

