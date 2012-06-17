#include <strings.h>
		
			
	void primeFactors(int n) {
	printf("1");
	char* s ="";
	char* temp="";
	int i=0;
	
		for ( i=2 ; i <= n / i ; i++) {
			while (n % i == 0) {
				sprintf(temp,"%d",i);
				s = strcat(s,temp);
				s = strcat(s," x ");
				n /= i;
			}
		}
		if (n > 1) {
			sprintf(temp,"%d",n);
			strcat(s,temp);
				strcat(s," x ");
				
		}
		printf("%s",s);
		
		strncpy(s,s,(strlen(s)-3));
		printf("%s",s);
	}
	
	
	int main() {
	int n;
	
		while(1){
			scanf("%d",&n);
		printf("main");
			
			if(n==0)break;
		
			
			int y =n;
			if (n<0){
				printf("%d = -1 x ",n);
				primeFactors(y);
			}else {
				printf("%d = ",n);
				primeFactors(-y);
				}
			
			
		}
		return 0;
	}


