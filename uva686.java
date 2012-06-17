import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class uva686 {

	static List<Integer> primes = new ArrayList<Integer>();
	static boolean p[];

	static void sieve(int max) {
		p = new boolean[max + 1];
		Arrays.fill(p, true);
		p[0] = p[1] = false;

		for (long i = 2; i < max + 1; i++) {
			if (p[(int) i]) {
				for (long j = i * i; j < max + 1; j += i)
					p[(int) j] = false;
				primes.add((int) i);
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		sieve(1000000);
		int n, temp, res;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		while (n > 0) {
			res = 0;
			for (int i = 0; i <= 1000000; i++) {
				temp = n - primes.get(i);
				if (temp < primes.get(i))
					break;
				if (p[temp]) {
					res++;
				}
			}

			System.out.println(res);

			n = Integer.parseInt(br.readLine());
		}
	}

}
