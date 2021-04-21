//program to count no of elements in the linked list

class LinkedList11
{
	Node head;
	class Node
	{
		int data;
		Node next;

		Node(int d)
		{
			data=d;
			//next = null;
		}
	}

	 public void push(int new_data)
	 {
	    Node new_node = new Node(new_data);
	  	new_node.next = head;
	 	head = new_node;
    }

    public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data +" ");
			temp=temp.next;
		}
	}


	public int count(int search_for)
	{
		int count=0;
		Node current=head;

		while(current!=null)
		{
			if(current.data==search_for)
			{
				++count;
		   	}

		   	current=current.next;
		}
		return count;
	}

	public static void main(String[] args)
	{
		LinkedList11 llist=new LinkedList11();

		llist.push(60);
		llist.push(50);
		llist.push(60);
		llist.push(30);
		llist.push(60);
		llist.push(10);

		System.out.println("Elements of linked list is");
		llist.display();

		System.out.println();
		System.out.println("No of times a no occur: " + llist.count(60));

		System.out.println();
		int x=llist.count(10);
		System.out.println(x);

		System.out.println();
		int y=llist.count(10);
		System.out.println(y);
	}
}