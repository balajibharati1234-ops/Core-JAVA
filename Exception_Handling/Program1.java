import java.io.*;
class Demo{
   public static void main(String[] args)throws IOException{
    
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   System.out.println("Enter Company Name:");
	   String cmpName = br.readLine();
	   System.out.println("Company Name is : " + cmpName);

             br.close();
	   System.out.println("Enter Company Loc:");
           String cmpLoc = br.readLine();
           System.out.println("Company Location is : " + cmpLoc);
   }
}
