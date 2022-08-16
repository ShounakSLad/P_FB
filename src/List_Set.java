import java.util.ArrayList;
import java.util.HashSet;

public class List_Set {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("tom");
		list.add("jerry");
		list.add("jack");
		
		System.out.println(list);
		
	//	list.clear();                     to clear all the data
		list.remove(1);              // to remove specific index value
		System.out.println(list);

		ArrayList list1=new ArrayList();
		list1.add("a");
		list1.add("jack");            // allows duplicate values
		list1.add("c");
		list1.add("d");

		list.addAll(list1);
		System.out.println(list);
		
		HashSet set=new HashSet(); 
		set.add("a");
		set.add("jack");               // doest follow insertion method choose randomly 
		set.add("c");                 
		set.add("d");
		set.add("d");                 //doesn't allows duplicate values
		System.out.println(set);
	
		HashSet set1=new HashSet(); 
		set1.add("a");
		set1.add("jack");               // doest follow insertion method choose randomly 
		set1.add("c");                 
		set1.add("f");
		      
	set.addAll(set1);
	System.out.println(set);            // does not add duplicate values 
	}
}
