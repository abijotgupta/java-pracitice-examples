// A simple Java program for traversal of a linked list

class LinkedList1
{
	Node head;            //head of the list


	 static class Node   //Linked list Node.  This inner class is made static so that
	 {                   //  main() can access it
		int data;
		Node next;       //next is by default initialized as null

		Node(int d)      //constructor to create a new node
		{
			data=d;
		}
	}

	public void printList()  //This function prints contents of linked list starting from head
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data +"  ");
			n=n.next;
		}
	}


	public static void main(String[] args)   //method to create a simple linked list with 3 nodes
	{
		LinkedList1 llist=new LinkedList1();   //Start with the empty list.

		llist.head=new Node(1);              //Three nodes have been allocated dynamically.
        Node second=new Node(2);             //We have references to these three blocks as first,
		Node third=new Node(3);              //second and third


		llist.head.next=second;              // Now next of the first Node refers to the second.So they both are linked.
 		second.next=third;

 		llist.printList();
	}

}
