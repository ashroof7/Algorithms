int main(){

int n,max=11,min=-1;
char s[6] ;
    while(1){

        scanf("%d %s %s", &n, &s, &s);

        if (n==0)return 0;

        if (s[0]=='h'){
            max = n>max?max:n;
        }
        else if (s[0]== 'l'){
            min = n<min?min:n;
        }
        else if (s[0]=='o'){
            if (n >= max || n <= min)printf("Stan is dishonest\n");
            else printf("Stan may be honest\n");
            max = 11 ; min = -1;
        }
}
return 0;
}
