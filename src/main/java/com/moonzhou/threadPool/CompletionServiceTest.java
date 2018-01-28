package com.moonzhou.threadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletionServiceTest {
	private ExecutorService				threadPool	= Executors.newFixedThreadPool(5);
	private CompletionService<Integer>	cs			= new ExecutorCompletionService<Integer>(threadPool);

	public void testExecutor() {
		long t1 = System.currentTimeMillis();
		// ExecutorService threadPool = Executors.newCachedThreadPool();

		int length = 0;
		for (int i = 5; i > 0; i--) {
			length++;
			final int taskID = i;
			cs.submit(new Callable<Integer>() {
				public Integer call() throws Exception {
					System.out.println(taskID + "======start");
					Thread.sleep(taskID * 1000);
					System.out.println(taskID + "======end");
					return taskID;
				}
			});
		}
		System.out.println("length=" + length);
		// 可能做一些事情
		for (int i = 0; i < length; i++) {
			try {
				System.out.println(cs.take().get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		long t2 = System.currentTimeMillis();
		System.out.println("time:" + (t2 - t1) + "ms");

		threadPool.shutdown();
	}

	public static void main(String[] args) {
		CompletionServiceTest test = new CompletionServiceTest();
		test.testExecutor();
	}
}