//program to find nth node from last in the linked list

class LinkedList9
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
			System.out.print(temp.data +"  ");
			temp=temp.next;
		}
	}

	public void NthfromLast(int n)
	{
		Node current=head;
		int len=0;

		while(current!=null)
		{
			current=current.next;
			len++;
		}

		if(len<n)
		return;

		current=head;
		for(int i=1; i<(len-n+1); i++)
		current=current.next;

		System.out.println(current.data);
	}

	public void NthLast(int n)
	{
		Node main_ptr=head;
		Node ref_ptr=head;
		int count=0;

		if(head!=null)
		{
			while(count<n)
			{
				if(ref_ptr==null)
				{
					System.out.println(n + " is greater than the no of nodes in the list");
					return;
				}
				ref_ptr=ref_ptr.next;
				count++;
			}

			while(ref_ptr!=null)
			{
				main_ptr=main_ptr.next;
				ref_ptr=ref_ptr.next;
			}
			System.out.println("Node no. " + n + " from last is " + main_ptr.data);
		}
	}


	public static void main(String[] args)
	{
		LinkedList9 llist=new LinkedList9();

		llist.push(60);
		llist.push(50);
		llist.push(40);
		llist.push(30);
		llist.push(20);
		llist.push(10);

		System.out.println("Elements of linked list is");
		llist.display();

		System.out.println();
		System.out.print("2nd node from last is:  ");
		llist.NthfromLast(2);

		System.out.println();
		llist.NthLast(5);
	}
}