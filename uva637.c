int main(){

int d,i,k,min,max,n,b[3],a[] = {0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52,
 56, 60, 64, 68, 72, 76, 80, 84, 88, 92, 96, 100, 104};
    scanf("%d",&n);
    while(n){
        max = n;
        min = 1;
        k=1;

        for (i =0 ; i<27 ; i++){
            if (n>=a[i])continue;
            else {n = a[i];break;}
        }
        printf("Printing order for %d pages:\n",max);
            d = n - max;
        if (n==4){
            if (max==1){
                printf("Sheet %d, front: Blank, 1\n",k);
            }else if (max == 2){
                printf("Sheet %d, front: Blank, 1\n",k);
                printf("Sheet %d, back : 2, Blank\n",k++);
            }else {
                printf("Sheet %d, front: Blank, 1\n",k);
                printf("Sheet %d, back : 2, 3\n",k); min++;
                }

        }else {
        if (d==1){
            printf("Sheet %d, front: Blank, 1\n",k); min++;
            printf("Sheet %d, back : %d, %d\n",k++,min++,max--);
            }
        else if (d==2){
                printf("Sheet %d, front: Blank, 1\n",k); min++;
                printf("Sheet %d, back : 2, Blank\n",k++); min++;
            }
        else if (d==3){
            printf("Sheet %d, front: Blank, 1\n",k); min++;
            printf("Sheet %d, back : 2, Blank\n",k++); min++;
            printf("Sheet %d, front: Blank, 3\n",k); min++;
            printf("Sheet %d, back : %d, %d\n",k++,min++,max--);
        }

        while(max>min){
                printf("Sheet %d, front: %d, %d\n",k,max--,min++);
                printf("Sheet %d, back : %d, %d\n",k++,min++,max--);
                }

        }
        scanf("%d",&n);
    }

return 0;
}
