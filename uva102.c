#include <stdio.h>

int main(){
unsigned int i,j,k, n[3][3],temp,min=1<<30;
char c[4],l[4] = "BCG";



while(
scanf("%d %d %d %d %d %d %d %d %d",
      &n[0][0],&n[0][2],&n[0][1],&n[1][0],&n[1][2],&n[1][1],&n[2][0],&n[2][2],&n[2][1])
      ==9){

    min = 1<<25;
    for (i=0;i<3;i++){
        for(j=0;j<3;j++){
            if(i==j)continue;
            for(k=0;k<3;k++){
                if (j==k||k==i)continue;
                temp = n[0][j] + n[0][k] + n[1][i] + n[1][k] + n[2][i] + n[2][j];
                if (temp < min){
                    min = temp;
                    c[0] = l[i];
                    c[1] = l[j];
                    c[2] = l[k];
                    c[3] = '\0';
                }
            }
        }
    }
    printf("%s %d\n",c,min);
}

return 0;
}
