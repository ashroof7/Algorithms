import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class uva543 {


	static List<Integer> primes = new ArrayList<Integer>();
	static boolean p[];

	static void sieve(int max) {
		p = new boolean[max + 1];
		Arrays.fill(p, true);
		p[0] = p[1] = false;

		for (int i = 2; i*i < max + 1; i++) {
			if (p[i]) {
				for (int j = i * i; j < max+1; j += i)
					p[j] = false;
				primes.add(i);
			}
		}
	}

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		sieve(1000000);
		int n,temp,index=0;
		boolean gotAns = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		while(n>0){
			index = 0 ;
			gotAns = false ;
		for (int i = 3; i <= 168/2 ; i++) {
			
				temp = n - primes.get(index++);
				if (temp<=0)break;
				if (p[temp]){
					System.out.println(n+" = "+primes.get(index-1)+" + "+temp);
					gotAns = true;
					break;
				}
			}
		
		if(!gotAns)System.out.println("Goldbach's conjecture is wrong.");
		
		n= Integer.parseInt(br.readLine());
		}
	}

}
