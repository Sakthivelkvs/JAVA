import java.util.Scanner;

class Search {
    int capacity;
    int arr[];
    String arr2[];
    Search(){
        capacity=5;
        arr = new int[capacity];  
        arr2 = new String[capacity];
    }

    Scanner sc=new Scanner(System.in);
    

    void GetSearchInteger(){
        System.out.println("Enter the Numbers: ");
        
        for(int i=0;i<capacity;i++){
            int ele=sc.nextInt();
            arr[i]=ele;
        }
    
        System.out.println("Array is : ");

        for(int i=0;i<capacity;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void SearchInteger(){
        
        System.out.println("Enter the Numbers you want to search: ");
        int e=sc.nextInt();
        int flag=0;
        for(int i=0;i<capacity;i++){
            if(arr[i]==e){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Element Found");
        }else{
            System.out.println("Element Not Found!!");
        }
    }

    void getString(){
        System.out.println("Enter"+capacity+"Strings");
        for(int i=0;i<capacity;i++){
            String wrds=sc.nextLine();
            arr2[i]=wrds;
        }

        System.out.println("Array is: ");
        for(int i=0; i<capacity; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }

    void searchString(){
        System.out.println("Enter the word you want to search");
        String wrd=sc.nextLine();
        int flag=0;
        for(int i=0;i<capacity;i++){
            if(arr2[i].equals(wrd)){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not Found!!!!");
        }
    }
}

class SearchElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Search obj=new Search();

        while (true) {
            System.out.println("\n1.Enter Integer\n2.Search Integer\n3.Enter String\n4.searchString\n5.Exit\n");
            System.out.println("Select an Option");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    obj.GetSearchInteger();
                    break;
                case 2:
                    obj.SearchInteger();
                    break;
                case 3:
                    obj.getString();
                    break;
                case 4:
                    obj.searchString();
                    break;
                case 5:
                    System.out.println("Exiting.......!");
                    System.exit(0);
            
                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }
            
        }
    }
}
