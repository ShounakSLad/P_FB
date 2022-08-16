import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
			 
				HashMap<String,String> map=new HashMap<String,String>();
				map.put("first", "test one");
				map.put("second", "test two");
				map.put("third", "test three");
				
				System.out.println(map);
				
			    map.remove("second");
				System.out.println(map);
				
				map.clear();
				System.out.println(map);
			
				

			}

		}


