
public class GCD {

	/**
	 * @param args
	 */
	
	static int GCD(int a, int b){
		int r;
		while(b>0){
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	} 
	
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(GCD(5,10));

	}

}
