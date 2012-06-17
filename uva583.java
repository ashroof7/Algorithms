import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class uva583 {
			
	public static void primeFactors(int n) {
		StringBuilder s = new StringBuilder();
		for (int i = 2; i <= n / i ; i++) {
			while (n % i == 0) {
				s.append(i);
				s.append(" x ");
				n /= i;
			}
		}
		if (n > 1) {
			s.append(n);
			s.append(" x ");
		}
		
		
		System.out.println(s.substring(0, s.length()-3));
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		while(true){
			n = Integer.parseInt(br.readLine());
			if(n==0)System.exit(0);
			if (n<0)System.out.print(n+" = -1 x ");
			else System.out.print(n+" = ");
			primeFactors(Math.abs(n));
		}

	}

}
