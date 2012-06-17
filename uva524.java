import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class uva524 {
	
	static boolean isPrime[] = {false,false,true,true,false,true,false,true,false,false,
			false,true,false,true,false,false,false,true,false,true,false,false,false,true,
			false,false,false,false,false,true,false,true,false,false,false};
	
	static int n  ; 
	static boolean v[] ;
	
	public static void solve(int c, int prev, String s){
		if (c >= n && isPrime[prev+1] )
			System.out.println(s.substring(0, s.length()-1));
		
		else for (int i = 1; i <= n; i++) {
			if(i==prev)continue;
			if (isPrime[i+prev] && !v[i]){
				v[i] = true;
				solve(c+1, i ,s+i+" ");
				v[i]=false;
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int t = 1;
		while(true){
			s= br.readLine();
			if (s == null || s.isEmpty())System.exit(0);
			n = Integer.parseInt(s);
			v= new boolean[n+1];
			v[1] = true;
			if (t>1)System.out.println();
			System.out.println("Case "+(t++)+":");
			solve(1,1,"1 ");
		}
	}

}
