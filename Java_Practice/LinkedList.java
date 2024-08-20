//In java node will be class
// In Linked List there is data and pointer so,
// 1st we define a data in the class Node 
// pointer will be point the next node(in java there is no pointer fn)
// if i create an object for a class "Node"(Node n=new Node();  the "new Node();" gives the reference(pointer) ans that reference will be stored in "n" object in the memory)


class LinkedListOperations{

    Node head;

    class Node{
        int data;
        Node next; //it means reference the next node(point the next node) 

        Node(int val){
            data=val;
            next=null;
        }
    }

    LinkedListOperations(){
        head=null; // Initially, the list is empty, so head is null

    }


    void insertAtBegining(int val){
        // 1st we need to create an object of a "Node" class Because the pointer and data are defined in that class
        Node newNode = new Node(val); // val refers the construct will automatically assign the value
        // newNode.data=val; // it will assignn the value of new node(use without creating constructor)

        // When List is Empty
        if(head==null){
            head = newNode; // The new node becomes the head of the list
        }
        else{ // when list is not empty
            // at first we have to change the pointer and then we have to assingn the value 
            // because if we 1st assign the value the pointer will override we cannot assign new value

            newNode.next = head; // it wil change the the pointer to current node when the list is not empty
            head = newNode; // The new node becomes the new head

        }
    }


    void display(){
        // we have to traverse every single node to display this
        // we need a temprvary variable

        Node temp=head; // start from head 
        while (temp != null) { // it will print the value of node untill the node become null
            System.out.print(temp.data+" ");
            temp=temp.next; //to jump
            // next node's address will on "temp.next" so, we store "temp.next" on temp so it will jump
        }


    }

    void insertAtPosition(int pos, int val){

        // check if pos == 0
        if(pos==0){
            insertAtBegining(val);
            return;
        }

        Node newnode=new Node(val);
        Node temp=head;
        for(int i=1;i<=pos-1;i++){
            temp=temp.next; 
            if(temp==null){
                System.out.println("Invalid Position!!!");
                return;
            }
        }

        newnode.next=temp.next; 
        // the "newnode.next" is the new node that we want to insert
        // and "temp.next" is the current node(pos-1) containing the address of next node
        // so, we assign the new node to current node

        temp.next=newnode;
        // now, the current node("temp.next") should address the new node 
        // so, current node newnode
    }

    void deleteAtPosition(int pos){
        if(head==null){
            System.err.println("List is Empty!!");
            return;
        }

        if(pos==0){
            head=head.next; // "head.next is the 2nd node this will change the 2nd into head node"
            return;
        }

        Node temp=head; // we have to start with head
        Node prev=null;

        for(int i=1;i<=pos;i++){
            prev=temp; // we have to keep pevious to connect 2nd next node
            temp=temp.next; // for jump
        }

        prev.next = temp.next; // this will connect the pevious node to 2nd next node(it will skip the position node)
    }

    void insertAtEnd(int val){
        Node newnode=new Node(val);

        

        if(head==null){
            head=newnode;
        }else{
            Node temp=head;

            while (temp.next != null) {  // Traverse to the last node(because the last node pointer will be null)
                temp=temp.next;
            }

            temp.next=newnode; // Set the next of the last node to the new node
        }
    }

    void deleteAtEnd(){
        if(head==null){
            System.out.println("List is Empty!!");
            return;
        }

        if(head.next==null){
            head=null;
            System.out.println("One Element is Deleted!!");
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp.next != null){
            prev=temp;
            temp=temp.next;
        }

        prev.next=null; // delete the last element because the last element always be null(so, we set the last element is null)
    }

    void updateAvalueInaPosition(int pos, int val){
        if(head==null){
            System.out.println("List is Empty!!");
            return;
        }

        Node temp=head;

        // Traverse to the node at position `pos`
        for(int i=1; i<=pos; i++){

            // check th elist have only one value
            if(temp.next==null){
                System.out.println("List is out of Bound!!");
                return;
            }

            temp=temp.next;
        }

        temp.data=val;   // Update the value of the node at the position `pos`

    
        
    }

    void searchAnElement(int val){
        if(head==null){
            System.out.println("List is Empty!!");
            return;
        }

        Node temp=head;
        int index=0;

        while(temp != null){
            if(temp.data == val){
                System.out.println("Element "+val+" is Found in the index "+index+" .");
            }
            temp=temp.next;
            index++;
        }
    }

}

public class LinkedList {
    public static void main(String[] args) {
        LinkedListOperations list=new LinkedListOperations();
        list.insertAtBegining(5);
        list.insertAtBegining(7);
        // list.insertAtPosition(2, 2);
        // list.insertAtPosition(3, 1);
        // list.insertAtPosition(4, 0);
        // list.deleteAtPosition(4);
        // list.deleteAtPosition(0);
        // list.deleteAtPosition(1);
        // list.insertAtEnd(9);
        // list.insertAtEnd(10);
        // list.deleteAtEnd();
        // list.updateAvalueInaPosition(0, 1);
        // list.updateAvalueInaPosition(0, 2);
        // list.updateAvalueInaPosition(2, 3);
        // list.updateAvalueInaPosition(3, 4);
        list.searchAnElement(5);

        list.display();

    }
    
}
