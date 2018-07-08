package com.moonzhou.thread.countDownLatchDemo.checker;

/**
 * 
 * Desc: <funtion desc> <br>
 * Detail: http://www.importnew.com/15731.html. <br>
 * Date: 2018年7月8日 下午4:31:33 <br>
 * 
 * @author moon-zhou
 * @version
 * @since 2018年7月8日
 */
public class Test {
    public static void main(String[] args)
    {
        boolean result = false;
        try {
            result = ApplicationStartupUtil.checkExternalServices();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("External services validation completed !! Result was :: "+ result);
    }
}