import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class test {

	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		BigInteger G,a,b ;

		while(N!=0){
			G = new BigInteger("0");
			
			for(int i=1;i<N;i++){
				a = new BigInteger(i+"");
				for(int j=i+1;j<=N;j++)
			{
				b= new BigInteger(j+"");
			   G =  G.add(a.gcd(b));
			}
			}
			System.out.println(G.toString());
			N=Integer.parseInt(br.readLine());
		}

	}

}
