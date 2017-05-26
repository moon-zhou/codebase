package com.moonzhou.enumSimple;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author moon-zhou
 * @since 2017-05-26
 *
 */
public class ColorEnumTest {

    @Test
    public void enumEqualTest() {
        Assert.assertFalse(isRed(BasicColor.BLANK));
        Assert.assertTrue(isRed(BasicColor.RED));
    }

    public static boolean isRed(BasicColor color) {
        if (BasicColor.RED.equals(color)) {
            return true;
        }
        return false;
    }

    @Test
    public void switchCaseEnumTest() {
        Assert.assertEquals("RED", showColor(BasicColor.RED));
    }

    public static String showColor(BasicColor color) {
        String localColor = null;
        switch (color) {
        case BLANK:
            System.out.println(color);
            localColor = BasicColor.BLANK.toString();
            break;
        case RED:
            System.out.println(color);
            localColor = BasicColor.RED.toString();
            break;
        default:
            System.out.println(color);
            localColor = color.toString();
            break;
        }

        return localColor;
    }

}
