import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva11005 {


	public static void main(String[] args) throws IOException {
		int c[] = new int[36], tc, t, n, i, min, temp, m = 0, l = 1;
		String ans = "";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk;
		tc = Integer.parseInt(br.readLine());

		while (tc-- > 0) {
			tk = new StringTokenizer(br.readLine());
			for (int j = 0; j < c.length; j++) {
				if (j == 9 || j == 18 || j == 27)
					tk = new StringTokenizer(br.readLine());
				c[j] = Integer.parseInt(tk.nextToken());


			}

			t = Integer.parseInt(br.readLine());

			if (l > 1)
				System.out.println();
			System.out.println("Case " + (l++) + ":");

			while (t-- > 0) {
				m = Integer.parseInt(br.readLine());

				min = Integer.MAX_VALUE;

				for (i = 2; i < 37; i++) {
					n = m;
					temp = 0;

					while (n > 0) {
						temp += c[n % i];
						n /= i;
					}

					if (temp < min) {
						min = temp;
						ans = i + "";
					}

					else if (temp == min) {
						ans += " " + i;
					}

				}
				
				System.out.println("Cheapest base(s) for number " + m + ": "
						+ ans);
			}
		}

	}

}
