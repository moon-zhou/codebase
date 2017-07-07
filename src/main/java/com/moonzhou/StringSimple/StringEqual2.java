package com.moonzhou.StringSimple;

import org.junit.Assert;
import org.junit.Test;

public class StringEqual2 {
    
    @Test
    public void equalTrue() {
        String str0 = new String("123");
        String str1 = "123";

        Assert.assertEquals(str0.hashCode(), str1.hashCode());
        Assert.assertFalse(str0 == str1);
    }
}
