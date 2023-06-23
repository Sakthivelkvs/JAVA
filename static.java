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
static class Admission {
         int batch;
         Admission(int batch) {
            this.batch = batch;
        }
void displayBatchDetails() {
            System.out.println("Batch: " + batch);
        }
    }
}
class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter Mark: ");
        int mark = scanner.nextInt();
        
        System.out.print("Enter Sports Name: ");
        String sportsName = scanner.next();
        System.out.print("Enter Activity Points: ");
        int activityPoints = scanner.nextInt();
        
        System.out.print("Enter Batch: ");
        int batch = scanner.nextInt();
        
        Student s1 = new Student(rollNo, name, mark);
        Student.Sports s2 = s1.new Sports(sportsName, activityPoints);
        Student.Admission a1 = new Student.Admission(batch);

        System.out.print("\n Details: \n");
        a1.displayBatchDetails();
        
        s1.displayDetails();
 
        s2.displaySportsDetails();
        
    }
}