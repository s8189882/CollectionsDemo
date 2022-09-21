package javashowcase;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class JavaCollectionDemo {
	
	public static void main(String[] args) {
		doListDemo();
		doStackDemo();
	}

	private static void doStackDemo() {
		System.out.println("\nIn doStackDemo\n");	
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		
		String pop = stack.pop();
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void doListDemo() {
		System.out.println("\nIn dolistDemo\n");
		
		//creating List
		List<String> list = new LinkedList<>();
		
		//adding objects to list
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		//Traversing list through Iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
