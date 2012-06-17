import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva10344 {

	static int n[] = new int[5], can, i, a, b, c = 0 , d, e, m[] = new int[5];
	static boolean v[] = new boolean[5];

	static void solve(int i, int sum) {
		if (i >= 5) {
			if (sum == 23)
				can = 1;
		} else {
			if(can==0)
			solve(i + 1, sum + m[i]);
			if(can==0)
			solve(i + 1, sum - m[i]);
			if(can==0)
			solve(i + 1, sum * m[i]);
		}
	}

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk;
		while (true) {
			tk = new StringTokenizer(br.readLine());
			for (int i = 0; i < 5; i++)
				n[i] = Integer.parseInt(tk.nextToken());

			if (n[0] == 0 && n[1] == 0 && n[2] == 0 && n[3] == 0 && n[4] == 0)
				return;

			for (a = 0; a < 5 && can==0; a++) {
				v[a] = true;
				for (b = 0; b < 5; b++) {
					if (!v[b] && can==0) {
						v[b] = true;
						for (c = 0; c < 5; c++) {
							if (!v[c]&& can==0) {
								v[c] = true;
								for (d = 0; d < 5; d++) {
									if (!v[d] && can==0) {
										v[d] = true;
										for (e = 0; e < 5; e++) {
											if (!v[e] && can==0) {
												v[e] = true;

												m[0] = n[a];
												m[1] = n[b];
												m[2] = n[c];
												m[3] = n[d];
												m[4] = n[e];
//												can = 0;
												solve(1, n[0]);
												v[e] = false;
											}
										}
										v[d] = false;
									}
								}
								v[c] = false;
							}
						}
						v[b] = false;
					}
				}
				v[a] = false;
			}

			if (can == 1){
				System.out.println("Possible");
			}
			else
				System.out.println("Impossible");
			can = 0;
		}
	}

}
