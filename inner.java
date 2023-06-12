import java.util.Scanner;
class Student{
int rollno, mark;
String name;
void get(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student Roll Number:");
rollno=sc.nextInt();
System.out.println("Enter Student mark:");
mark=sc.nextInt();
System.out.println("Enter Student Name:");
name=sc.next();
}
class Sports{
int apoint;
String sname;
void give(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Sports name:");
sname=sc.next();
System.out.println("Enter Student Activity Point");
apoint=sc.nextInt();
}
void out(){
System.out.println("Roll Number"+rollno);
System.out.println("Student Name:"+name);
System.out.println("Student Mark:"+mark);
System.out.println("Sports Name:"+sname);
System.out.println("Activity Point"+apoint);
}
}
}
class Main44{
public static void main(String args[]){
Student s1=new Student();
Student.Sports in=s1.new Sports();
s1.get();
in.give();
in.out();
}
}
