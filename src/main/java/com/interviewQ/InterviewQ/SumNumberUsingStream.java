package com.interviewQ.InterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumNumberUsingStream {

	public static void main(String[] args) {
		
		//java streams to sum 100 numbers
		int sum=IntStream.rangeClosed(1, 100).sum();
		System.out.println(" sum of 100 numbers "+sum);
		
		//java streams to sum of Integers
		List<Integer> intList=Arrays.asList(1,2,3,4,5);
		Integer sum1=intList.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum of integers ="+sum1);
		
	}

}
