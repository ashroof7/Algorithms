int main(){
int i,j,k,l,m,n,v,start=1;
int s[14];

scanf("%d",&n);
for (i=0;i<n;i++)
scanf("%d",&s[i]);



while (n){
    if (!start)
        printf("\n");
    start =0 ;
    for (i=0; i < n; i++){
        for(j =i; j< n ;j++){
            if (i==j)continue;
            for(k =j; k< n ;k++){
                if (j==k)continue;
                for(l =k; l< n ;l++){
                    if(k==l)continue;
                    for(m =l; m< n ;m++){
                        if (l==m)continue;
                        for(v =m; v< n ;v++){
                        if (m==v)continue;

                        printf("%d %d %d %d %d %d\n",s[i],s[j],s[k],s[l],s[m],s[v]);
                        }
                    }
                }
            }
        }
    }


scanf("%d",&n);
for (i=0;i<n;i++)
scanf("%d",&s[i]);

}
return 0;
}
