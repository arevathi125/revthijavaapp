package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionPrac {

	public static void main(String[] args) {
		String s = "All the best all , welcome back all 12345";
		
    /* // finding start and end
         Pattern p = Pattern.compile("all");
         Matcher m = p.matcher(s);
         while( m.find()) {
    	 System.out.println(m.group()+" is starts at "+m.start()+ " and ends at "+m.end());} */
		
	/* // finding alphabets	
	   Pattern p = Pattern.compile("[a-zA-Z]");
	   Matcher m = p.matcher(s);
	   while( m.find()) {
	   System.out.println(m.group()+" is starts at "+m.start());} */
		
	 /* // finding numerical values
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(s);
		while( m.find()) {
		System.out.println(m.group()); }*/
		
	 /*  // case sensitive
		  Pattern p = Pattern.compile("all",Pattern.CASE_INSENSITIVE);
		   Matcher m = p.matcher(s);
		   while( m.find()) {
		   System.out.println(m.group()); }*/
		
		/*  // finding space
		     Pattern p = Pattern.compile("[\s]"); 
		     Matcher m = p.matcher(s);
		     while( m.find()) {
		     System.out.println(m.group()+" is starts at "+m.start());} */
		
		/*   // either ...or 
		       Pattern p = Pattern.compile("[a|1]");
		       Matcher m = p.matcher(s);
		       while( m.find()) {
		        System.out.println(m.group()); }*/
		
		    // countings
		   Pattern p = Pattern.compile("all",Pattern.CASE_INSENSITIVE);
		   Matcher m = p.matcher(s);
		   int count = 0;
		   while( m.find()) {
		   count++;}
           System.out.println("All appears "+ count+ " Times");
}
}