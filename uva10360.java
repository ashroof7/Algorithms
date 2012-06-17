import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class uva10360 {

	static int d, x, y, kill, n, c;
	static int map[][] = new int[1025][1025];

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk;
		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			
			d = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());

			for (int i = 0; i < n; i++) {
				tk = new StringTokenizer(br.readLine());
				x = Integer.parseInt(tk.nextToken());
				y = Integer.parseInt(tk.nextToken());
				c = Integer.parseInt(tk.nextToken());

				for (int j = y - d; j <= y + d; j++) {
					if (j < 0)
						continue;
					else if (j >= 1025)
						break;

					for (int k = x - d; k <= x + d; k++) {
						if (k < 0)
							continue;
						else if (k >= 1025)
							break;
						map[j][k] += c;
					}
				}
			}
			

			kill = 0;
			x = 0;
			y = 0;

			for (int j = 0; j < 1025; j++) {
				for (int i = 0; i < 1025; i++) {
					if (kill < map[i][j]) {
						kill = map[i][j];
						x = j;
						y = i;
					}
					map[i][j] = 0;
				}
			}

			System.out.println(x + " " + y + " " + kill);
		}
	}

}
