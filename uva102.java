import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class uva102 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i, temp[] = new int [6], min, n[][] = new int[3][3];
		String l[] = {"BCG", "BGC", "CBG", "CGB", "GBC", "GCB"};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk;
		String s;

		while (true) {
			s = br.readLine();
			if (s == null || s.isEmpty())
				System.exit(0);
			tk = new StringTokenizer(s);
			for (int m = 0; m < n.length; m++) {
				for (int m2 = 0; m2 < n[0].length; m2++) {
					n[m][m2] = Integer.parseInt(tk.nextToken());
				}
			}

			temp[0]= n[0][1] +n[0][2] + n[1][0] +n[1][1] +n[2][0] +n[2][2] ;
			temp[1]= n[0][1] +n[0][2] + n[1][0] +n[1][2] +n[2][0] +n[2][1] ;
			temp[2]= n[0][0] +n[0][1] + n[1][1] +n[1][2] +n[2][0] +n[2][2] ;
			temp[3]= n[0][0] +n[0][1] + n[1][0] +n[1][2] +n[2][1] +n[2][2] ;
			temp[4]= n[0][0] +n[0][2] + n[1][1] +n[1][2] +n[2][0] +n[2][1] ;
			temp[5]= n[0][0] +n[0][2] + n[1][0] +n[1][1] +n[2][1] +n[2][2] ;
			
			min = temp[0] ;
			i = 0;
			for (int m = 1; m < 6; m++) {
				if (temp[m] < min){
					i = m;
					min = temp[m];
				}
			}
			
			System.out.println(l[i]+ " " + min);
		}

	}

}
