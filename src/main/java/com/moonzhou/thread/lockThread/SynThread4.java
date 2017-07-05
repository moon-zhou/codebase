package com.moonzhou.thread.lockThread;

public class SynThread4 implements Runnable {
    
    private int count = 10;
    
    // synchronized代码块为原子操作，不可分
    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    public static void main(String[] args) {
        SynThread4 t = new SynThread4();
        
        for (int i = 0; i < 5; i++) {
            new Thread(t, "thread" + i).start();
        }
    }
}
