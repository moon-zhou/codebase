package com.moonzhou.grammarSugar;

/**
 * 泛型方法
 * @author moon-zhou
 *
 */
public class GenericMethod {

    public static void main(String[] args) {

        System.out.println(ifThenElse(true, "abc", 123.3));
    }

    /**
     * 方法也可以被泛型化，不管定义在其中的类是不是泛型化的。这意味着不用显式告诉编译器，想要T什么值：编译器只知道这些T都必须相同。
     * 
     * 静态资源不认识泛型(static方法、static变量，static块)，所以此方法的static后面返回类型T前面加了<T>，告诉static方法，后面的T是一个泛型。
     * 
     * @param b
     * @param first
     * @param second
     * @return
     */
    private static <T> T ifThenElse(boolean b, T first, T second)
    {
        return b ? first : second;
    }
}
