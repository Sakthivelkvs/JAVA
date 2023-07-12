import java.util.Scanner;
class Fibb implements Runnable{
public void run(){
int n, a = 0, b = 0, c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number to get Fibinacci Series");
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}
class Even implements Runnable{
public void run(){
Scanner in=new Scanner(System.in);
int num;
System.out.println("Enter your Limit to get Even Numbers");
num=in.nextInt();
for(int i=2; i<=num; i+=2)
System.out.println("The Even Numbers are:"+i);
}
}
class main{
public static void main(String args[]) {
Fibb f1=new Fibb();
Thread t1=new Thread(f1);
t1.start();
Even p1=new Even();
Thread t2=new Thread(p1);
t2.start();
}
}


