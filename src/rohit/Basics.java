package rohit;

public class Basics {
		int a=50;           // non static/instance variable
		static int b=600;    // static variable
		int c=900;            // to call this need a object in main method
		boolean e=true;       // to call this need a object in main method
	
		public static void main(String[] args) {
			int d=700;         // local variable (inside the method is local variable)
			boolean f=false;   // to call the static variable we can directly call 
			                   // to call non static variable or instance variable we have to create an object of that class name 
	
			
			System.out.println(f);
		    System.out.println(b);           // for static we can call directly w/o object
			System.out.println(d);
			
		   // System.out.println(a);    // wont call directly w/o object
		   // System.out.println(c);    // wont call directly w/o object
		   // System.out.println(e);    // wont call directly w/o object
		    
		    
			//Basics obj=new Basics();   // "new" means create new object 
			
		//	System.out.println(obj.a);
		//	System.out.println(obj.c);
		//	System.out.println(obj.e);
			
			
			
		   Second();	// if method is static then we can call by this Second();
		 //  obj.third();     // need to do this for next method variable calling
		   
		   Basics2 R=new Basics2();
			  System.out.println(R.g);
			  System.out.println(R.h);
			  // System.out.println(R.k);  wont run bcz access modifier is private
		}
		
		 public static void Second() {           // 2nd method
			 int l=100;           //local variable
			 double m= 10.5;
			 float n=8;
		     boolean o=true;
		  
		
		System.out.println(l);

    }
		 
	  public void third() {			 // 3rd method
		 int t=300;
			 
			 System.out.println(t);
  }
	
}		

   class Basics2 {
	public int g=88;
	protected int h=88;
	private int k=88;
	 
	  
  }

		   	
		
		

		
