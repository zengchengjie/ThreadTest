package com.zcj.ThreadTest;

/**
 * ���̺߳����߳̽�����
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
