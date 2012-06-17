#include <strings.h>
			void itoa(int n, char s[])
{
    int i = 0 ,j=0;
	char temp ;
    do {       
        s[i++] = n % 10 + '0';   
    } while ((n /= 10) > 0);     
    s[i] = '\0';
   i--;
   for (j=0;j<=i/2;j++){
	   temp = s[j];
	   s[j] = s[i-j];
	   s[i-j] = temp;
	   }
} 
			
			
	void primeFactors(int n) {
	printf("1");
	char* s ="";
	char temp[10];
	int i=0;
	
		for ( i=2 ; i <= n / i ; i++) {
			while (n % i == 0) {
				itoa(i,temp);
				s = strcat(s,temp);
				s = strcat(s," x ");
				n /= i;
			}
		}
		if (n > 1) {
			itoa(n,temp);
			strcat(s,temp);
				strcat(s," x ");
				
		}
		printf("%s",s);
		
		strncpy(s,s,(strlen(s)-3));
		printf("%s",s);
	}
	
	int n;
	int main() {
	
	
		while(1){
			scanf("%d",&n);
		printf("main");
			
			if(n==0)break;
		
			
			
			if (n<0){
				printf("%d = -1 x ",n);
				primeFactors(n);
			}else {
				printf("%d = ",n);
				primeFactors(-n);
				}
			
			
		}
		return 0;
	}


