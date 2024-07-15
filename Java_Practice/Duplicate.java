public class Duplicate {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,2,5,2,3,2,1};
        boolean fl=false;
        for(int i=0; i<arr.length; i++){
            int cnt=0;
            for(int j=i+1; j<arr.length; j++){      /*j=i+1 refers to the next iteration of the loop if i=1 j=1+1=2 it will iterate next element in the loop*/
                if(arr[i]==arr[j]){
                    // System.out.println("Duplicate found: "+arr[i]);
                    fl=true;
                    cnt++;
                    // System.out.print("Count="+cnt);
                   
                }
            }
            if(cnt>0){
                System.out.println("Duplicate found: "+arr[i]+" Count="+(cnt+1));
            }
        }
        if(fl==false){
            System.out.println("No Duplicates Found");
        }
    }
}
