import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class uva11417 {

	
	public static int GCD(int a, int b){
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
		int N = Integer.parseInt(br.readLine());
		
		while(N!=0){
			int G=0;
			for(int i=1;i<N;i++)
			for(int j=i+1;j<=N;j++)
			{
			    G+=GCD(i,j);
			}
			System.out.println(G);
			N=Integer.parseInt(br.readLine());
		}

	}

}
