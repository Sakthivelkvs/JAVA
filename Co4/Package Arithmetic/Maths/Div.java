package maths;
interface Arith4
{
void show4(int a,int b);
}
public class Div implements Arith4
{

public void show4(int a,int b)
{
if(b!=0){
System.out.println("DIVISION:"+(a/b));
}
else{
System.out.println("Cannot Divided By Zero");
}
}
}