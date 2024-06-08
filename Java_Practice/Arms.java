package Dump;

import java.util.Scanner;

public class Arms {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number");
		int num=sc.nextInt();
		int len=String.valueOf(num).length();
		int temp = num;
		int sum = 0;
		while(temp>0) {
			int rem=temp%10;
			sum+=Math.pow(rem, len);
			temp/=10;
			
		}
		if(num == sum) {
			System.out.println("The Number is Armstrong");
		}else {
			System.out.println("The Number is not Armstrong");
		}
	}
	

}
