package com.zcj.ThreadTest;

/**
 * 子线程和主线程交替输
 * 
 * @author zcj
 *
 */
public class ThreadDemo {
	public static void main(String[] args) {
		new TestThread().start();
		while (true) {
			System.out.println(Thread.currentThread().getName() + "is running");
		}
	}
}

class TestThread extends Thread {
	@Override
	public void run() {
		super.run();
		while (true) {
			System.out.println(Thread.currentThread().getName() + "is running");
		}
	}
}
