package com.sahil.exceptions;

public class ExceptionsExampleThrowRunExe {

	public static void methodThrowRunExe(){
		System.out.println("1=1");
		throw new RuntimeException();
	}
	public static void main(String args[]){
		try{
			System.out.println("1=0");
			methodThrowRunExe();
		}
		catch(RuntimeException e){
			System.out.println("1=2");
		}
		finally{
			System.out.println("1=3");
		}
		System.out.println("1=4");
	}
}
