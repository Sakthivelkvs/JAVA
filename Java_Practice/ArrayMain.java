import java.util.Scanner;


class ListArray{
    
    int InitialCapacity = 5;

    int arr[];
    int size;      // Size acts as index value of an array
    int capacity;  // Capacity acts as total Storage of a Array

    ListArray() {
        arr = new int[InitialCapacity];
        size = 0;
        capacity = InitialCapacity;
    }

    public void add(int val) {
        if (size == capacity) {
            System.out.println("Array is Full");
            return; // Early exit to avoid adding the element
        } else {
            arr[size] = val;
            size++; // Increment the size if an index value
        }
    }
    
    public void display(){
        System.out.println(" The Elements Are: \n");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }

	public void InsertAtPos(int pos,int val){
		if (pos < 0 || pos > size || size==capacity ) {
			System.out.print("Invalid Position!!!");
			return;
		} else {
            for (int i = size; i >= pos + 1; --i) {
                arr[i] = arr[i - 1];
            }
		}

            arr[pos] = val;
            size++;
    }
	public void DeleteAtPos(int pos){
		for(int i=pos+1;i<size;i++){
			arr[i-1]=arr[i];
		}

		size--;
	}
	public void DeleteAtEnd(){
		if (size == 0) {
            System.out.println("Array is Empty");
            return;
        }
        size--;
	}
	public void DeleteAtBegining(){
		if(size ==0){
			System.out.println("Array Is Full!!!");
		}
		for(int i=1;i<size;i++){
			arr[i-1]=arr[i];
		}
		size--;
	}

	public void InsertatBegining(int val){
		for(int i=size;i>0;i--){
			arr[i] = arr[i - 1];
		}
		arr[0]=val;
		size++;
	}


    
    
}

class ArrayMain{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
		
		ListArray list=new ListArray();
		
		while(true) {
			System.out.println("\n______Array Opperation______\n");
			System.out.println(" Select an Option \n");
			System.out.println(" 1.Insert at the End \n");
			System.out.println(" 2.Display \n");
			System.out.println(" 3.Insert at the Specific Position \n");
			System.out.println(" 4.Delete at the Specific Position \n");
			System.out.println(" 5.Delete at the End  \n");
			System.out.println(" 6.Delete at the Beginning  \n");
			System.out.println(" 7.Insert at the Beginning  \n");

			System.out.println(" 8.Exit \n");
			System.out.println(" Seclect an option \n");
			
			int option=sc.nextInt();
			
			switch(option) {
			case 1:
                System.out.println("Enter the Value");
				int val=sc.nextInt();
				list.add(val);
				break;
			case 2:
				list.display();
				break;
			case 3:
				System.out.print("Enter the Position");
				int pos=sc.nextInt();
				System.out.print("Enter the Value");
				int val2=sc.nextInt();
				list.InsertAtPos(pos,val2);
                break;
			case 4:
				System.out.print("Enter the Position");
				int posd=sc.nextInt();
				list.DeleteAtPos(posd);
				break;
			case 5:
				list.DeleteAtEnd();
				break;
			case 6:
				list.DeleteAtBegining();
				break;
			case 7:
				System.out.print("Enter the Value");
				int v=sc.nextInt();
				list.InsertatBegining(v);
				break;
			case 8:
				System.exit(0);
			default:
				System.out.println("Invalid Choice!!!!");
										
			}
			
		}
		
     
}
}