package com.moonzhou.enumSimple;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author moon-zhou
 * @since 2017-05-26
 *
 */
public class CustomedColorTest {

    @Test
    public void outCustomedColor() {
        // 输出某一枚举的值
        Assert.assertNotNull(CustomedColor.C_RED.getName());
        Assert.assertNotNull(CustomedColor.C_GREEN.getName());
        
        Assert.assertNotEquals("测试的值是不相等的", "C_RED", CustomedColor.C_RED);
        Assert.assertEquals("测试的值是不相等的", "C_RED", CustomedColor.C_RED.toString());

        // 遍历所有的枚举
        for (CustomedColor color : CustomedColor.values()) {
            System.out.println(color + "  name: " + color.getName() + "  index: " + color.getIndex());
        }
        
        System.out.println();
        
        for (CustomedColor color : CustomedColor.values()) {
            System.out.println(color);
        }
    }
}
