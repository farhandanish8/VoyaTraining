package com.voya.training;

public class Onedip {

	public static void main(String[] args) {
		int [] marks=new int[4];
		System.out.println(marks[0]);
		System.out.println(marks.length);
		marks[0]=90;
		marks[1]=90;
		marks[2]=90;
	    marks[3]=90;
	    
	    
	    for(int i=0;i<marks.length;i++) {
	    	System.out.println(marks[1]);
	    }
	    for (int mark:marks)
	    	System.out.println(mark);
	    
	    }
	}


