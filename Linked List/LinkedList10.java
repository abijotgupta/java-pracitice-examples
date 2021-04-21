//program to find middle element in the linked list

class LinkedList10
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
			System.out.print(temp.data +" -> ");
			temp=temp.next;
		}
		System.out.println();
	}


	public void middle()            //using two pointers
	{
		Node fast_ptr=head;
		Node slow_ptr=head;

		if(head!=null)
		{
			while(fast_ptr != null && fast_ptr.next != null)
			{
				fast_ptr=fast_ptr.next.next;
				slow_ptr=slow_ptr.next;
			}

			 System.out.println("The middle element is [" + slow_ptr.data + "] \n");
		}
	}

	public static void main(String[] args)
	{
		LinkedList10 llist=new LinkedList10();

		for(int i=0;i<=10;i++)
		{
			llist.push(i);
			llist.display();
			llist.middle();

		}

	}
}


