import java.util.ArrayList;
import java.util.List;


public class primeFactoring {

	static List<Integer> primes  = new ArrayList<Integer>();


	static List<Integer> primeFactors(long N){
		    List<Integer> factors = new ArrayList<Integer>(); 
		    int PF_idx = 0;
		    long PF = primes.get(PF_idx);     // using PF = 2, 3, 4, ..., is also ok
		    while (N != 1 && (PF * PF <= N)) {   // stop at sqrt(N), but N can get smaller
		      while (N % PF == 0) { N /= PF; factors.add((int)PF); }    // remove this PF
		      PF = primes.get(++PF_idx);                              // only consider primes!
		    }
		    if (N != 1) factors.add((int)N);     // special case if N is actually a prime
		    return factors;         // if pf exceeds 32-bit integer, you have to change vi
		  }
		
	
	
	
	public static void main(String[] args) {
	

	}

}
