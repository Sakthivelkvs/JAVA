package Dump;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int n=sc.nextInt();
		SumOfNumbers son=new SumOfNumbers();
		son.sum(n);
		
			
	}
	public void sum(int var) {
		int sum=0;
		for(int i=1;i<=var;i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

}
