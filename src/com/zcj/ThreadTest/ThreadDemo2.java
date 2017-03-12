package com.zcj.ThreadTest;

public class ThreadDemo2 {
	public static void main(String[] args) {
		TestThread2 thread1 = new TestThread2();
		TestThread2 thread2 = new TestThread2();
		thread1.start();
		thread2.start();
	}
}

class TestThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "	" + i);
		}
	}
}