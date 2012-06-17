import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class uva11388 {

	static int GCD(int a, int b){
		int r;
		while(b>0){
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	} 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		String ss[];
		int gcd, lcm ;
		int tc = Integer.parseInt(br.readLine());
		
		while(tc-- >0){
			s=br.readLine();
			ss = s.split(" ");
			gcd = Integer.parseInt(ss[0]);
			lcm = Integer.parseInt(ss[1]);
			if(lcm == (lcm/gcd)*gcd)
				System.out.println(gcd +" "+lcm);
			else
				System.out.println(-1);
			
		};
	}

}
