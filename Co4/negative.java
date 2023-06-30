import java.util.Scanner;
class NegativeException extends Exception{
NegativeException(String str){
super(str);
}
}
class Average{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit of integer");
int n=sc.nextInt();
int sum=0;
int count=0;
try{
for(int i=1;i<=n;i++){
System.out.println("Enter the positive integer");
int num=sc.nextInt();
if(num<0){
throw new NegativeException("Don't insert Negative Integer");
}
sum+=num;
count++;
}
double ave=sum/count;
System.out.println("Average="+ave);
}
catch(NegativeException e){
System.out.println("Exception Caught:"+e);
}
}
}