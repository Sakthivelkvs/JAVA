import java.util.Scanner;
class Mca{
int str;
String dep,hod;
void details(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Departmant name:");
dep=sc.next();
System.out.println("Enter the HOD name:");
hod=sc.next();
System.out.println("Enter the strngth of the class:");
str=sc.nextInt();
}
void disDetails(){
System.out.println("Department name:" +dep);
System.out.println("HOD name:" +hod);
System.out.println("Strength of the class:" +str);
}
}
class S1 extends Mca{

String sname,add;
int roll;
void getdetails(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Student name:");
sname=sc.next();
System.out.println("Enter your address:");
add=sc.next();
System.out.println("Enter your RollNO:");
roll=sc.nextInt();
}
void readDetails(){
System.out.println("Student name:" +sname);
System.out.println("Address:" +add);
System.out.println("RollNo:" +roll);
}
}

class Main{
public static void main(String args[]){
Mca obj1=new Mca();
S1 obj2=new S1();
obj1.details();
obj1.disDetails();
obj2.getdetails();
obj2.readDetails();
}
}

