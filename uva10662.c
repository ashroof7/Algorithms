int main(){
	int t,r,h,tc[21],rc[21],hc[21],tr[21],rh[21],ht[21],i,j,k,temp,min,a[3];

	
	while(scanf("%d %d %d",&t,&r,&h)==3){
			for (i=0;i<t;i++){
				tr[i] = 0;
				scanf("%d",&tc[i]);
				
				for (j=0;j<r;j++){
					scanf("%d",&k);
					if (!k) tr[i]|=(1<<j);
					
					if(tr[i]&(1<<j)) printf("1");
					else printf("0");
					
		}
		printf("\n");
	}
			for (i=0;i<r;i++){
				rh[i]=0;
				scanf("%d",&rc[i]);
				for (j=0;j<h;j++){
					scanf("%d",&k);
					if (!k) rh[i]|=(1<<j);
					//printf("%d ",rh[i]&(1<<j));
				}
				//printf("\n");
		}
			for (i=0;i<h;i++){
				ht[i] = 0;
				scanf("%d",&hc[i]);
				for (j=0;j<t;j++){
					scanf("%d",&k);
					if (!k) ht[i]|=(1<<j);
					//printf("%d ",ht[i]&(1<<j));
				}
				//printf("\n");
		}
			
			
			
			
			min = 1<<25;
			
				for (i=0;i<t;i++){
					for (j=0;j<r;j++){
						if (tr[i]&(1<<j)){
							for (k=0;k<h;k++){
								if(rh[j]&(1<<k)){
									if(ht[k]&(1<<i)){
											temp = tc[i]+rc[j]+hc[k];
											if(temp<min){
											min=temp;
											a[0]=i;a[1]=j;a[2]=k; 
												}
											
											
									}
								}
							}
						}
					}
				}
				if (min==1<<25)
					printf("Don't get married!\n");
				else
					printf("%d %d %d:%d\n",a[0],a[1],a[2],min);
		}
	
	return 0;
	}
