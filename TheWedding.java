
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheWedding {
	public static int result[] = { Integer.MAX_VALUE, Integer.MAX_VALUE,
			Integer.MAX_VALUE, Integer.MAX_VALUE };
	public static int t_price[], r_price[], h_price[];
	public static boolean t_combine[][], r_combine[][], h_combine[][];
	public static int t, r, h;

	public static void solve() {
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < r; j++) {
				if (!t_combine[i][j])
					continue;
				for (int k = 0; k < h; k++) {
					if (!r_combine[j][k])
						continue;
					if (h_combine[k][i]) {
						int temp = t_price[i] + r_price[j] + h_price[k];
						if (result[3] < temp)
							continue;
						result[0] = i;
						result[1] = j;
						result[2] = k;
						result[3] = temp;
					}

				}

			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while(true){
			s= br.readLine();
			if (s==null)System.exit(0);
		StringTokenizer tk = new StringTokenizer(s);
		
		for(int i =0 ;i<4 ; i++)result[i]=Integer.MAX_VALUE;
		t = Integer.parseInt(tk.nextToken());
		r = Integer.parseInt(tk.nextToken());
		h = Integer.parseInt(tk.nextToken());

		t_price = new int[t];
		r_price = new int[r];
		h_price = new int[h];
		t_combine = new boolean[t][r];
		r_combine = new boolean[r][h];
		h_combine = new boolean[h][t];

		for (int i = 0; i < t; i++) {
			tk = new StringTokenizer(br.readLine());
			t_price[i] = Integer.parseInt(tk.nextToken());
			for (int j = 0; j < r; j++) {
				if (tk.nextToken().equals("0"))
					t_combine[i][j] = true;
			}
		}
		for (int i = 0; i < r; i++) {
			tk = new StringTokenizer(br.readLine());
			r_price[i] = Integer.parseInt(tk.nextToken());
			for (int j = 0; j < h; j++) {
				if (tk.nextToken().equals("0"))
					r_combine[i][j] = true;
			}
		}
		for (int i = 0; i < h; i++) {
			tk = new StringTokenizer(br.readLine());
			h_price[i] = Integer.parseInt(tk.nextToken());
			for (int j = 0; j < t; j++) {
				if (tk.nextToken().equals("0"))
					h_combine[i][j] = true;
			}
		}
		solve();
		if (result[0]  == Integer.MAX_VALUE)System.out.println("Don't get married!");
		else System.out.println(result[0]+" "+result[1]+" "+result[2]+":"+result[3]);

	}
	}
}
	
