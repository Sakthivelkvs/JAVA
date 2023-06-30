package maths;
interface Arith2
{
void show2(int a,int b);
}
public class Sub implements Arith2
{
int a,b;
public void show2(int a,int b)
{
int diff=a-b;
System.out.println("SUBRACTION:"+diff);
}
}