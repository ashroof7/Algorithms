import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class uva639 {

	static char map [][] ;
	static int n ;
	static int res = 0;
	
	
	public static void put(char c1, char c2, int i,int j){
		for (int i2 = 0; i2 < i; i2++) {
			if (map[i2][j]== c1)
				map[i2][j] = c2;
			else 
				if (map[i2][j]=='X')
				break;
		}
		for (int i2 = i; i2 < n ; i2++) {
			if (map[i2][j]== c1)
				map[i2][j] = c2;
			else 
				if (map[i2][j]=='X')
				break;	
	}
		
		
		for (int j2 = 0; j2 < j; j2++) {
			if (map[i][j2]== c1)
				map[i][j2] = c2;
			else
				if (map[i][j2]=='X')
				break;
		}
		for (int j2 = j; j2 < n ; j2++) {
			if (map[i][j2]== c1)
				map[i][j2] = c2;
			else
				if (map[i][j2]=='X')
				break;	
		}
		
	}
	
	
	public static void solve(int c){
			boolean mark = true;
			for (int i2 = 0; i2 < n; i2++) {
				for (int j2 = 0; j2 < n; j2++) {
					if (map[i2][j2]=='.'){
//						System.out.println("call( ., "+(char)( c+'0')+", "+i2+", "+j2+")");
						put('.',(char)( c+'0'),i2,j2);
						solve(c+1);
						mark = false;
//						System.out.println("call( "+(char)( c+'0')+", ., "+i2+", "+j2+")");
						put((char)(c+'0'), '.',i2,j2);
					}
				}
			}
			if (mark){
				res=res<c?c:res;}
		}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
		n = Integer.parseInt(br.readLine());
		if (n==0)System.exit(0);
		map = new char[n][n];
		for (int i = 0; i < n ; i++) 
			map[i] = br.readLine().toCharArray();
		solve(0);
		System.out.println(res);
		res = 0;
		}
	}

}
