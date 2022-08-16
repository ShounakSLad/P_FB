package shounak01;

public class Overriding_Child extends Overriding_Parent{
	public void show() {
		
		System.out.println("show-child test");
	}

	public void run(char c) {
		System.out.println("run-child test");
	}
	
	
	public static void main(String[] args) {
		Overriding_Child test1=new Overriding_Child();
		test1.show();
		test1.run('c');
		
		Overriding_Parent testparent=new Overriding_Parent();
		testparent.show();
		testparent.run('c');

	}

}
