package maths;
interface Arith1
{

void show1(int a,int b);
}
public class Add implements Arith1
{
int a,b;
public void show1(int a,int b)
{

int sum=a+b;
System.out.println("ADDITION:"+sum);
}
}