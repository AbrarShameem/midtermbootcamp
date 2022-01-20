package datastructure;
import java.util.*;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");
		System.out.println(alist);
		alist.add(3, "Steve");
		System.out.println(alist);

		alist.remove("Steve");
		alist.remove("Angela");
		System.out.println(alist);
		alist.remove(2);
		System.out.println(alist);
		System.out.println("Head of the list:" + UseArrayList.peek());
		System.out.println("The element at index 3 in the ArrayList is: " + alist.get(3));

		for(String str:alist)
			System.out.println(str);
	}

	private static String peek() {
	}

}
