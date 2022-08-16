package shounak01;

public class Statements {
             boolean value=true;
	public static void main(String[] args) { // main method
		// to control the flow
		// 1) conditional  statements
		Statements n=new Statements();
        boolean value=true;
		double a=10;
		double b=2;
		 // to do the division only when b is smaller than a
		if(a==b)  //a<b ------- b is greater than a ------a>b b is smaller than a
		{
			System.out.println(n.value);                 // automated note by 
                                                         //creating object in main method
			System.out.println("the condition is true"); // manual text note
			System.out.println(a/b);
			
			
		}
	  
		else	
		{
			System.out.println("condition is failed");
		}
	}
	

}
