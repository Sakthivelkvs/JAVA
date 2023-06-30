package graph;
import java.util.Scanner;
interface Area2
{
void get2();
}
public class Sqr implements Area2
{
int a;
public void get2()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the side:");
a=input.nextInt();

int area=a*a;
System.out.println("Area of the square is :"+area);
}
}
