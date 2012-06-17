import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class uva11827 {
	
	static int GCD(int a, int b){
		int r;
		while(b>0){
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	} 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk;
		
		int n[] = new int[101];
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			tk = new StringTokenizer(br.readLine());
			int i = tk.countTokens();
			int j =0 ;
			for (j = 0  ; j < i; j++) 
				n[j] = Integer.parseInt(tk.nextToken());
			
			int ans = 1;
			for (int a = 0; a < j ; a++){
		        for(int b = a+1; b < j ;b++){
		                ans = Math.max(GCD(n[a],n[b]),ans);
		        }
		    }
			System.out.println(ans);
		}
		
	}

}
