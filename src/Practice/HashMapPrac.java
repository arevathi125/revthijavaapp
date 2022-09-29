package Practice;

import java.util.Collections;
import java.util.HashMap;

public class HashMapPrac {

	public static void main(String[] args) {
		HashMap<Integer,String> numbNames = new HashMap<Integer,String>();
		numbNames.put(1, "ONE");
		numbNames.put(2, "TWO");
		numbNames.put(3, "THREE");
		numbNames.put(4, "FOUR");
		numbNames.put(5, "FIVE");
		numbNames.put(6, "SIX");
		numbNames.put(7, "SEVEN");
		numbNames.put(8, "EIGHT");
		numbNames.put(9, "NINE");
		numbNames.put(10, "TEN");
		System.out.println(numbNames);
		numbNames.remove(6);
		System.out.println(numbNames);
		//numbNames.get("1");
		System.out.println(numbNames.get(1));
		numbNames.put(1,"one");
		System.out.println(numbNames);
		numbNames.clear();
		System.out.println(numbNames);
		numbNames.get(1);
		System.out.println(numbNames.get(1));
	}

}
