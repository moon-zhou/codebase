package com.moonzhou.TypeSimple;

public class DataTypeImplicitCast {

    public static void main(String[] args) {

    }

    public static void intOverflow() {

        Long l1 = (long) (Integer.MAX_VALUE + 2);

        Long l2 = Integer.MAX_VALUE + 2L;

        System.out.println(l1);
        System.out.println(l2);
    }

    // 从小到大，可以隐式转换，数据类型将自动提升。
    // byte，short，char -->int  -->long -->float -->double
    public static void shortOverflow() {
        short s = 1;
        s+=1;
//        s = (short) (s + 1);
    }
}
