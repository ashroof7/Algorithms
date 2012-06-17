int main(){
int i,j,k,n = 3;
char s[32] = "abc";

    for (i=0; i < n; i++){
        for(j=0; j < n; j++){
           if (i==j)continue;
           for(k=0; k < n; k++){
                if (j==k)continue;
                printf("%c%c%c\n",s[i],s[j],s[k]);
           }
        }
    }
return 0;
}
