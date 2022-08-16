package shounak01;

public class constructor_parameterized {

	String languages;
	
	 constructor_parameterized(String lang) {
		
		languages=lang;
		
		System.out.println(languages + "programming language");
		
	}
	
	public static void main(String[] args) {
	
     constructor_parameterized obj1=new constructor_parameterized("java ");
     constructor_parameterized obj2=new constructor_parameterized("python ");
     constructor_parameterized obj3=new constructor_parameterized("c++ ");
     
		
	}

}
