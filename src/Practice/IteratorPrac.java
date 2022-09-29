package Practice;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorPrac {

	public static void main(String[] args) {
		ArrayList<Character> alpha = new ArrayList<Character>();
		alpha.add('A');
		alpha.add('B');
		alpha.add('C');
		alpha.add('D');
		alpha.add('E');
		alpha.add('F');
		Iterator<Character> d =  alpha.iterator();
		System.out.println(d.next()); 
  
		/*ArrayList<String> alpha = new ArrayList<String>();
		alpha.add("A");
		alpha.add("B");
		alpha.add("C");
		alpha.add("D");
		alpha.add("E");
		alpha.add("F");
		Iterator<String> dis1 =  alpha.iterator();*/
		
		// WHILE LOOP
		   while(d.hasNext())
		      System.out.println(d.next()); 

		/* // FOR EACH LOOP
		     for(String alpha1:alpha) {
			 System.out.println(dis1.next()); */
		    } 
		
		// WHILE LOOP WITH IF CONDITION
		
		 /*   while(dis1.hasNext()) {
			String dis2 = dis1.next();
			if(dis2.equals("C")) {
			System.out.println(dis2);
			}
		}
		*/
		}
	


