import maths.*;
import java.util.Scanner;
class Main5
{
public static void main(String args[])
{
Scanner gt=new Scanner(System.in);
int a,b;
System.out.println("Enter the First value:");
a=gt.nextInt();
System.out.println("Enter the Second value:");
b=gt.nextInt();

maths.Add a1=new maths.Add();
a1.show1(a,b);
maths.Sub s1=new maths.Sub();
s1.show2(a,b);
maths.Mult m1=new maths.Mult();
m1.show3(a,b);
maths.Div d1=new maths.Div();
d1.show4(a,b);
}
}