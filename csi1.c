int main(){
int i,j,n = 3;
char s[32] = "abc";

    for (i=0; i < n; i++){
        for(j =i; j< n ;j++){
            if (i==j)continue;
            printf("%c%c\n",s[i],s[j]);
        }
    }
return 0;
}
