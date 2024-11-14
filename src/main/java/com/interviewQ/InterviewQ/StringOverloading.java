package com.interviewQ.InterviewQ;

public class StringOverloading {

	void a(String s){
		System.out.println("1");
	}
	
	void a(Object s){
		System.out.println("2");
	}
	
	void a(Integer s){
		System.out.println("3");
	}
	public static void main(String[] args) {
		StringOverloading sl= new StringOverloading();
		//sl.a(null); // this line gives compliation error as String, Object, Integer can take null, give ambigous metohod compliatin error

	}

}
