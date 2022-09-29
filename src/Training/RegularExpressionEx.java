package Training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("revathi", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("Hello Revathi!");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }


	}

}
