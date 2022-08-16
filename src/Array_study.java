
public class Array_study {

	public static void main(String[] args) {
		
		String names[]=new String[5];
		names[0]="tom";
		names[1]="jerry";
		names[2]="henry";  
		names[3]="mack";
	//	names[4]="jack";                    // if not used then show null value    
	//	names[5]="robert";                  // will show the exception bcz length is 5 
		
		for(int i=0; i<5; i++) {
			System.out.println(names[i]);
		}
		
	}

}
