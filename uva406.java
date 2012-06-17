import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class uva406 {
	
	static boolean p[];
	static int primes[] = new int[169];
	static int max ;
	static int c ;
	static int count = 0 ;
	static void sieve(int max) {
		count = 0;
		p = new boolean[max + 1];
		Arrays.fill(p, true);
		 p[0]  = false;
		 p[1]  = true;
		 
		 primes[count++] = 1;
		for (int i = 2; i < max + 1; i++) {
			if (p[i]) {
				for (int j = i * i; j < max+1; j += i)
					p[j] = false;
					primes[count++] = i;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		sieve(1000);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		int start,end,oldc ;
		StringBuilder collect ;
		String ss[] = new String[2];
		while(true){
			s  =br.readLine(); 
			if (s==null || s.isEmpty())System.exit(0);
			start = end = count = 0;
			collect = new StringBuilder();
			
			ss=s.split(" ");
			max = Integer.parseInt(ss[0]);
			c = Integer.parseInt(ss[1]);
			oldc = c;
			count = 0 ;
			
			for (int i = 0; i <= 168; i++){ 
				 if (primes[i]>max)break;
				 
				 count++;
			}
			
			count--;
			if ((count&1)==0)end=-1;
			count/=2;
			
			start = count-c;
			end += count + c;
			
			if (start < 0){
				for (int i = 0; i <=168; i++) {
					if (primes[i]>max)break;
					 collect.append(primes[i]+" ");
				}
				
			}else while(start++<end){
				collect.append(primes[start]);
				collect.append(" ");
			}
			
		collect.deleteCharAt(collect.length()-1);
		System.out.println(max+" "+oldc+": "+collect);
		System.out.println();
		}
	}
}

