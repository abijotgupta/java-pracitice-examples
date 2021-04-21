//program to find length of loop in the linked list

class LinkedList15
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

	public void movetofront()
	{
		if(head==null || head.next==null)
		return;

		Node prev_node=null;
		Node current_node=head;

		while(current_node.next!=null)
		{
			prev_node=current_node;
			current_node=current_node.next;
		}

		prev_node.next=null;
		current_node.next=head;
		head=current_node;
	}

	public static void main(String[] args)
	{
		LinkedList15 llist=new LinkedList15();

		llist.push(50);
		llist.push(40);
		llist.push(30);
		llist.push(20);
		llist.push(10);

		System.out.println("Elements of linked list is");
		llist.display();
		System.out.println();

		llist.movetofront();
		System.out.println("Elements after moving are : ");
		llist.display();
		System.out.println();


	}
}




