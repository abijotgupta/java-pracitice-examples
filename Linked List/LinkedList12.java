//program to find loop in the linked list

class LinkedList12
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
			System.out.print(temp.data +"  ");
			temp=temp.next;
		}
	}


	public int detectloop()            //using two pointers
	{
		Node fast_ptr=head;
		Node slow_ptr=head;

		if(head!=null)
		{
			while(slow_ptr!=null && fast_ptr != null && fast_ptr.next != null)
			{
				fast_ptr=fast_ptr.next.next;
				slow_ptr=slow_ptr.next;

				if(slow_ptr==fast_ptr)
				{
					System.out.println("Found loop");
					return 1;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args)
	{
		LinkedList12 llist=new LinkedList12();

		llist.push(60);
		llist.push(50);
		llist.push(40);
		llist.push(30);
		llist.push(20);
		llist.push(10);



		System.out.println("Elements of linked list is");
		llist.display();
		System.out.println();

		llist.head.next.next.next.next.next = llist.head;
		llist.detectloop();
	}

}
