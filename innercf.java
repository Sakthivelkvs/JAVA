import java.util.Scanner;
class Student {
    int rollNo;
    String name;
    int mark;
    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Mark: " + mark);
    }
class Sports {
        String sportsName;
        int activityPoints;
        Sports(String sportsName, int activityPoints) {
            this.sportsName = sportsName;
            this.activityPoints = activityPoints;
        }
 void displaySportsDetails() {
            System.out.println("Sports Name: " + sportsName);
            System.out.println("Activity Points: " + activityPoints);
        }
    }
}
class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of Student:");
        int n=scanner.nextInt();
for(int i=0; i<n; i++){

        System.out.print("\nEnter Student Name: ");
        String name = scanner.next();
        System.out.print("\nEnter Roll No: ");
        int rollNo = scanner.nextInt();
        System.out.print("\nEnter Mark: ");
        int mark = scanner.nextInt();
        
        System.out.print("Enter Sports Name: ");
        String sportsName = scanner.next();
        System.out.print("Enter Activity Points: ");
        int activityPoints = scanner.nextInt();
        
        
        Student s1 = new Student(rollNo, name, mark);
        Student.Sports s2 = s1.new Sports(sportsName, activityPoints);

        

        System.out.print("\n Details \n"+(i+1)+":");     
        
        s1.displayDetails();
 
        s2.displaySportsDetails();

}

}
}


