int max(int a, int b){
	if(a>b)return a;
	else return b;
	}

int	GCD( int a, int b ) {
	int		r;
	while ( b ) {
		r = a % b;
		a = b;
		b = r;
	}

	return a;
}


int main(){

int t,i=0,j=0,n[101],k=0,a=0,b=0;
char c[200];

scanf("%d",&t);
getchar();

while(t--){
    gets(c);

    i = j = k = a = b = n[0] = 0 ;

    while(i<200){
        if(c[i]=='\0')
            break;

        if(c[i] == ' '){
            j = 0;
            
            if (a){
				k++;
				n[k] = 0 ;
				}
            a = 0;
        }

        else{
            n[k]= n[k]*10 + c[i]-'0';
            a=1;
		}
        i++;
    }
    
    j = 1;
    for (a = 0; a <= k ; a++){
        for(b = a+1; b <= k ;b++){
                j = max(GCD(n[a],n[b]),j);
        }
    }
    printf("%d\n",j);

}

return 0;
}
