package com.moonzhou.thread.lockThread;

public class SynThread {

    private int count = 10;

    private Object o = new Object();
    
    public void m() {
        synchronized (o) {// 任何线程执行下面代码，必须先拿到o对象，锁定一个对象
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }
}
