package Practice;

import java.util.HashSet;

public class HashSetPrac {

	public static void main(String[] args) {
		HashSet<String> numbNames = new HashSet<String>();
		numbNames.add("ONE");
		numbNames.add("two");
		numbNames.add("two");
		numbNames.add("AND");
		numbNames.add("A");
		numbNames.add("B");
	    numbNames.add("aaa");
		System.out.println(numbNames.contains("AND"));
		System.out.println(numbNames.size());
		System.out.println(numbNames);
		

	}

}
