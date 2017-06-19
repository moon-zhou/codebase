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
 * http://www.importnew.com/24769.html
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
}
