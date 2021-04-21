// Java program to remove duplicates from unsorted
// linked list

class LinkedList16
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
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}

	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data + "   ");
			temp=temp.next;
		}
	}

	public void rem_duplicates()
	{
		//Node ptr1 = null, ptr2 = null, dup = null;
        Node ptr1 = head;

		while(ptr1 !=null && ptr1.next !=null)
		{
			Node ptr2=ptr1;

			while(ptr2.next!=null)
			{
				if(ptr1.data==ptr2.next.data)
				{
					Node dup=ptr2.next;
					ptr2.next=ptr2.next.next;
				}
				else
				{
					ptr2=ptr2.next;
				}
			}

			ptr1=ptr1.next;
		}
	}


	public static void main(String[] args)
	{
		LinkedList16 llist=new LinkedList16();

		llist.push(12);
		llist.push(11);
		llist.push(12);
		llist.push(21);
		llist.push(41);
		llist.push(43);
		llist.push(21);

		System.out.println("Elements of Linked List are : ");
		llist.print();

		System.out.println();

		llist.rem_duplicates();
		System.out.println("After removing Elements of Linked List are : ");
		llist.print();
	}
}