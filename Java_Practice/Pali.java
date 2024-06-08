package Dump;

import java.util.Scanner;

public class Pali {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number");
		int n=sc.nextInt();
		
		int sum=0;
		int temp=n;
		while(temp>0) {
			int rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		System.out.println("The Reversed Number is="+sum);
		if (sum==n) {
			System.out.println("The  Number "+n+" is Palindrome");
		}else {
			System.out.println("The  Number "+n+" is Not a Palindrome");
		}
		
	}

}
