import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uva294 {

	public static int divNo(int n){
		if (n==0)return 0;

		int pow =1;
		int divisors = 1;
		
		for (int i = 2; i*i <= n; i++) {
			
			pow = 1 ;
			while(n%i==0){
				pow++;
				n/=i;
			}
			divisors*=pow;
		}
		if (n>1){
			divisors*=2;
		}
		
	
		return divisors;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		String s;
		String ss[];
		int min , max ,res = 2,res_num = 0;
		
		while(tc-->0){
			s=br.readLine();
			ss = s.split(" ");
			min = Integer.parseInt(ss[0]);
			max = Integer.parseInt(ss[1]);
			res = 0;
			res_num = 0;
			
			for (int i = min; i <= max; i++) {
				int temp = divNo(i);
				if (temp>res){
					res = temp;
					res_num = i ;
				}
			}
			System.out.println("Between "+min+" and "+max+", "+res_num+" has a maximum of "+res+" divisors.");
			
		}
	}

}
