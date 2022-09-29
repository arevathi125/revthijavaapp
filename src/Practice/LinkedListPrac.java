package Practice;

import java.util.LinkedList;

public class LinkedListPrac {

	public static void main(String[] args) {
		LinkedList<Integer> numbs = new LinkedList<Integer>();
        numbs.add(1);
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);
        numbs.add(4);
        
        numbs.addFirst(0);
        numbs.addLast(5); 
        numbs.removeFirst();
        numbs.removeLast();
        numbs.set(2,40);
       System.out.println(numbs.getFirst());
       System.out.println(numbs.getLast());
        System.out.println(numbs);
	}

}
