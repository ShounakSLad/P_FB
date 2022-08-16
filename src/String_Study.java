
public class String_Study {

	public static void main(String[] args) {
		
		String a="my name is arjun";
		String b="MY NAME IS ARJUN";
		String c="letter_count(16)";

		System.out.println(a.equalsIgnoreCase(b));     // equal ignore case (not case sensitive)
	
	    System.out.println(c.length());                // length---- starts from 1
        String d= a.concat(" lad");              // concat ----to add in existing  data
	    System.out.println(a);
	    System.out.println(d);
        	
	    System.out.println(a.equals(b));          // only equals case (case sensitive)
	
	    char e=a.charAt(1);
	    System.out.println(e);                   // index start from 0 1 2 3 ....
	
	    System.out.println(a==b);                //  " == "   case sensitive
 
	    String f=" trim ";
	    System.out.println(f.trim());             // to trim starting & ending spaces 
	    
	  
	    f.replace('t','T');
	    System.out.println(f.replace('t','T'));     // to replace the old one with new
	    System.out.println(f.endsWith("m "));       // to check ends with characters
	    System.out.println(f.startsWith(" t"));     // case sensitive
	    System.out.println(f.toUpperCase()); 
	    System.out.println(b.toLowerCase());
	    
	    String g="How@are@you@";
	   
	    String[] h=g.split("@");
	    String g1=h[0];
	    String g2=h[1];
	    String g3=h[2];
	 //   String g4=h[3];  java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	    System.out.println(g1);
	    System.out.println(g2);
	    
	    String i="my name is arjun";
	    String[] j=i.split(" ");
	    String i1=j[0];
	    String i2=j[1];
	    String i3=j[2];
	    String i4=j[3];
	    System.out.println(i2);
	}

}
