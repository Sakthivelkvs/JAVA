package Dump;

import java.util.Scanner;

public class SumofDigits {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int n=sc.nextInt();
		SumofDigits sod=new SumofDigits();
		sod.digits(n);
	}
	public void digits(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			
			
		}
		System.out.println("The sum of a number is: "+sum);
	}
	
}
