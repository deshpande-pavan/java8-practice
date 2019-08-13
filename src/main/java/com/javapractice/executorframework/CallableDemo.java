package com.javapractice.executorframework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Mycallable implements Callable<Integer> {

	int num = 0;

	public Mycallable(int num) {
		this.num = num;
	}

	public Integer call() throws Exception {

		int sum = 0;
		System.out.println(
				Thread.currentThread().getName() + " is responsible for finding sum of first " + num + " numbers. And the sum is ");
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}

		return sum;
	}
}

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Mycallable[] jobs = { new Mycallable(10), new Mycallable(20), new Mycallable(30), new Mycallable(40),
				new Mycallable(50), new Mycallable(60) };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (Mycallable job : jobs) {
			Future<Integer> f = service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
	}

}
