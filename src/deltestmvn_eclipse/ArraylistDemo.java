package deltestmvn_eclipse;

//It is a framework to store multiple elements.
// Sub-child interfaces are - List, Queue, Set.

import java.util.*;


public class ArraylistDemo {

	public static void main(String[] args) {
		List<Integer> Arrlist = new ArrayList<>();
		Arrlist.add(50);
		Arrlist.add(90);
		Arrlist.add(2, 40);
		Arrlist.add(null);
		Arrlist.add(50);
		System.out.println(Arrlist);
		
/* Rules - Insertion order is maintained.
 * Duplicates are allowed.
 * Null value is accepted
 * No need to define the size.
 */
		System.out.println(Arrlist.get(2));
		System.out.println(Arrlist.get(3));
		System.out.println(Arrlist.size());
		Arrlist.set(3, 110);
		Arrlist.remove(4);
		System.out.println(Arrlist);
		System.out.println(Arrlist.size());
		Arrlist.add(2, 30);
		System.out.println(Arrlist);
		System.out.println(Arrlist.contains(null));
		System.out.println(Arrlist.contains(90));
		
		ArrayList<Integer> Arrlist2 = new ArrayList<>();
		Arrlist2.addAll(Arrlist); 	// Add everything in 1st Array from 2nd Array
		System.out.println(Arrlist2);
		System.out.println(Arrlist2.size());
		ArrayList<Integer> Arrlist3 = new ArrayList<>();
		Arrlist3.add(10);
		Arrlist3.add(20);
		Arrlist3.add(40);
		Arrlist3.addAll(1, Arrlist2);
		System.out.println(Arrlist3);
		Arrlist3.clear();
		System.out.println(Arrlist3);
		/*int i;		
		for (i=0; i< Arrlist.size()-1; i++);
		Arrlist3.add(Arrlist.get(i));
		System.out.println(Arrlist3);
		*/

	}

}
