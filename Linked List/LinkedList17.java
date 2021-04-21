// Java program to swap two given nodes of a linked list

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class LinkedList17
{
    Node head; // head of list

    /* Function to swap Nodes x and y in linked list by
       changing links */
    public void swapNodes(int x, int y)
    {
        // Nothing to do if x and y are same
        if (x == y) return;

        // Search for x (keep track of prevX and CurrX)
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x)
        {
            prevX = currX;
            currX = currX.next;
        }

        // Search for y (keep track of prevY and currY)
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y)
        {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;

        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else //make y the new head
            head = currY;

        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
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

	public static void main(String[] args)
	{
		LinkedList17 llist = new LinkedList17();

		llist.push(50);
		llist.push(40);
		llist.push(30);
		llist.push(20);
		llist.push(10);

		System.out.println("Elements of linked list is");
		llist.print();
		System.out.println();

		llist.swapNodes(20, 40);
		System.out.println("Elements of linked list after swapping is");
		llist.print();
		System.out.println();
	}
}

