class LinkedList4
{
	Node head;

	class Node
	{
		int data;
		Node next;

		Node(int d)
		{
			data=d;
		}
	}

	public void deleteAtPosition(int position)
	{
		if(head==null)                // If linked list is empty
		return;

		Node temp=head;

		if(position==0)              // If head needs to be removed
		{
			head=temp.next;          // Change head
		}

		for(int i=0; temp!=null && i<position-1; i++)     // Find previous node of the node to be deleted
		{
			temp=temp.next;
		}

		if (temp == null || temp.next == null)     //If position is more than number of nodes like llist.deleteAtPosition(8)
		{
			System.out.println("Sorry position is more than number of nodes ");
			return;
		}


		temp.next=temp.next.next;             //Node temp->next is the node to be deleted
	    }

	    public void front(int data)
		{
			Node new_node=new Node(data);

			new_node.next=head;
			head=new_node;
		}

		public void printList()
		{
			Node n=head;

			while(n!=null)
			{
			System.out.print(n.data+"  ");
			n=n.next;
			}
		}


		public static void main(String[] args)
		{
			LinkedList4 llist=new LinkedList4();

			llist.front(60);
			llist.front(50);
			llist.front(40);
			llist.front(30);
			llist.front(20);
			llist.front(10);

			System.out.println("Before deletion linked list is :");
			llist.printList();

			llist.deleteAtPosition(3);
			System.out.println();
			System.out.println("After deletion linked list is :");
			llist.printList();

			llist.deleteAtPosition(0);
			System.out.println();
			System.out.println("After deletion linked list is :");
			llist.printList();

			llist.deleteAtPosition(8);
			System.out.println();
			System.out.println("After deletion linked list is :");
			llist.printList();
		}
}