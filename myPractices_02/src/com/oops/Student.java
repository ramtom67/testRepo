package com.oops;

public class Student {
 
	int studNo;
	String studName,result,grade;
	int m1,m2,m3,m4,m5,total;
	float average;
	
	
	public Student() {
		
	}
	
	public Student(int studNo,String studName,int m1,int m2,int m3,int m4,int m5){
		this.studNo=studNo;
		this.studName=studName;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
	}
	
	 public void CalculateMarks() {
		total= m1+m2+m3+m4+m5;
		average=total/5;
		if(m1<40 || m2<40 || m3<40 || m4<40 || m5<40) {
			result = "Fail";
		}	
		else {
			result = "Pass";
			if(average>=80)
				grade="Distinction";
			else if(average<80 & average>=70)
				grade="First Class";
			else if(average<70 & average>=60)
				grade="Second Class";
			else if(average<60 & average>=50)
				grade="Third Class";
		}
		    
		
			
		
	 }
	 
	public void displayStudentDetails() {
		System.out.println("Student NO  : "+studNo);
		System.out.println("Student Name: "+studName);
		System.out.println("Student Mark: "+total);
		System.out.println("Average     : "+average);
		System.out.println("Result      : "+result);
		System.out.println("Grade       : "+grade);
	}
}
