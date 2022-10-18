package Practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPrac {

	public static void main(String[] args) {
		
		// USING ARRAYLIST FOR PRACTICE
		
		
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> regNum = new ArrayList<Integer>();
		regNum.add(1);
		regNum.add(3);
		regNum.add(2);
		name.add("xxxx"); 
		name.add("wwww");
		name.add("ssss");
		name.set(2,"yyyy");
		//name.remove("xxxx");
		System.out.println(name.get(1));
		System.out.println(name.get(0));
		
		// BEFORE SORTING
		System.out.println("NORMAL VIEW IS : ");
		System.out.println(regNum);
		System.out.println(name);
		
		// AFTER SORTING
		System.out.println("SORTED VIEW IS : ");
		Collections.sort(regNum);
		System.out.println(regNum);
		Collections.sort(name);
		System.out.println(name);
	  
		// FOR EACH LOOP
		for(int i : regNum) {
		System.out.println("REGISTER NUMBER IS : "+ i);}
		for (String j : name) {
		System.out.println("NAME OF THE STUDENT IS : "+ j);
		}
		
		// FOR LOOP
		for(int i= 0; i<regNum.size(); ++i) {
			System.out.println(regNum.get(i));
		}
		for(int j=0; j<name.size();++j) {
			System.out.println(name.get(j));
		}
		}
	}


