package com.moonzhou.thread.DaemonThread2;

/**
 * http://blog.csdn.net/shimiso/article/details/8964414
 * @author moon-zhou
 *
 */
public class Test {
    /**
     * 前台线程是保证执行完毕的，后台线程还没有执行完毕就退出了。
     * JRE判断程序是否执行结束的标准是所有的前台执线程行完毕了，而不管后台线程的状态，因此，在使用后台线程时候一定要注意这个问题。
     * 
     * 守护进程（Daemon）是运行在后台的一种特殊进程。它独立于控制终端并且周期性地执行某种任务或等待处理某些发生的事件。也就是说守护线程不依赖于终端，但是依赖于系统，与系统“同生共死”。那Java的守护线程是什么样子的呢。当JVM中所有的线程都是守护线程的时候，JVM就可以退出了；如果还有一个或以上的非守护线程则JVM不会退出。
     * @param args
     */
    public static void main(String[] args) {
        Thread t1 = new MyCommon();
        Thread t2 = new Thread(new MyDaemon());
        t2.setDaemon(true); // 设置为守护线程
        t2.start();
        t1.start();
    }

}

class MyCommon extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("线程1第" + i + "次执行！" + "=====================>");
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}