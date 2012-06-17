import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class uva374 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		BigInteger b, p, m;
		while (true) {
			s = br.readLine();
			if (s == null || s.isEmpty())
				break;
			b = new BigInteger(s);
			p = new BigInteger(br.readLine());
			m = new BigInteger(br.readLine());
			br.readLine();
			
			System.out.println(b.modPow(p, m).toString());
		}
	}

}
