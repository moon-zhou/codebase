package com.moonzhou.thread.DaemonThread2;

class MyDaemon implements Runnable {
    public void run() {
        for (long i = 0; i < 9999999L; i++) {
            System.out.println("后台线程第" + i + "次执行！");
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}