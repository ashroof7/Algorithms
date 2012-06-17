import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class uva10127 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		BigInteger n, b;
		while (true) {
			s = br.readLine();
			if (s == null || s.isEmpty())
				break;

			n = new BigInteger(s.trim());
			b = new BigInteger("1");
			int c = 1;
			while (!(b.mod(n)).equals(BigInteger.ZERO)) {
				b = (b.multiply(BigInteger.TEN)).add(BigInteger.ONE);
				c++;
			}

			System.out.println(c);
		}
	}

}
