import java.io.*;
import java.util.*;

class TokenDemo {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
	      
	
			
			System.out.println("Enter society name, wing,flatno");
                           String info = br.readLine();

			   System.out.println(info);

                      StringTokenizer obj = new StringTokenizer(info,",");

			   String token1 = obj.nextToken();
			   String token2 = obj.nextToken();
			   String token3 = obj.nextToken();

			   System.out.println("society = " + token1);
			   System.out.println("wing = " + token2); 
			   System.out.println("flat = " + token3);
			
	
	}

}
