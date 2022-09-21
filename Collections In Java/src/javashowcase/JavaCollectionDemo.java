package javashowcase;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaCollectionDemo {
	
	public static void main(String[] args) {
		doListDemo();
	}

	private static void doListDemo() {
		System.out.println("In dolistDemo");
		
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
