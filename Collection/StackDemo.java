package collection;

import java.util.Stack;

public class StackDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		Stack s = new Stack();
		
		System.out.println("Default Capacity of Stack is :" + s.capacity());
		System.out.println("Size of Stack is :" + s.size());
		System.out.print("\n");
		for(int i = 1; i<=10; i++)
		{
			s.push(i);
		}
		
		System.out.println("Capacity of Stack is :" + s.capacity());
		System.out.println("Size of Stack is :" + s.size());
		System.out.print("\n");
		
		s.push("A");
		System.out.println(s);
		System.out.println("Capacity of Stack is :" + s.capacity());
		System.out.println("Size of Stack is :" + s.size());
		System.out.print("\n");
		
		System.out.println(s);
		
		//s.clear();
		s.pop();
		System.out.println(s);
		System.out.println("Capacity of Stack is :" + s.capacity());
		System.out.println("Size of Stack is :" + s.size());
		
		System.out.println("Searched Element is at location " + s.search(10));
		
		System.out.println("Element at peek is : " + s.peek());
		System.out.println("Is satck is Empty : " + s.empty());
		
	}

}
