import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sieve {

	static List<Integer> primes = new ArrayList<Integer>();
	static boolean p[];

	static void sieve(int max) {
		p = new boolean[max + 1];
		Arrays.fill(p, true);
		p[0] = p[1] = false;

		for (int i = 2; i*i < max + 1; i++) {
			if (p[i]) {
				for (int j = i * i; j < max+1; j += i)
					p[j] = false;
				primes.add(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
