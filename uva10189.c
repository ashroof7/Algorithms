#include <string.h>
int main()
{

    int i, j, t, k, bombs[10000][2], indx=0, y, tc = 1;
    char map[101][101];
    int dx[] = {-1,-1,-1,0,0,1,1,1},
        dy[] = {-1,0,1,-1,1,-1,0,1};

    while (1)
    {
        scanf("%d %d",&i,&j);
        getchar();
        if (!i|!j) return 0;
        indx=0;
        for(k= 0; k < i ; k++)
        {
            for(t=0; t<j; t++)
            {

                map[k][t] = getchar() ;
                if (map[k][t]=='*')
                {
                    bombs[indx][0] = k;
                    bombs[indx++][1] = t;
                }
                else map[k][t] = '0';
            }
            getchar();
        }

            int x = 0;
            for (x ; x < indx; x++)
            {
                int a = bombs[x][0];
                int b = bombs[x][1];


                for (y=0 ; y<8 ; y++)
                {
                    if (a + dx[y]>=0  && a+dx[y] < i &&  b+dy[y]>=0 && b+dy[y]<j &&  map[a+dx[y]][b+dy[y]]!='*')
                    map[a+dx[y]][b+dy[y]]++;
                }



            }
            if (tc!=1)printf("\n");
            printf("Field #%d:\n",tc++);
            for (y =0 ; y < i; y++) {
                printf("%s\n",map[y]);
                for (x=0;x<=j;x++)
                    map[y][x] = '\0';
                }
        }
        return 0;
    }
