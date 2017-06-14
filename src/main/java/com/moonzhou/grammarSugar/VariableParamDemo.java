package com.moonzhou.grammarSugar;

/**
 * 
 * <p>可变参数demo</p>
 * 
 * <b>可变长度参数必须作为方法参数列表中的的最后一个参数且方法参数列表中只能有一个可变长度参数。</b>
 * 
 * <p>
 *     反编译：
 *     javap -verbose VariableParamDemo.class
 *     <br/>
 *     http://www.importnew.com/24780.html
 * </p>
 * 
 * <p>
 *     延伸：foreach原理(迭代器模式)
 *     <br/>
 *     
 *     1、ArrayList之所以能使用foreach循环遍历，是因为ArrayList所有的List都是Collection的子接口，
 *     而Collection是Iterable的子接口，ArrayList的父类AbstractList正确地实现了Iterable接口的iterator方法。
 *     之前我自己写的ArrayList用foreach循环直接报空指针异常是因为我自己写的ArrayList并没有实现Iterable接口
 *     
 *     2、任何一个集合，无论是JDK提供的还是自己写的，只要想使用foreach循环遍历，就必须正确地实现Iterable接口
 *     
 *     Java将对于数组的foreach循环转换为对于这个数组每一个的循环引用。
 * </p>
 * 
 * @author moon-zhou
 *
 */
public class VariableParamDemo {

    public static void main(String[] args) {
//        print("000", "111", "222", "333");
        
        String[] strs = {"000", "111", "222", "333"};
        print(strs); // 可变参数是利用数组实现的

    }

    private static void print(String... strs) {
        for (String str : strs) {
            System.out.println(str);
        }
        
        System.out.println("-------another for-------");
        
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
}
