package com.tricky.interview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*public interface callable<v>{
	
	v call() throws Exception;
}
*/

class CallableDemo implements Callable<Long> {

	int num;

	CallbleDemo(int num){
		
		this.num = num;
	}

	@override

	public Long call() throws Exception {

		long fact = 1;

		for (int count = num; count > 1; count--) {

			fact *= count;
			fact = fact * count;
		}

		return fact;

	}
}

public class CallableMain {

	public static void main(String[] args)throws ExecutionException,InterruptedException {
		
		CallableDemo c = new CallableDemo( num:5);


		ExecutorService executor = Executors.newFixedThreadPool( nThreads: 2);
		
		Future<Long>res = executor.submit(c);
		
	System.out.println(res.get());
	
	executor.shutdown();
		
	}
}
