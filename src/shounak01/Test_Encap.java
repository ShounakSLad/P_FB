package shounak01;

public class Test_Encap  extends Encapsulation_test{  
    

	public static void main(String[] args) {
	
		Test_Encap encap=new Test_Encap();
		encap.setName("Amitabh");
		System.out.println(encap.getname());
		encap.setID("AB123");
        System.out.println(encap.getID());
        
        encap.setName("Shounak");
        System.out.println(encap.getname());
	    encap.setID("S123");
	    System.out.println(encap.getID());
	 
	    
	}

}
