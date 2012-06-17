import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class uva10650 {

	
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
	
	static int lower = 2 , upper = 8;
	
	public static void main(String[] args) {
	sieve(3200);
	System.out.println(primes.toString());

	int current;
	int next;
	String s="";
//	2 3 5 7  
	System.out.println(primes.size());
	for (int i = 0; i <= 425-2; i++) {
		current = primes.get(i);
		next = primes.get(i+1);
		
	}
	
	}

}
