package com.moonzhou.thread.DaemonThread1;

/**
 * 在Java中有两类线程：User Thread(用户线程)、Daemon Thread(守护线程)
 * 用个比较通俗的比如，任何一个守护线程都是整个JVM中所有非守护线程的保姆
 * 只要当前JVM实例中尚存在任何一个非守护线程没有结束，守护线程就全部工作；只有当最后一个非守护线程结束时，守护线程随着JVM一同结束工作。
 * Daemon的作用是为其他线程的运行提供便利服务，守护线程最典型的应用就是 GC (垃圾回收器)，它就是一个很称职的守护者。
 * User和Daemon两者几乎没有区别，唯一的不同之处就在于虚拟机的离开：如果 User Thread已经全部退出运行了，只剩下Daemon Thread存在了，虚拟机也就退出了。 因为没有了被守护者，Daemon也就没有工作可做了，也就没有继续运行程序的必要了。
 * http://blog.csdn.net/shimiso/article/details/8964414
 * 
 * 
 * daemon Thread实际应用在那里呢？举个例子，web服务器中的Servlet，容器启动时后台初始化一个服务线程，
 * 即调度线程，负责处理http请求，然后每个请求过来调度线程从线程池中取出一个工作者线程来处理该请求，从而实现并发控制的目的。
 * @author moon-zhou
 *
 */
public class TestDemo2 {

    public static void main(String[] args) throws InterruptedException

    {

        Runnable tr = new TestRunnable();

        Thread thread = new Thread(tr);

        /**
         * thread.setDaemon(true)必须在thread.start()之前设置，否则会跑出一个IllegalThreadStateException异常。你不能把正在运行的常规线程设置为守护线程。
         * 在Daemon线程中产生的新线程也是Daemon的。
         * 不要认为所有的应用都可以分配给Daemon来进行服务，比如读写操作或者计算逻辑。
         * 这点与守护进程有着明显的区别，守护进程是创建后，让进程摆脱原会话的控制+让进程摆脱原进程组的控制+让进程摆脱原控制终端的控制；所以说寄托于虚拟机的语言机制跟系统级语言有着本质上面的区别
         * 
         * 不注释的情况下：原因也很简单，直到主线程完成，守护线程仍处于1秒的阻塞状态。这个时候主线程很快就运行完了，虚拟机退出，Daemon停止服务，输出操作自然失败了。
         */
        //thread.setDaemon(true); // 设置守护线程

        thread.start(); // 开始执行分进程

    }

}