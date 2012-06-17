void itoa(int n, char s[]){
    int i = 0 ;
    do {
        s[i++] = n % 10 + '0';
    } while ((n /= 10) > 0);
    s[i] = '\0';
}

int main(){


int n, max=0 ,min = 01234,m=0,i,no = 1;
char c[7];

scanf("%d",&n);
while (n){
    if (max)printf("\n");
    m = 0;
    max = 98765;
    min = 01234;
    no = 1;

    outer:for(min ; min <= 98765/n ; min++ ){
        m = 0;
        max = min*n;

    if (max<10000)continue;
       if (min < 10000)m=1;

        itoa(min,c);
        for (i=0;i<5;i++){

            if (m&(1<<(c[i]-'0'))){
                min++;
                goto outer;
            }
            else m|= 1<<(c[i]-'0');
        }

        itoa(max,c);
        for (i=0;i<5;i++){
            if (m &(1<<(c[i]-'0'))){
                min++;
                goto outer;
            }
            else m|= 1<<(c[i]-'0');
        }

        if (min>9999)
        printf("%d / %d = %d\n",max,min,n);
        else
        printf("%d / 0%d = %d\n",max,min,n);
        no = 0 ;

    }
    if (no)
        printf("There are no solutions for %d.\n",n);
    scanf("%d",&n);
}

return 0;
}
