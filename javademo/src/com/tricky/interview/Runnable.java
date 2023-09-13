package com.tricky.interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runnable {

	class RunnableDemo implements Runnable{
		
		@override	
		
		public void run() {
			
			System.out.println("RunnableDemo");
			
		}
	}
	
	public class RunnableMain{
		
		public static void main(String[] args) {
			
			
			RunnableDemo r = new RunnableDemo();
			
			Thread t = new Thread(r);
			
			//t.start();
			ExecutorService executor = Executors.newFixedThreadPool(0, null)
					
					
				executor.submit(r);	
					
					executor.shutdown();
					
		}
	}
}
