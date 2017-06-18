package com.moonzhou.grammarSugar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * 泛型
 * 
 * 1、类型安全。类型错误现在在编译期间就被捕获到了，而不是在运行时当作java.lang.ClassCastException展示出来， 将类型检查从运行时挪到编译时有助于开发者更容易找到错误，并提高程序的可靠性 2、消除了代码中许多的强制类型转换，增强了代码的可读性 3、为较大的优化带来了可能
 * 
 * @author moon-zhou
 *
 * http://www.importnew.com/22529.html
 * 
 */
public class GenericBaseDemo {

    public static void main(String[] args) {
//        typeNotExact();
        
        useWildcard();
    }

    @Test
    public void typeEqual() {
        List<String> stringList = new ArrayList<String>();
        List<Integer> integerList = new ArrayList<Integer>();

        /**
         * <b> 泛型是什么并不会对一个对象实例是什么类型的造成影响，所以，通过改变泛型的方式试图定义不同的重载方法也是不可以的 </b>
         */
        Assert.assertEquals(stringList.getClass(), integerList.getClass());
    }

    /**
     * 尽量使用精确的类型定义泛型，除非必要，否则不要写一个接口或者父类上去
     * 
     * list中的是一个Number类型，往里面添加的是Integer与Double，这样导致get出来的元素也都是Number类型的，失去了子类扩展的功能。
     * 如果要让子类变为Interger和Double也可以，(Integer)list.get(0)和(Double)list.get(1)强转就可以了，
     * 但是这样不就失去了泛型的意义了吗？所以，尽量用精确的类型去定义泛型。
     */
    private static void typeNotExact() {
        List<Number> list = new ArrayList<Number>();
        list.add(4);
        list.add(2.2);
        for (Number number : list)
            System.out.println(number);
    }
    
    private static void useWildcard()
    {
        List<String>  stringList = Arrays.asList("aaa", "bbb", "ccc");
        List<Integer> integerList = Arrays.asList(111, 222, 333);
     
        printList(stringList);
        printList(integerList);
    }
    
    /**
     * 通配符
     * 
     * <?>是类型通配符，表示是任何泛型的父类型，这样List<Object>、List<String>这些都可以传递进入printList方法中，
     * 注意这里的参数不能写成List<E>，这样就报错了，E未定义。
     * 当然<?>也可以不加，不过这样会有警告：如果传递一个List<E>给List，相当于传递一个只承诺将它当作List（原始类型）的方法，
     * 这将会破坏使用泛型的类型安全。
     * 
     * <br/>
     * <b>再注意一点，使用类型通配符，只能从中检索元素，不能添加元素。</b>
     * 
     * @param l
     */
    private static void printList(List<?> l)
    {
        for (Object o : l)
            System.out.println(o);
    }
}
