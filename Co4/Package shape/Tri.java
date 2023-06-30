package graph;
import java.util.Scanner;
interface Area4
{
void get4();
}
public class Tri implements Area4
{
int h,b;
public void get4()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the height:");
h=input.nextInt();
System.out.println("Enter the breadth:");
b=input.nextInt();

double area=(0.5*h*b);
System.out.println("Area of the triangle is :"+area);
}
}
