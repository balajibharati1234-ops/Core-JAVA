
import java.util.*;
class Demo{

	public static void main(String[] args){
	
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		// For each loop
		for(Integer data : al){
			System.out.println(data);
		}
	
	}
}
