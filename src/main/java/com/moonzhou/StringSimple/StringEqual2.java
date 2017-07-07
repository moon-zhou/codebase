package com.moonzhou.StringSimple;

import org.junit.Assert;
import org.junit.Test;

public class StringEqual2 {

    @Test
    public void equalTrue() {
        String str0 = new String("123"); // 堆中生辰对象b， 字符串池中创建字符串"123"
        String str1 = "123";// 字符串池中有"123"字符串，不再创建

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

    @Test
    public void intert() {
        String s0 = "kvill";
        String s1 = new String("kvill");
        String s2 = new String("kvill");

        Assert.assertFalse(s0 == s1);

        s1.intern();
        s2 = s2.intern(); // 把常量池中"kvill"的引用赋给s2

        Assert.assertFalse(s0 == s1);

        Assert.assertTrue(s0 == s1.intern());
        Assert.assertTrue(s0 == s2);
    }
}
