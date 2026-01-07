
import java.io.*;
class Demo{
 
	static void fun() throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	  System.out.println("Enter Employee Loc:");
	  String empLoc = br.readLine();
	  System.out.println("Employee Loc is:"+ empLoc);
	}
}
class Client{

	public static void main(String[] args)throws IOException{
	
		Demo.fun();
	}
}
