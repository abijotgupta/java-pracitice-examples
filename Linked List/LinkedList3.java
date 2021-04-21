class LinkedList3
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

	public void front(int data)
	{
		Node new_node=new Node(data);

		new_node.next=head;
		head=new_node;
	}

	public void delete(int key)
	{
		Node temp=head, prev=null;

		if(temp!=null && temp.data==key)
		{
			head=temp.next;
			return;
		}

		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}

		if(temp==null)
		{
			return;
		}

		prev.next=temp.next;
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
		LinkedList3 llist=new LinkedList3();

		llist.front(60);
		llist.front(50);
		llist.front(40);
		llist.front(30);
		llist.front(20);
		llist.front(10);

		System.out.println("Before deletion linked list is :");
		llist.printList();

		llist.delete(40);

		System.out.println();
		System.out.println("After deletion linked list is :");
		llist.printList();
	}

}