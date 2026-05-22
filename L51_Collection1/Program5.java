
//Collection Methods

import java.util.*;
class Demo{

	public static void main(String[] args){
	
		Collection<String> cobj1 = new ArrayList<String>();

		//1. boolean add(Object o)
		cobj1.add("Kanha");
		cobj1.add("Ashish");
		cobj1.add("Rahul");
		cobj1.add("Badhe");

		Collection<String> cobj2 = new ArrayList<String>();

		cobj2.add("Shiv");
		cobj2.add("Subhodh");
		cobj2.add("Govind");
		cobj2.add("Vishal");
		cobj2.add("Prajwal");

		System.out.println(cobj1);
		System.out.println(cobj2);

		//2. boolean addAll(Collection c);
	        cobj1.addAll(cobj2);
		System.out.println(cobj1);

		//3. boolean remove(Object o);
		cobj1.remove("Badhe");
		System.out.println(cobj1);

		//4. boolean removeAll(Collection c);
		cobj1.removeAll(cobj2);
		System.out.println(cobj1);

		//5. retainAll(Collection c)
		cobj1.add("Shiv");
		cobj1.add("Subhodh");
		cobj1.retainAll(cobj2);
		System.out.println(cobj1);

		//6. void clear();
		cobj2.clear();
		System.out.println(cobj2);

		//7. boolean contains(Object o);
		//System.out.println(cobj1);
		System.out.println(cobj1.contains("Ashish"));

		//9. boolean containsAll(Collection c );
		System.out.println(cobj1.containsAll(cobj2));
	
		//10. int size();
		System.out.println(cobj1.size());

		//11. Object[] to Array();
		
		Object arr[] = cobj1.toArray();
		for(Object data : arr){
		
			System.out.println(data);
		}

	
	}
}
