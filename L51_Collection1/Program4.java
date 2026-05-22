
//Enumeration
import java.util.*;
class Demo{

	public static void main(String[] args){
	
		Vector<String> v = new Vector<String>();

		v.add("Kanha");
		v.add("Ashish");
		v.add("Rahul");
		v.add("Badhe");

		System.out.println(v);

		Enumeration<String> itr = v.elements();

		Iterator<String> balaji = itr.asIterator(); 
		while(balaji.hasNext()){
		
			System.out.println(balaji.next());
		}

	}
}
