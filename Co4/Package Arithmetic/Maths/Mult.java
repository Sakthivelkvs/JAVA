package maths;
interface Arith3
{
void show3(int a,int b);
}
public class Mult implements Arith3
{
int a,b;
public void show3(int a,int b)
{
int pro=a*b;
System.out.println("MULTIPLICATION:"+pro);
}
}