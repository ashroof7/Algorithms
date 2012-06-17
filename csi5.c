int main(){
    //n = given string.length
    //v = length of required set
int i,j=0,n = 4 ,v = 3, cnt = 0;
char s[32] = "abcd" , c[32];

    for (i=0; i < (2<<(n-1)); i++){
        for(j = 0; j < n ;j++){

            if (i &(1<<j)){
                c[cnt++] = s[j];
                if (cnt==v){
                    printf("%s\n",c);
                    cnt = 0 ;
                }
            }
        }
    }
return 0;
}
