import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class uva128 {

	/**
	 * Explanation: (a+c)%g = 0
	 * a+c = 0 (mod g)
	 * c = -a (mod g)
	 * c = g - a (mod g)  adding g or subtracting it doesn't affect the congruent; 
	 */
	
	public static void main(String[] args) throws IOException {
		String h = "0123456789ABCDEF";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int a =0 ;
		int c =0 ;
		int g =34943 ;
		while(!s.equals("#")){
			for (int i = 0; i < s.length(); i++) 
				a =( (a<<8) + s.charAt(i))% g;
			a = (a<<8) % g;
			a = (a<<8) % g;
			c = (g-a)%g ;
			System.out.println(h.charAt((c>>12)) + ""+h.charAt(c>>8 &15) +" "+h.charAt(c>>4 & 15) +""+ h.charAt(c&15));
			a = c = 0;
			s = br.readLine();
		}
		
	}

}
