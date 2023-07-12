import java.util.Scanner;
class Tables extends Thread
{
public void run(){
int num;
System.out.println("Enter any Number for tables:");
Scanner in=new Scanner(System.in);
num=in.nextInt();
for(int i=1; i<=10; i++){
int n=num*i;

System.out.println(num+"*"+i+"="+n);

}
}
}
class Prime extends Thread
{
public void run(){
int n, i, count, j;
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the value of n to find prime number:");
    n = scan.nextInt();

    System.out.println("The first " + n + " prime numbers are:");

    for (i = 2; i <= n; i++) {
      count = 0;
      for (j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
          count++;
          break;
        }
      }
      if (count == 0 && i != 1) {
        System.out.print(i + " ");
      }
    }
  }
}
class main
{
public static void main(String args[]) {
Tables t1=new Tables();
t1.start();
Prime p1=new Prime();
p1.start();
}
}

