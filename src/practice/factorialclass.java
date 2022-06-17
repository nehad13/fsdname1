package practice;

import java.util.Scanner;


public class factorialclass {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n;
		int factvar=1;
		System.out.println("enter any no.");
		
		n= sc.nextInt();
		
		for(int i =1;i<=n;i++) {
			factvar= factvar*i;
		}
			System.out.println("factorial is "+ factvar);
		
		

	}

}
