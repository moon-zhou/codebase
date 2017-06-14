package com.moonzhou.grammarSugar;

/**
 * <p>
 * 自动装箱拆箱 http://www.importnew.com/24789.html <br/>
 * 
 * 自动装箱的时候，Java虚拟机会自动调用Integer的valueOf方法； 在自动拆箱的时候，Java虚拟机会自动调用Integer的intValue方法。这就是自动拆箱和自动装箱的原理。
 * </p>
 * 
 * @author moon-zhou
 *
 */
public class AutoPacking {

    public static void main(String[] args) {
//        initInteger();
        
        initDouble();
    }

    /**
     * 自动拆箱装箱demo
     */
    private static void packingAndUnpacking() {
        Integer integer = 10;
        int i = integer;
    }

    /**
     * Byte、Short、Integer、Long、Char这几个装箱类的valueOf()方法是以128位分界线做了缓存的，
     * 假如是128以下且-128以上的值是会取缓存里面的引用的
     * 
     * <code>
     * public static Integer valueOf(int i) {
     *     final int offset = 128;
     *     if (i >= -128 && i <= 127) // must cache
     *         return IntegerCache.cache[i + offset];
     *     return new Integer(i);
     * }
     * </code>
     */
    private static void initInteger() {
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
    }

    private static void initDouble() {
        Double d1 = 100.0;
        Double d2 = 100.0;
        Double d3 = 200.0;
        Double d4 = 200.0;

        System.out.println(d1 == d2);
        System.out.println(d3 == d4);

    }
}
