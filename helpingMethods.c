#include <stdio.h>

void itoa(int n, char s[])
{
    // equivalent to Integer.toString :D 
    int i = 0 ,j=0;
	char temp ;
    do {       /* generate digits in reverse order */
        s[i++] = n % 10 + '0';   /* get next digit */
    } while ((n /= 10) > 0);     /* delete it */
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
	int n = 123;
	char c[150];
	itoa(n,c) ;
	
	printf(c);
	return 0;
}

