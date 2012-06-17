import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class uva574 {


	
	static int list[] ;
	static int s = 4;
	static int n;
	static String c;
	static boolean got1 ;
	static LinkedList<String> sols = new LinkedList<String>();
	
		
	
	public static void solve(int sum, String collect,int start){
		if (sum == s){
			got1 = true;
			for (String temp : sols){
				if (collect.equals(temp))return;
			}
			sols.add(collect);
			System.out.println(collect.substring(0,collect.length()-1));
		}
			else for (int i = start; i < list.length; i++) {
				int temp = sum + list[i];
				if (temp>s)continue;
				solve(temp, collect + list[i] + "+" ,i+1);
			}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk ;
		while(true){
			tk= new StringTokenizer(br.readLine());
			s = Integer.parseInt(tk.nextToken());
			n = Integer.parseInt(tk.nextToken());
			if (s==0 || n==0)System.exit(0);
			
			System.out.println("Sums of "+ s +":");
			list = new int[n];
			
			for (int i = 0; i < n; i++) {
				list[i] = Integer.parseInt(tk.nextToken());
			}
			got1 = false ;
			solve(0,"",0);
			if (!got1)System.out.println("NONE");

		}
}
}
