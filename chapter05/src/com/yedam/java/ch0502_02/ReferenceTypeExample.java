package com.yedam.java.ch0502_02;

public class ReferenceTypeExample {

	public static void main(String[] args) {
//		System.out.println("입력값 : " + args[0]);
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		

	}

}
