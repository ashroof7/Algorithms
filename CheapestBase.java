import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CheapestBase {

	public static int cost[] = new int[36];

	public static void main(String[] args) throws IOException {
		boolean ter = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int r = 1; r <= t; r++) {
			if (r==t)ter=false;
			System.out.println("Case " + r + ":");
			for (int i = 0; i < 4; i++) {
				StringTokenizer tk = new StringTokenizer(br.readLine());
				for (int j = 0; j < 9; j++)
					cost[i * 9 + j] = Integer.parseInt(tk.nextToken());
			}
			
			int n = Integer.parseInt(br.readLine());
			for (int i = 1; i <= n; i++) {
				int x = Integer.parseInt(br.readLine());
				String res = "";
				int min = Integer.MAX_VALUE;
				for (int a = 2; a <= 36; a++) {
					int temp = x;
					int res_temp = 0; 
					while (temp > 0) {
						res_temp += cost[temp % a];
						temp /= a;
					} 
					if (res_temp < min) {
						min = res_temp;
						res = Integer.toString(a);
					} else if (res_temp == min)
						res += " " + Integer.toString(a);
					
				}
				System.out.println("Cheapest base(s) for number "+x+": "+res);
			}
			if(ter)
			System.out.println();
		}
	}

}