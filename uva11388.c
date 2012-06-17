int main(){
int tc,gcd,lcm;
scanf("%d",&tc);
while(tc--){

scanf("%d %d",&gcd,&lcm);
if(lcm == (lcm/gcd)*gcd)
				printf("%d %d\n",gcd,lcm);
			else
				printf("-1\n");
}

return 0;
}
