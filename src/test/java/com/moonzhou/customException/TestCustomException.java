package com.moonzhou.customException;

import org.junit.Test;

import com.moonzhou.customException.number.DenominatorIsZeroException;
import com.moonzhou.customException.number.Division;

public class TestCustomException {

    @Test
    public void testDivition() {
        
        Division num = new Division();

        try {
            System.out.println("商：" + num.divide(12, 0));
        } catch (DenominatorIsZeroException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
