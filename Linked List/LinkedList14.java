//program to remove duplicate elements in the sorted linked list

class LinkedList14
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

	public void rem_duplicate()
	{
		Node current=head;                 /*Another reference to head*/

		while(current!=null)               /* Traverse list till the last node */
		{
			Node temp=current;             //temp must be compared with its previous element

			/*Compare current node with the next node and
            keep on deleting them until it matches the current
            node data */

			while(temp!=null && temp.data==current.data)
			{
				temp=temp.next;
			}
			current.next=temp;           /*Set current node next to the next different element denoted by temp*/
			current=current.next;
		}
	}

	public static void main(String[] args)
		{
			LinkedList14 llist=new LinkedList14();

			llist.push(60);
			llist.push(60);
			llist.push(40);
			llist.push(40);
			llist.push(40);
			llist.push(30);
			llist.push(30);
			llist.push(20);
			llist.push(20);
			llist.push(10);
			llist.push(10);



			System.out.println("Elements of linked list is");
			llist.display();
			System.out.println();

			llist.rem_duplicate();
			System.out.println("Elements after removing duplicates are : ");
			llist.display();
			System.out.println();


		}
	}

