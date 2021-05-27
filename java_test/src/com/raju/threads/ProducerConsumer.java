package com.raju.threads;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

	public static void main(String[] args) {

		List<Integer> buffer=new ArrayList<>();
		Thread t1=new Thread(new Producer(buffer));
		Thread t2=new Thread(new Consumer(buffer));
		t1.start();
		t2.start();
	}

}

