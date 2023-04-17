import java.util.Scanner;
interface Area{
double pi=3.14;
void get();
void display();
}
class Rect implements Area{
int l,b;
public void get(){
Scanner input=new Scanner(System.in);
System.out.println("Enter your length:");
l=input.nextInt();
System.out.println("Enter your breadth:");
b=input.nextInt();
}
public void display(){
int rect=l*b;
System.out.println("Area of Rectangle is:"+rect);
}
}
class Cir implements  Area{
int r;
public void get(){
Scanner input=new Scanner(System.in);
System.out.println("Enter your radius:");
r=input.nextInt();
}
public void display(){
double c=3.14*r*r;
System.out.println("Area of Circle is:"+c);
}
}
class Sqr implements Area{
int x;
public void get(){
Scanner input=new Scanner(System.in);
System.out.println("Enter your area:");
x=input.nextInt();
}
public void display(){
int s=x*x;
System.out.println("Area of Square is:"+s);
}
}
class Main{
public static void main(String args[]){
Rect r1=new Rect();
Cir c1=new Cir();
Sqr s1=new Sqr();
r1.get();
r1.display();
c1.get();
c1.display();
s1.get();
s1.display();
}
}

