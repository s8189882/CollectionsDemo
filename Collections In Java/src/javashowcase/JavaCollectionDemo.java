package javashowcase;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class JavaCollectionDemo {
	
	public static void main(String[] args) {
		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();
	}

	private static void doSetDemo() {
		System.out.println("\nIn doSetDemo\n");
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		for (String str : set) {
			System.out.println(str);
		}	
	}

	private static void doQueueDemo() {
		System.out.println("\nIn doQueueDemo\n");
		
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("Jaishankar");
		queue.add("Raj");
		
		System.out.println("head : " + queue.element());
		System.out.println("head : " + queue.peek());
		
		System.out.println("\nIterating the queue elements");
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		queue.remove();
		queue.poll();
		System.out.println("\nAfter removing twos elements");
		Iterator itr2 = queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
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
