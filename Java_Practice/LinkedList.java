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
        // now, the current node("temp.next") should address the next node 
        // so, current node newnode
    }

}

public class LinkedList {
    public static void main(String[] args) {
        LinkedListOperations list=new LinkedListOperations();
        list.insertAtBegining(5);
        list.insertAtBegining(7);
        list.insertAtPosition(1, 2);
        list.insertAtPosition(0, 9);
        list.insertAtPosition(4, 4);
        list.insertAtPosition(7, 1);
        list.display();

    }
    
}
