package com.voya.training;

public class Ternary {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		String s = (a>b&&a>c)?"a is greater":(b>c)?"b is greater":"c is greater";
		System.out.println(s);
}
}

