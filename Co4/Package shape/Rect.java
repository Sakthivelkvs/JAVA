package graph;
import java.util.Scanner;
interface Area1
{
void get1();
}
public class Rect implements Area1
{
int l,b;
public void get1()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the length:");
l=input.nextInt();
System.out.println("Enter the breadth:");
b=input.nextInt();

int area=l*b;
System.out.println("Area of the rectangle is :"+area);
}
}
