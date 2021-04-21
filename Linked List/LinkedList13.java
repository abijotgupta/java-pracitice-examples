//program to find length of loop in the linked list

class LinkedList13
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


	public int countloop()            //using two pointers
	{
		Node fast_ptr=head;
		Node slow_ptr=head;
		int count=1;          //bcoz if(slow_ptr==fast_ptr) bcoz in this condt length of loop is already 1

		while(slow_ptr!=null && fast_ptr != null && fast_ptr.next != null)
		{
			fast_ptr=fast_ptr.next.next;
			slow_ptr=slow_ptr.next;

			if(slow_ptr==fast_ptr)
			{
				Node n=slow_ptr;       //store address of point of intersecton of both node (it can be fast_ptr)
				while(n.next!=slow_ptr)
				{
					++count;
					n=n.next;
				}
			return count;  //return count from while
			}
		}
	return count;          //return count from func countloop
	}

	public static void main(String[] args)
	{
		LinkedList13 llist=new LinkedList13();

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
		System.out.println("Length of loop is : " + llist.countloop());
	}
}
