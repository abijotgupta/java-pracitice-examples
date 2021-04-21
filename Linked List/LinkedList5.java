// Java program to delete a linked list

class LinkedList5
{
	Node head;       //head of the list

	class Node       //Linked List node
	{
		int data;
		Node next;

		Node(int d)
		{
			data=d;
		}
	}

	 /* Inserts a new Node at front of the list. */
	 public void push(int new_data)
	 {

     /* 1 & 2: Allocate the NodePut in the data*/
     Node new_node = new Node(new_data);

	 /* 3. Make next of new Node as head */
	 new_node.next = head;

	 /* 4. Move the head to point to new Node */
	 head = new_node;

   	 }


   	   /* Function deletes the entire linked list */
	     void deleteList()
	     {
	         head = null;
         }



	 /* This function prints contents of linked list starting from
	        the given node */
	    public void printList()
	    {
	        Node n = head;
	        while (n != null)
	        {
	            System.out.print(n.data+" ");
	            n = n.next;
	        }
		}

		 public static void main(String[] args)
		 {
			 /* Start with the empty list */
		     LinkedList5 llist = new LinkedList5();

		   	 llist.push(10);
		     llist.push(20);
		     llist.push(30);
		     llist.push(40);
		     llist.push(50);
		     llist.push(60);
		     llist.push(70);
			 llist.push(80);
			 llist.push(90);

		     System.out.println("Elements are:  ");
		     llist.printList();

			 System.out.println();

		     llist.deleteList();
		     System.out.println("Elements are:  ");
		     llist.printList();
		 }

}

