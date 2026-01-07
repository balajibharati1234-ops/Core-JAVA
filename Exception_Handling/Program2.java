import java.io.*;
class Demo{
	static void userInput()throws IOException{
	   
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter company Name :");
		String cmpName = br.readLine();
		System.out.println("Company Name is: "+ cmpName);

		System.out.println("Enter company Loc :");
                String cmpLoc = br.readLine();
                System.out.println("Company Name is: "+ cmpLoc);

	}
}
class Client{
    public static void main(String[] args)throws IOException{
      
	    System.out.println("Start Main");
	    Demo.userInput();
	    System.out.println("End Main");
    }
}
