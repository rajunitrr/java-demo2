package com.raju.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class P implements Runnable {

	private BlockingQueue<Integer> queue;
	private int item = 1;
    private int size;
	public P(BlockingQueue<Integer> queue,int size) {
		this.queue = queue;
		this.size=size;
	}

	@Override
	public void run() {

		while(true) {

			
				System.out.println("Item pushed to queue" + item);
				try {
					queue.put(item++);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

	}
}

class C implements Runnable {

	private BlockingQueue<Integer> queue;
	private int item = 1;
    private int size;
	public C(BlockingQueue<Integer> queue,int size) {
		this.queue = queue;
		this.size=size;

	}

	@Override
	public void run() {
       int item=0;
		while(true) {

			try {
				item=queue.take();
			System.out.println("Item pulled from queue" + item);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class ProducerConsumerBQ {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		Thread t1 = new Thread(new P(queue,10));
		Thread t2 = new Thread(new C(queue,10));
		t1.start();
		t2.start();

	}

}
