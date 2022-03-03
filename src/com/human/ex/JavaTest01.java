package com.human.ex;

public class JavaTest01 {
	
//	프로그램 시작.
//	
//	
//	

		public static void main(String[] args) {
			
			int a=5;
			
			System.out.println("hello world");
			
			if (a==0) {
				System.out.println(0);
			}
			else if (a>6) {
				System.out.println("over");
			}
			else if (a<6) {
				System.out.println("under");
			}
			else {
				System.out.println("not a number");
			}
			
		
		switch(a) {
		
			case 1: System.out.println(1);
			break;
			
			case 2: System.out.println(2);
			break;
			
			default : System.out.println(333);
			
			}
			
		if (a!=4) {
				System.out.println("this is not 4");
			} 
		
		
}
}
