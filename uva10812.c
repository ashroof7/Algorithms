int main(){

int t, a, b, s, d ;

scanf ("%d",&t);
for (t ; t>0 ; t--){
    scanf("%d %d",&s,&d);

    b = (s-d)/2;

    if (b<0){
    printf("impossible\n");
    continue;
    }

    a = (s+d)/2;
    if (a+b != s || a<0) printf("impossible\n");
    else {
    if (a>b)printf("%d %d\n",a,b);
    else printf("%d %d\n",b,a);
    }
    }

return 0;
}
