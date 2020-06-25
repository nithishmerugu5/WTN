package com.wipro.flowcontrolstatements;

public class EX8 {


	public static void main(String[] args) {
		try {
			
			System.out.println("Digit");
			}
			catch (Exception NumberFormatException){
			String str = args[0];
			char a = str.charAt(0);
			if ((a >= 65 && a <= 90) || (a >=97 &&  a <= 122 )){
			System.out.println("Alphabhet");
			}
			else{
			System.out.println("Special Character");
			}
			}
	}

}
