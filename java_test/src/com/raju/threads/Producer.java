package com.raju.threads;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable{

	List<Integer> buffer;
	int MAX_SIZE=5;
	int counter=0;

	public Producer(List<Integer> buffer) {
		super();
		this.buffer = buffer;
	}
	
	@Override
	public void run() {

	while(true) {
		try {
			produce(counter++);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
	private void produce(int item) throws InterruptedException {
		
		synchronized (buffer) {
			
			while(buffer.size()==MAX_SIZE) {
				buffer.wait();
			}
			
			buffer.add(item);
			System.out.println("Produced item to buffer");
			Thread.sleep(500);
			buffer.notify();
			
		}
	}

}
