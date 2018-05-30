package com.mypackage;



public class ThreadTest {
	public static void main(String[] args) {
		//Thread creation, by extending thread class
		ThreadTest2 obj= new ThreadTest2();
		  obj.start();
		  for(int i =0;i<10;i++)
		  {
			  System.out.println("inside thread main");
		  }
			
		  
		  //Thread creation, by implemention Runnable interface
		  Runnable r=new MyThread();
			Thread t=new Thread(r);
			t.start();
			System.out.println("inside runnable main");
		}

}


class ThreadTest2 extends Thread{
	@Override
	public void run() {
		for(int i =0; i<10;i++) {
		System.out.println("inside the Thread Test class thread");
	}
	}	
}


class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("inside Runnable mythread");
		
	}
	
}