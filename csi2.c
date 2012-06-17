int main(){
int i,j,k,l,m,n = 6;
char s[32] = "123456";

    for (i=0; i < n; i++){
        for(j =i; j< n ;j++){
            if (i==j)continue;
            for(k =j; k< n ;k++){
                if (j==k)continue;
                for(l =k; l< n ;l++){
                    if(k==l)continue;
                    for(m =l; m< n ;m++){
                        if (l==m)continue;
                        printf("%c%c%c%c%c\n",s[i],s[j],s[k],s[l],s[m]);
                    }
                }
            }
        }
    }
return 0;
}
