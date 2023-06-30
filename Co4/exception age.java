import java.util.Scanner;
class AgeException extends Exception{
AgeException(String str){
super(str);
}
}

class Main{
static void validate(int age)throws AgeException{
if(age<18){
 throw new AgeException("Age is not valid");
}
}

public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter your age");
int age=in.nextInt();

try{
validate(age);
System.out.println("Your Eligible for Vote");

}
catch(AgeException e){
System.out.println("Caught the exception");
System.out.println("Exception Occured:"+e);
}

}
}