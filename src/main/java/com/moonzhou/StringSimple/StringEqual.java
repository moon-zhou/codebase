package com.moonzhou.StringSimple;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * string equal condition
 * 
 * 在JVM中有一块区域叫做常量池，常量池中的数据是那些在编译期间被确定，并被保存在已编译的.class文件中的一些数据。
 * 除了包含所有的8种基本数据类型（char、byte、short、int、long、float、double、boolean）外，
 * 还有String及其数组的常量值，另外还有一些以文本形式出现的符号引用。
 * 
 * @author moon-zhou
 * 
 *         http://www.importnew.com/24769.html
 *
 */
public class StringEqual {

    @Test
    public void equalTrue() {
        String str0 = "123";
        String str1 = "123";

        Assert.assertTrue(str0 == str1);
    }

    @Test
    public void equalFalse() {
        String str2 = new String("234");
        String str3 = new String("234");

        Assert.assertFalse(str2 == str3);
    }

    /**
     * <p>
     * 编译后的StringTest.class文件，使用”javap -verbose StringTest”或者”javap -c StringTest”都可以，
     * 反编译一下class获取到对应的字节码：
     * </p>
     * 
     * <br />
     * 
     * <p>
     * <b>编译器每次碰到”+”的时候，会new一个StringBuilder出来，接着调用append方法，在调用toString方法，生成新字符串。</b>
     * </p>
     * 
     * <p>
     *     StringBuffer和StringBuilder原理一样，无非是在底层维护了一个char数组，每次append的时候就往char数组里面放字符而已，在最终sb.toString()的时候，用一个new String()方法把char数组里面的内容都转成String，这样，整个过程中只产生了一个StringBuilder对象与一个String对象，非常节省空间。StringBuilder唯一的性能损耗点在于char数组不够的时候需要进行扩容，扩容需要进行数组拷贝，一定程度上降低了效率。
     *     StringBuffer和StringBuilder用法一模一样，唯一的区别只是StringBuffer是线程安全的，它对所有方法都做了同步，StringBuilder是线程非安全的，所以在不涉及线程安全的场景，比如方法内部，尽量使用StringBuilder，避免同步带来的消耗。
     *     另外，StringBuffer和StringBuilder还有一个优化点，上面说了，扩容的时候有性能上的损耗，那么如果可以估计到要拼接的字符串的长度的话，尽量利用构造函数指定他们的长度。
     * </p>
     */
    @Test
    public void testStringPlus() {
        String str = "111";
        str += "222";
        str += "333";
        
        Assert.assertEquals("111222333", str);
    }
    
    @Test
    public void testStringPlus2() {
        String str = "111";
        str = str.concat("222").concat("333");
        
        Assert.assertEquals("111222333", str);
    }
    
    
    /*public String concat(String str) {
        int otherLen = str.length();
        if (otherLen == 0) {
            return this;
        }
        int len = value.length;
        char buf[] = Arrays.copyOf(value, len + otherLen);
        str.getChars(buf, len);
        return new String(buf, true);
    }*/
}
