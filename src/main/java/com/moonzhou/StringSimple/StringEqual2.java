package com.moonzhou.StringSimple;

import org.junit.Assert;
import org.junit.Test;

public class StringEqual2 {

    @Test
    public void equalTrue() {
        String str0 = new String("123");    // 堆中生辰对象b， 字符串池中创建字符串“123”
        String str1 = "123";// 字符串池中有“123”字符串，不再创建

        Assert.assertEquals(str0.hashCode(), str1.hashCode());
        Assert.assertFalse(str0 == str1);
    }
}
