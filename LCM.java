
public class LCM {

	static int LCM(int a, int b){
		int temp = a*b;
		int r;
		while(b>0){
			r=a%b;
			a=b;
			b=r;
		}
		return temp/a;
	} 
	
	public static void main(String[] args) {
		System.out.println(LCM(20, 12));
	}
}
