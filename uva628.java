import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uva628 {

	static int d, r;
	static String[] dic;
	static String regex;

	public static void solve(String s, int n) {
		if (n == regex.length())
			System.out.println(s);
		else if (regex.charAt(n) == '0') {
			for (int i = 0; i < 10; i++) {
				solve(s + "" + i, n + 1);
			}
		} else
			for (int i = 0; i < dic.length; i++) {
				solve(s + dic[i], n + 1);
			}
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (true) {
			s = br.readLine();
			if (s == null || s.isEmpty())
				System.exit(0);

			d = Integer.parseInt(s);
			dic = new String[d];
			for (int i = 0; i < d; i++) 
				dic[i] = br.readLine();


			r = Integer.parseInt(br.readLine());
			System.out.println("--");
			for (int i = 0; i < r; i++) {
				regex = br.readLine();
				solve("", 0);
			}
		}
	}
}
