package shounak01;

public class Animal {
    //method----> set of code or block of code which perform certain activity/certain task
	public int legs=4; //variable
	int eyes=2;
	boolean has_Tail=true;
	
	
	public void run()   //method-running,eating,etc.
	{
		System.out.println("I am running");
	}
	
    public void eat_veg()
    {
    	System.out.println("I am eating veg food");
    }
    
    public void eat_nonVeg()
    {
     System.out.println("I am eating nonveg food");
     
    }
	public static void main(String[] args) {    //this is main method and be static
		// we can create multiple objects in class
		// we can use to call certain method which is useful to perform our task
		
		Animal dog=new Animal();//veg    this is object
		Animal tiger=new Animal();//nonveg
		Animal lion=new Animal();//nonveg
		Animal cat=new Animal();//veg
        Animal bear=new Animal();
        
        
		dog.eat_veg();
		lion.eat_nonVeg();
		
		//we use variable to display or to show the properties of the boject
		bear.has_Tail=false;
		System.out.println("tail for bear is "+bear.has_Tail);
		
		cat.has_Tail=true;
		System.out.println("tail for cat is "+cat.has_Tail);
		
		
	}

}
