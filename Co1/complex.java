import java.util.Scanner;
class Complex{
int r,i;
Complex(int r, int i){
this.r=r;
this.i=i;
}

Complex addComp(Complex c1, Complex c2){
Complex c3=new Complex(0,0);
c3.r=c1.r+c2.r;
c3.i=c1.i+c2.i;
return c3;
}
}

class Nerd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Real part of 1st Complex number");
int r1=sc.nextInt();
System.out.println("Enter the Imaginary part of 1st Complex number");
int i1=sc.nextInt();
System.out.println("Enter the Real part of 2nd Complex number");
int r2=sc.nextInt();
System.out.println("Enter the Imaginary part of 2nd Complex number");
int i2=sc.nextInt();

Complex c1=new Complex(r1,i1);
Complex c2=new Complex(r2,i2);
Complex sum=new Complex(0,0);
sum=sum.addComp(c1,c2);
System.out.print("The addition of complex is:"+sum.r+"+"+sum.i+"i");

}
}

