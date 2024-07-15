import java.util.Scanner;

public class Search {
    public static void main(String[] args) { 
        int arr[]={1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int n=sc.nextInt(); 
        boolean flag=false;
        for(int i=0; i<arr.length; i++){
            if(n==arr[i]){
                flag=true;
                break;
                
            }
        }
        if(flag==false){
            System.out.println("The element is Not Present!!!");
        }else{
            System.out.println("The element is Present");
        }



     }
}
