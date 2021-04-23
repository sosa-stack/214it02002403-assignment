import java.util.Scanner;

class doublyLinkedList{
    class Node{

        // Doubly linked list Node

        String name;
        Node prev;
        Node next;

        public Node(String name) {
            this.name=name;
        }
    }
       public Node head=null;
       public Node tail=null;

    public void addNode(String name) {

        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
        public void display(){

        Node current=head;
          if (head==null) {
              System.out.println("There is no Family Tree in this list");
              return;
          }
               System.out.println("The names on the Family tree");
               while (current != null){
                System.out.print(current.name +"==>");
                current=current.next;
               }

          }






    public static void main(String[] args) {
	// write your code here

        doublyLinkedList dList = new doublyLinkedList();
        Scanner Mike=new Scanner(System.in);
        int treeSize;

        System.out.println("Please enter the tree size");
        treeSize= Mike.nextInt();

        System.out.println("Please what are the names");

        String node;
        int count =0;
        while(count<=treeSize)
        {
            //System.out.println("Name: " + count);
            node = Mike.nextLine();
            //Inserting the nodes
            dList.addNode(node);
            count++;
        }



        //print the nodes of DoublyLinkedList
        dList.display();
    }
}
