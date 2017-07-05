package com.moonzhou.thread.lockThread;

public class SynThread3 {

    private static int count = 10;

    public synchronized static void m() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }
    
    public static void mm() {
        synchronized (SynThread3.class) { // 不能写synchronized (this)，静态方法不能new出对象访问
            count--;
        }
    }
}
