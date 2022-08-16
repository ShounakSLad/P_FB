package shounak01;

public class AccessModifiers {

	public int i=100;          //public
	protected int j=120;       //protected
	private int k=140;         //private
	        int l=160;         //default
	        
	
	
	
	public static void main(String[] args) {
		AccessModifiers object=new AccessModifiers();
		System.out.println(object.i);
		System.out.println(object.j);
		System.out.println(object.k);
		System.out.println(object.l);
		

	}

}
