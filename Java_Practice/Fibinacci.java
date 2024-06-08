package Dump;

import java.util.Scanner;

public class Fibinacci {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		Fibinacci fb=new Fibinacci();
		fb.fib(n);
		
	}
	
	public void fib(int val) {
		int f=0;
		int l=1;
		
		if(val==0) {
			System.out.println(f);
			
		}else if(val==1) {
			System.out.println(l);
		}else {
			int sum;
			for(int i=2;i<=val;i++) {
				sum=f+l;
				f=l;
				l=sum;
				System.out.println(sum);
			}
			
		}
	}

}
