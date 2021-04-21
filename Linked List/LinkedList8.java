//program to find nth node in the linked list

class LinkedList8
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

	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data +"  ");
			temp=temp.next;
		}
	}

/* Takes index as argument and return data at index*/
    public int GetNth(int index)
    {
        Node current = head;
        int count = 0; /* index of Node we are
                          currently looking at */
        while (current != null)
        {
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }

        /* if we get to this line, the caller was asking
        for a non-existent element so we assert fail */
        assert(false);
        return 0;
    }



	public static void main(String[] args)
	{
		LinkedList8 llist=new LinkedList8();

		llist.push(60);
		llist.push(50);
		llist.push(40);
		llist.push(30);
		llist.push(20);
		llist.push(10);

		System.out.println("Elements of linked list is");
		llist.display();

		System.out.println();
		System.out.println("3th node of linked list is : "  + llist.GetNth(3));
	}
}

