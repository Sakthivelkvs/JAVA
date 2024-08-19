import java.util.Scanner;

class Linked_List{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }
    }

    Linked_List(){
        head=null;
    }


    void insertAtBegining(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    void display(){

        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }


    }


    void insertAtPosition(int pos,int val){

        if(pos==0){
            insertAtBegining(val);
            return;
        }
        Node newNode=new Node(val);
        Node temp=head;

        for(int i=1; i<=pos-1; i++){
            temp=temp.next;
            if(temp==null){
                System.out.println("Invalid Position!!");
                return;
            }
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }
}


public class LinkedListMain {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);

        Linked_List list=new Linked_List();

        while(true){
            System.out.println("\n1. Insert at Beginning\n2. Insert at Position\n3. Display\n4. Exit");
            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter the value: ");
                    int val = sc.nextInt();
                    list.insertAtBegining(val);
                    break;

                case 2:
                    System.out.print("Enter the position: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter the value: ");
                    int value = sc.nextInt();
                    list.insertAtPosition(pos, value);
                    break;

                case 3:
                    System.out.println("Linked List: ");
                    list.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Please choose again.");
            }

        }

        // list.insertAtBegining(2);
        // list.insertAtBegining(4);

        // list.insertAtBegining(5);
        // list.insertAtPosition(1,3);
        // list.insertAtPosition(4,7);
        // list.display();


    }
}
