package com.javapractice.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {

	String name;

	PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " Job started by Thread:" + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println(name + " Job completed by thread:" + Thread.currentThread().getName());
	}

}

public class ExecutorDemo {

	public static void main(String[] args) {
		PrintJob[] jobs = { new PrintJob("Pavan"), new PrintJob("kiran"), new PrintJob("shiva"), new PrintJob("ved"),
				new PrintJob("vyas"), new PrintJob("Karan") };

		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintJob job : jobs) {
			service.submit(job);
		}
		if (!service.isShutdown())
			service.shutdown();
	}

}
