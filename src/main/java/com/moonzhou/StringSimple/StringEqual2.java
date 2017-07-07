package com.moonzhou.StringSimple;

import org.junit.Assert;
import org.junit.Test;

public class StringEqual2 {

    @Test
    public void equalTrue() {
        String str0 = new String("123"); // 堆中生辰对象b， 字符串池中创建字符串“123"
        String str1 = "123";// 字符串池中有“123"字符串，不再创建

        Assert.assertEquals(str0.hashCode(), str1.hashCode());
        Assert.assertFalse(str0 == str1);
    }

    @Test
    public void plusEqualTrue() {
        String s1 = "moon";
        String s2 = "moon";

        String s3 = "mo" + "on";

        Assert.assertTrue(s1 == s2);
        Assert.assertTrue(s1 == s3);
    }

    @Test
    public void plusEqualFalse() {
        String s0 = "kvill";

        String s1 = new String("kvill");

        String s2 = "kv" + new String("ill");

        Assert.assertFalse(s0 == s1);

        Assert.assertFalse(s0 == s2);

        Assert.assertFalse(s1 == s2);
    }
}
