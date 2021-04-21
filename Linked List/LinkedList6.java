//program to find length of a linkedlist

class LinkedList6
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

	public int length()
	{

		Node current=head;
		int count=0;
		while(current!=null)
		{
			count++;
			current=current.next;
		}

		return count;
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

	public static void main(String[] args)
	{
		LinkedList6 llist=new LinkedList6();

		llist.push(60);
		llist.push(50);
		llist.push(40);
		llist.push(30);
		llist.push(20);
		llist.push(10);

		llist.display();

		System.out.println();

		System.out.println("Length of linked list is :  "+ llist.length());


	}

}


