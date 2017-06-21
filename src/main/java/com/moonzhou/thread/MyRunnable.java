package com.moonzhou.thread;

class MyRunnable implements Runnable {
    private int i = 0;

    public void run(){
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}