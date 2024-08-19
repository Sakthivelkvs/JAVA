import java.util.Scanner;


public class Pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row: ");
        int r=sc.nextInt();

        System.out.println("Enter the Column: ");
        int c=sc.nextInt();

        System.out.println("Enter the Symbol:");
        String s=sc.next();

        for(int i=0;i<r;i++){
            for(int j=i+1;j<=r;j++){
                System.out.print(s);
            }
        System.out.println();
        }
    }
}
