

import java.util.*;
class Demo{

	public static void main(String[] args){
	
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al);

		ListIterator itr = al.listIterator();

		while(itr.hasNext()){
		
			System.out.println(itr.next());
		}
		while(itr.hasPrevious()){
		
			System.out.println(itr.previous());
		}
	}
}
