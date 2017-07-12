package com.moonzhou.hashcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class StudentEqualsTest {
    
    public static void main(String[] args) {
//        notOverrideEqual();
        
//        overrideEquals();
        
//        overrideHashCode();
        
        overrideAll();
        
    }
    
    /**
     * 未重写equals方法
     * Student类没有覆盖equals方法，stu1调用equals方法实际上调用的是Object的equals方法。
     * 所以采用对象内存地址是否相等来判断对象是否相等。因为是两个新对象所以对象的内存地址不相等，所以stu1.equals(stu2) 是false。
     */
    public static void notOverrideEqual() {
        
        LinkedList<Student> list = new LinkedList<Student>();
        Set<Student> set = new HashSet<Student>();
        Student stu1 = new Student(3, "张三");
        Student stu2 = new Student(3, "张三");
        
        System.out.println("stu1 == stu2 : " + (stu1 == stu2));
        System.out.println("stu1.equals(stu2) : " + stu1.equals(stu2));
        list.add(stu1);
        list.add(stu2);
        System.out.println("list size:" + list.size());

        set.add(stu1);
        set.add(stu2);
        System.out.println("set size:" + set.size());
    }

    /**
     * 仅仅重写了equals未重写hashCode
     * 因为StudentOverrideEquals两个对象的age和name属性相等，而且又是通过覆盖equals方法来判断的，所示stu1.equals(stu2) 为true。
     */
    public static void overrideEquals() {
        LinkedList<StudentOverrideEquals> list = new LinkedList<StudentOverrideEquals>();
        Set<StudentOverrideEquals> set = new HashSet<StudentOverrideEquals>();
        StudentOverrideEquals stu1 = new StudentOverrideEquals(3, "张三");
        StudentOverrideEquals stu2 = new StudentOverrideEquals(3, "张三");
        
        System.out.println("stu1 == stu2 : " + (stu1 == stu2));
        System.out.println("stu1.equals(stu2) : " + stu1.equals(stu2));
        list.add(stu1);
        list.add(stu2);
        System.out.println("list size:" + list.size());

        set.add(stu1);
        set.add(stu2);
        System.out.println("set size:" + set.size());
    }
    
    /**
     * 只重写了hashCode
     * 我们并没有覆盖equals方法只覆盖了hashCode方法，两个对象虽然hashCode一样，
     * 但在将stu1和stu2放入set集合时由于equals方法比较的两个对象是false，所以就没有在比较两个对象的hashcode值。
     */
    public static void overrideHashCode() {
        LinkedList<StudentOverrideHashCode> list = new LinkedList<StudentOverrideHashCode>();
        Set<StudentOverrideHashCode> set = new HashSet<StudentOverrideHashCode>();
        StudentOverrideHashCode stu1 = new StudentOverrideHashCode(3, "张三");
        StudentOverrideHashCode stu2 = new StudentOverrideHashCode(3, "张三");
        
        System.out.println("stu1 == stu2 : " + (stu1 == stu2));
        System.out.println("stu1.equals(stu2) : " + stu1.equals(stu2));
        list.add(stu1);
        list.add(stu2);
        System.out.println("list size:" + list.size());

        set.add(stu1);
        set.add(stu2);
        System.out.println("set size:" + set.size());
        
        System.out.println("stu1 hashcode: " + stu1.hashCode());
        System.out.println("stu2 hashcode: " + stu2.hashCode());
    }
    
    /**
     * 重写了equals和hashCode
     */
    public static void overrideAll() {
        LinkedList<StudentOverrideAll> list = new LinkedList<StudentOverrideAll>();
        Set<StudentOverrideAll> set = new HashSet<StudentOverrideAll>();
        StudentOverrideAll stu1 = new StudentOverrideAll(3, "张三");
        StudentOverrideAll stu2 = new StudentOverrideAll(3, "张三");
        
        System.out.println("stu1 == stu2 : " + (stu1 == stu2));
        System.out.println("stu1.equals(stu2) : " + stu1.equals(stu2));
        list.add(stu1);
        list.add(stu2);
        System.out.println("list size:" + list.size());

        set.add(stu1);
        set.add(stu2);
        System.out.println("set size:" + set.size());
        
//        System.out.println("stu1 hashcode: " + stu1.hashCode());
//        System.out.println("stu2 hashcode: " + stu2.hashCode());
    }
}