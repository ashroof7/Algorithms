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


int main()
{
	int c[37],tc,t,n,i,min ,temp,m = 0,l=1;
	char ans[150] ,collect[4];
	scanf("%d",&tc);
	
	while(tc--){
	scanf("%d %d %d %d %d %d %d %d %d",&c[0],&c[1],&c[2],&c[3],&c[4],&c[5],&c[6],&c[7],&c[8]);
	scanf("%d %d %d %d %d %d %d %d %d",&c[9],&c[10],&c[11],&c[12],&c[13],&c[14],&c[15],&c[16],&c[17]);
	scanf("%d %d %d %d %d %d %d %d %d",&c[18],&c[19],&c[20],&c[21],&c[22],&c[23],&c[24],&c[25],&c[26]);
	scanf("%d %d %d %d %d %d %d %d %d",&c[27],&c[28],&c[29],&c[30],&c[31],&c[32],&c[33],&c[34],&c[35]);
	
	scanf("%d",&t);
	if (m)printf("\n");
	printf("Case %d:\n",l++);
	
	while(t--){
	scanf("%d",&m);
	
	min = 1<<25;
		
	for(i=2;i<37 ;i++){
		n = m;
		temp = 0;
		
		while(n>0){
			temp+=c[n%i];
			n/=i;
		}
		
		
		if (temp < min){
			min = temp;
			itoa(i,ans);
			}
			
		else if (temp == min){
			itoa(i,collect);
			strcat(ans, " ");
			strcat(ans, collect);
			}
		
		}
		printf("Cheapest base(s) for number %d: %s\n",m,ans);
	}
}

	return 0;
}

