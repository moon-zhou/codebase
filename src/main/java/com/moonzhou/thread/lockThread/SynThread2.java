package com.moonzhou.thread.lockThread;

public class SynThread2 {

    private int count = 10;

    public void m() {
        synchronized (this) {// 任何线程执行下面代码，必须先拿到this对象
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }
}
