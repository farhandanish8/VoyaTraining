package com.voya.training;
import java.util.*;

public class Scandemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter ID");
		int a = sc.nextInt();
		System.out.println("Enter city name");
		String cityname = sc.next();
		System.out.println("Enter salary");
		Double b = sc.nextDouble();
		System.out.println(name+" " + a +" " +cityname +" "+ b+ " ");
		sc.close();
	}

}
