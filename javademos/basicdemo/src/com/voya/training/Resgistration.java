package com.voya.training;
import java.util.Scanner;
public class Resgistration {

	public static void main(String[] args) {
		String[] usernames={"farhan","danish"};
		Scanner sc = new Scanner(System.in);
		boolean isPresent =false;
		System.out.println("Enter name to register");
		String uname=sc.nextLine();
		for(String username: usernames) {
			System.out.println(username);
		}
		if(uname.equals(usernames)) {
			System.out.println("Name is not unique");
			
			
		}
		if(!isPresent)
			System.out.println("You are registered");
		}

	}

