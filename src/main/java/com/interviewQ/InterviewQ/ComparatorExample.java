package com.interviewQ.InterviewQ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	
	String name;
	Integer marks;
	
	Student(String name, Integer marks){
		this.name=name;
		this.marks=marks;
	}
	
}
class SortStudent implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		if(s1.marks > s2.marks) {
			return 1;
		}else {
			return 0;
		}
		 //return s1.marks - s2.marks; // ascending order of marks
		// return s2.marks - s1.marks; // descending order of marks
	}	
	
}

public class ComparatorExample{
	
	public static void main(String[] args) {
		
		Student s1= new Student("Sudhir", 120);
		Student s2= new Student("Soham", 125);
	    List<Student> ar= new ArrayList<Student>();
		ar.add(s1);
		ar.add(s2);
		
		ar.stream().forEach((s)-> System.out.println(s.name));
		Collections.sort(ar,new SortStudent());
		System.out.println("After sorting using Comparator");
		ar.stream().forEach((s)->
		{   
			System.out.println(s.name);
			
		});

	}

}