package day22;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		
		
//		ArrayList<Integer>l1 = new ArrayList<Integer>();
//		
//		l1.add(15);
//		l1.add(1, 20);
//		l1.add(0, 10);
//		System.out.println(l1);
		
		ArrayList<String>l2 = new ArrayList<String>();
		
		l2.add("santa");
		l2.addFirst("mukesh");
		l2.addFirst("sedhupathi");
	
		ArrayList<String>l3 = new ArrayList<String>();
		l3.add("karan");
		l3.add("haseena");
		l3.addAll(l2);
		
		System.out.println(l3);
		
		Collections.sort(l3);
		
		System.out.println(l3);
		
		System.out.println(l3.getLast());
		System.out.println(l3.getFirst());
		System.out.println(l2);
//		System.out.println(l3.retainAll(l2));
		System.out.println(l3.remove(0));
		System.out.println(l3);
		
		
		
		
		
		
		
		
	}

}
