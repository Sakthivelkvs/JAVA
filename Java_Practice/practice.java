import java.util.Scanner;
import java.util.Arrays;

class JavaPractice{

    Scanner sc = new Scanner(System.in);

    int sum=0;
    int size;
    int arr[];
    int capacity;
    

    JavaPractice(){
        int size=0;
        int capacity=5;
        arr = new int[capacity];
        
    }

    void Armstrong(int n){

        int len=String.valueOf(n).length();

        int temp = n;

        while(temp>0){
            int r=temp%10;
            sum += Math.pow(r, len);
            temp=temp/10;
        }

        if(sum == n){
            System.out.println("Its a Armstrong Number");
        }else{
            System.out.println("Its not a Armstrong Number");
        }

    }

    void ArmstrongLimit(int l){
        for(int i=1; i<=l; i++){
            int s=0;
            int num=i;
            int temp=num;
            int len=String.valueOf(num).length();

            while(num>0){
                int r=num%10;
                s+=Math.pow(r,len);
                num=num/10;
            }

            if(temp == s){
                System.out.println("The Armstrong Number are: "+temp);
            }
        }
    }

    void Fibinacci(int num){
        int f=0;
        int s=1;
        if(num==0){
            System.out.println(f);
        }else if(num==1){
            System.out.println(s);
        }else{
            int sum=0;
            for(int i=2;i<=num;i++){
                sum=f+s;
                f=s;
                s=sum;
                System.out.println(sum);


            }
        }
    }

    void PalindromeNumber(int num){
        int sum=0;
        int temp=num;

        while(temp>0){
            int rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;

        }

        if(sum==num){
            System.out.println("Its a Palindrome");
        }else{
            System.out.println("Its not a Palindrome");
        }
    }

    void PrimeLImit(int num){
        for(int i=2;i<=num;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("The Prime Number is: "+i);
            }
        }
    }

    void SumofNum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("the Sum of the number is: "+sum);

    }

    void PrimeCheck(int num){
        int flag=0;
        for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    flag=1;
                    break;
                }
            
            
        }
        if(flag==0){
            System.out.println("Its a Prime");
        }else{
            System.out.println("Its Not");
        }
    }

    void SumofDigits(int dig){
        int sum=0;
        int temp=dig;
        while(temp>0){
            int r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println("The Ssum of Digits is: "+sum);
    }

    void SearchanElementinAnArray(int val){
        

        arr[size]=val;
        size++;


        for (int i = 0; i < size; i++) {
            System.out.print("Array: "+arr[i] + " "); 
        }
        System.out.println(); 

        boolean flag=false;
        for(int i=0;i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]==arr[j]){
                    flag=true;
                }
            }
        }

        if(flag==true){
            System.out.println("the Duplicate elements is found");
        }else{
            System.out.println("the Duplicate elements is not found");
        }
    }

    void SecondLargestNum(int arr[]){
        int size=arr.length;
        if(size < 2){
            System.out.println("Not a Valid Array!!");
            return;
        }

        // if [3,4,5,1,7]--> the second largest number is 5
        // Step 1--> take a size of an array using length() store into a variable size=arr.length()
        //step -2 ---> sort an array using Arrays.sort()
        //after sortinf the array will be like [1,3,4,5,7]
        // the size(index) will be 5 
        // then print arr[size-2]---> size=5 so,5-2=3 
        // the 3rd index will be printed


        Arrays.sort(arr);

        // System.out.println("The Second Largest Number is :"+arr[size-2]);




        // if [3,4,5,1,7,7]-->the output will be "the second largest number is 7"
        // the sorted arry is [1,3,4,5,7,7]
        // to over come this error we have to do this
        // the size of the array is 6
        
        // the for loop will be start from i=size-2---> i=6-2---> i=4
        //then the condition is i less than or eqaul to 0 and i--(it will go reverse untill i becomes 0)


        // now i=4---->if(arr[i]!=arr[size-1])---> if(arr[4] not eqaul to arr[size-1]--[6-1]-->arr[5])
        // if(arr[4] not equal to arr[5])--->it will print arr[i] the return from the condition
        // arr[4]=7 and arr[5]=7 both are same so, it will not print the arr[i] then i--
        // then the codition satisfy it will print the arr[i]


        for(int i=size-2; i>=0; i--){
            if(arr[i]!=arr[size-1]){
                System.out.println("The Second Largest Number is :"+arr[i]);
                return;
            }
        }
        
    }

}

public class practice {
    public static void main(String args[]){
        JavaPractice jp=new JavaPractice();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n1.CheckArmstong\n2.ArmstrongLimit\n3.Fibinacci\n4.PalindromeNumber\n5.PrimeLimit\n6.CheckPrime\n7.SumofNumbers\n8.SumofDigits\n9.SearchanDuplicateElementinAnArray\n10.SecondLargestNumber\n11.Exit\n");
            System.out.println("Enter your Choice");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the Number");
                    int n=sc.nextInt();
                    jp.Armstrong(n);
                    break;

                case 2:
                    System.out.println("Enter the Limit");
                    int l=sc.nextInt();
                    jp.ArmstrongLimit(l);
                    break;
                
                case 3:
                    System.out.println("Enter the Number");
                    int v=sc.nextInt();
                    jp.Fibinacci(v);
                    break;

                case 4:
                    System.out.println("Enter the Number");
                    int val=sc.nextInt();
                    jp.PalindromeNumber(val);
                    break;

                case 5:
                    System.out.println("Enter the Number");
                    int pri=sc.nextInt();
                    jp.PrimeLImit(pri);
                    break;

                case 6:
                    System.out.println("Enter the Number");
                    int cp=sc.nextInt();
                    jp.PrimeCheck(cp);
                    break;

                case 7:
                    System.out.println("Enter the Limit");
                    int son=sc.nextInt();
                    jp.SumofNum(son);
                    break;

                case 8:
                    System.out.println("Enter the Digits");
                    int sod=sc.nextInt();
                    jp.SumofDigits(sod);
                    break;
                
                case 9:
                    System.out.println("Enter the Value");
                    int ar=sc.nextInt();
                    jp.SearchanElementinAnArray(ar);
                    break;

                case 10:
                    int arr[]={3,5,7,1,7,2};
                    jp.SecondLargestNum(arr);
                    break;

                case 11:
                    System.out.println("Exiting.......!");
                    sc.close();
                    return;
   
                default:
                    System.out.println("Invalid Choice!!!!");
                    break;
            }
        }
    }
}
