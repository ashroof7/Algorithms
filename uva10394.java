import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class uva10394 {


	static List<Integer> primes = new ArrayList<Integer>();
	static boolean p[];

	static void sieve(int max) {
		p = new boolean[max + 1];
		Arrays.fill(p, true);
		p[0] = p[1] = false;

		for (long i = 2; i < max + 1; i++) {
			if (p[(int)i]) {
				for (long j = i * i; j < max+1; j += i)
					p[(int)j] = false;
				primes.add((int)i);
			}
		}
	}

	static int twin[] = new int [100000];

	public static void main(String[] args) throws IOException {
		int count=0;
		sieve(18409400);
		int len = primes.size();
		for (int i = 1; i < len; i++) {
			if (primes.get(i)-primes.get(i-1)==2){
				twin[count++]=primes.get(i);
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s ;
		int n =0;
		while(true){
			s=br.readLine();
			if (s==null || s.isEmpty())System.exit(0);
			n=Integer.parseInt(s)-1;
			System.out.println("("+(twin[n]-2)+", "+twin[n]+")");
		}
		
	}

}
