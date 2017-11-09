package com.sahil.Threads;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Test implements Runnable {

	public void run(){
		System.out.println(Thread.currentThread().getName()+":is running");
	}
	public static void main(String[] args) {
		try{
			throw new UserDefined();
			//int n =15/0;
		}
		catch(NumberFormatException e){
			System.out.println("inside number format exception catch");
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println("inside exception e catch");
			e.printStackTrace();
		}
		

	}

}
class UserDefined extends Exception{
	@Override
	public String getMessage() {
		return "User Defined Exception created by coder";
	}

}