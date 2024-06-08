package Dump;

import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {   	//i=7
			int flag=0;				//flag=0
			for(int j=2;j<i;j++) {	//j=2 j iterates until i=6 and j will increment j++ (current j value is )
				if(i%j==0) {		//i=7 j=2 7%2=1 then j++
									//i=7 j=3 7%3=1 then j++
									//it continues until j=6 if the condition satisfies it will break the inner loop and set flag=1
									//if the condition is not satisfies the flag value remains 0 and it is a prime number
					flag=1;			//if flag=1 ,its a prime number Its goes to flag=0..then continues the iteration
					break;
				}
			}
			if(flag==0) {		
				System.out.println(i);
			}
		}
		
	}
}
