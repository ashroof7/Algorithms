
public class KnapSack_lec {

	static int v[] = {7,2,1,6,12};
	static int w[] ={3,1,2,4,6};
	static int c = 10;
	static int n = 5;
	
	static int ks(int c, int start){
		if (start>=n)return 0;
		
		if (w[start]>c)return ks(c,start+1);
		
		else	
			return Math.max(ks(c,start+1), v[start]+ks(c-w[start],start+1));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = ks(10,0);
		System.out.println(n);
	}

}
