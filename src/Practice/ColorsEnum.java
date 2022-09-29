package Practice;
enum color{
	primaryColors,
	secondaryColors,
	rainbowColors,
}

public class ColorsEnum {

	public static void main(String[] args) {
		color myColor = color.rainbowColors;
		
  switch (myColor) {

    case primaryColors:
	  System.out.println("RED,BLUE,YELLOW");
	  break;
	  
    case secondaryColors:
    	System.out.println("ORANGE,GREEN,PURPLE");
    	break;
    	
    case rainbowColors:
    	System.out.println("VIOLET,INDIGO,BLUE,GREEN,YELLOW,ORANGE,RED");
    	break;
	default :
		System.out.println("IT IS IN WHITE COLOR");
	
}
	}

}
