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

    @Test
    public void testMyException() {
        String[] sexs = { "男性", "女性", "中性" };
        for (int i = 0; i < sexs.length; i++) {
            if ("中性".equals(sexs[i])) {
                throw new MyException("你全家都是中性！");// 此处在junit里打印
            } else {
                System.out.println(sexs[i]);
            }
        }
    }
}
