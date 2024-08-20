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


    void deleteAtPosition(int pos){

        if(pos==0){
            head=head.next;
            return;
        }

        if(head==null){
            System.err.println("List is Empty");
            return;
        }
        Node temp=head;
        Node prev=null;

        for(int i=1;i<=pos;i++){
            prev=temp;
            temp=temp.next;
        }

        prev.next=temp.next;
    }

    void insertAtEnd(int val){
        Node newnode=new Node(val);

        if(head==null){
            head=newnode;
        }else{
            Node temp=head;

            while (temp.next != null) {
                temp=temp.next;
            }

            temp.next=newnode;
        }


    }

    void deleteAtEnd(){
        if(head==null){
            System.out.println("List is Empty!!!");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node temp=head;
        Node prev=null;

        while (temp.next != null) {
            prev=temp;
            temp=temp.next;
        }

        prev.next=null;
    }

    void updateAvalueInaPosition(int pos, int val){
        if(head==null){
            System.out.println("List is Empty!!!");
            return;
        }

        Node temp=head;

        for(int i=1; i<=pos; i++){
            if(temp.next==null){
                System.out.println("List is OutofBound!!!");
                return;
            }

            temp=temp.next;
        }

        temp.data=val;
    }

    void searchAnElement(int val){
        if(head==null){
            System.out.println("List is Empty!!!");
            return;
        }


        Node temp=head;
        int idx=0;

        while(temp != null){
            if(temp.data==val){
                System.out.println("Element "+val+" is found in index "+idx+" .");
                return;
            }
            temp=temp.next;
            idx++;
        }

        System.out.println("Element "+val+" is not found in any index!!");

    }
}


public class LinkedListMain {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);

        Linked_List list=new Linked_List();

        while(true){
            System.out.println("\n1. Insert at Beginning\n2. Insert at Position\n3. Delete at Position\n4. Insert at end\n5. Delete at the End\n6. Upadate the Value in a Position\n7. Search an Element with index\n8. Display\n9. Exit");
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
                    System.out.print("Enter the position: ");
                    int p = sc.nextInt();
                    list.deleteAtPosition(p);
                    break;

                case 4:
                    System.out.print("Enter the Value: ");
                    int v = sc.nextInt();
                    list.insertAtEnd(v);
                    break;

                case 5:
                    list.deleteAtEnd();
                    System.out.println("Deleted!! ");
                    break;

                case 6:
                    System.out.print("Enter the position: ");
                    int po = sc.nextInt();
                    System.out.print("Enter the value: ");
                    int var = sc.nextInt();
                    list.updateAvalueInaPosition(po, var);
                    break;

                case 7:
                    System.out.print("Enter the value for Search: ");
                    int ser = sc.nextInt();
                    list.searchAnElement(ser);
                    break;


                case 8:
                    System.out.println("Linked List: ");
                    list.display();
                    break;

                case 9:
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
