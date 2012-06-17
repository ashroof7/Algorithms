int main(){
int i,j=0,n = 10;
char s[32] = "abcdefghij";

    for (i=0; i < (2<<(n-1)); i++){
        for(j = 0; j < n ;j++){
            if (i &(1<<j))
            printf("%c",s[j]);
        }
        printf("\n");
    }
return 0;
}
