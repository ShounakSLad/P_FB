package shounak01;// abstraction

public class Rools_Royce_Car extends Vehicle {

	public static void main(String[] args) {
		
		Rools_Royce_Car rrc=new Rools_Royce_Car();
		rrc.start();
		rrc.wipe();
		

	}
    
	@Override
	public void start() {
		
		System.out.println("Car is started");
	}
	
	
	@Override
	public void wipe() {
		
		System.out.println("Wiping when water is on the glass");
	}
}
