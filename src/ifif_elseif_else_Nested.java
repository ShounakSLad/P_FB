
public class ifif_elseif_else_Nested {

	public static void main(String[] args) {
	
	String address="panjim,goa,india";
		
		if(address.contains("india")) 
		    
		     {if(address.contains("panhala,maharashtra,india")) {
		     System.out.println("you are inside the panhala");}	
		
		           else if(address.contains("panjim,goa,india")) {
		           System.out.println("your inside the panjim");}
          
		      else {
			  System.out.println("address mismatch");
			}
		}
		
		else {
			System.out.println("out of mentioned states");
	}
  }
}		

	


