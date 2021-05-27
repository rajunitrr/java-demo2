package com.raju.threads;

import java.util.List;

public class Consumer implements Runnable{

	List<Integer> buffer;
	int MAX_SIZE=5;
	int counter=0;

	public Consumer(List<Integer> buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {

	while(true) {
		try {
			consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
	private void consume() throws InterruptedException {
		
		synchronized (buffer) {
			
			while(buffer.size()==0) {
				buffer.wait();
			}
			
			
			System.out.println("Consumed Item from  buffer"+buffer.get(0));
			Thread.sleep(500);
			buffer.notify();
			
		}
	}

}
