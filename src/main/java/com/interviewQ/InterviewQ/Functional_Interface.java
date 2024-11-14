package com.interviewQ.InterviewQ;

public class Functional_Interface {

	public static void main(String[] args) {
		 new Thread(new Runnable() {
			 @Override
			 public void run() {
				 System.out.println("new thread created");
			 }
		 }).start();
		 
		 new Thread(()->{
			 System.out.println("new thread created");
		 }).start();

	}

}
