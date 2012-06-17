

int main(){
int n,c,i;

while(scanf("%d",&n)==1){
	i = c = 1 ;
	do{
		i = (i*10 + 1)%n;
		c++ ;
	}while(i);
	
	printf("%d\n",c);
}
return 0;
}
