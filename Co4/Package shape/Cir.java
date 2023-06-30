package graph;
import java.util.Scanner;
interface Area3
{
double pi=3.14;
void get3();
}
public class Cir implements Area3
{
int r;
public void get3()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter radius:");
r=input.nextInt();
double area=pi*r*r;
System.out.println("Area of the rectangle is :"+area);
}
}
