//Iterative & recursive program to search an element in linked list

class LinkedList7
{
	Node head;

	class Node
	{
		int data;
		Node next;

		Node(int public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data +"  ");
			temp=temp.next;
		}
	}d)
		{
			data=d;
		}
	}

	public void push(int new_data)
	{
		Node new_node=new Node(new_data);

		new_node.next=head;
		head=new_node;
	}



	public boolean search(Node head, int key)           //iterator method for searching
	{
		Node n=head;
		while(n!=null)
		{
			if(n.data==key)
			return true;

			n=n.next;
		}
		return false;
	}


	public boolean rec_search(Node head, int key)     //recursive search
	{
		if(head==null)
		return false;

		if(head.data==key)
		return true;

		return rec_search(head.next, key);
	}



	public static void main(String[] args)
	{
		LinkedList7 llist=new LinkedList7();

		llist.push(60);
		llist.push(50);
		llist.push(40);
	    llist.push(30);
		llist.push(20);
		llist.push(10);

		if (llist.search(llist.head, 21))
		    System.out.println("Yes");
		else
		    System.out.println("No");

		if (llist.rec_search(llist.head, 20))
			System.out.println("Yes");
			else
		    System.out.println("No");
    }
}