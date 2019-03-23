package com.moonzhou.collectionObj;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Desc: ArrayList里存储对象测试 <br>
 * Detail: 动态修改对象值，直接取即可生效. <br>
 * Date: 2019年3月23日 上午10:43:13 <br>
 * 
 * @author moon-zhou
 * @version 
 * @since 2019年3月23日
 */
public class ListModifyTest {
    
    public void test() {
        List<A> list = new ArrayList<A>();
        
        A a1 = new A();
        a1.setA(1);
        list.add(a1);
        
        A a2 = new A();
        a2.setA(2);
        list.add(a2);
        
        A a3 = new A();
        a3.setA(3);
        list.add(a3);
        
        A a4 = new A();
        a4.setA(4);
        list.add(a4);
        
        for (A a : list) {
            if (a.getA() % 2 == 0) {
                a.setA(a.getA() * 10);
            }
        }
        
        for (A a : list) {
            System.out.println(a.getA());
        }
    }
    
    public static void main(String[] args) {
        ListModifyTest test = new ListModifyTest();
        test.test();
    }
    

    class A {
        private int a;

        public A() {
            super();
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
        
    }
}
