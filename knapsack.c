#include<stdio.h>
int main(){
int w[]={100,50,150},pf[]={20,10,30};
float x[]={0.0,0.0,0.0},pf_w[]={0.0,0.0,0.0};
float max_pf=0.0,temp1=0,temp2=0,temp3=0;
int i=0,j=0,cap=50,n=3,wght=0,rem=0;
printf("total capacity: %d\n",cap);
printf("\n  profit:");
for(i=0;i<n;i++){
   pf_w[i]=(float)pf[i]/w[i];
    printf("%f\t",pf_w[i]);
}
for(i=0;i<n;i++){
    for(j=0;j<n-i-1;j++){
        if(pf_w[j]<pf_w[j+1]){
         temp1=w[j];
         w[j]=w[j+1];
         w[j+1]=temp1;
         temp2=pf_w[j];
         pf_w[j]=pf_w[j+1];
         pf_w[j+1]=temp2;
         temp3=pf[j];
         pf[j]=pf[j+1];
         pf[j+1]=temp3;
        }
    }
}
/*printf("\n sorted profit:");
for(i=0;i<n;i++)
    printf("%d\t",pf[i]);*/
printf("\n weight:");
for(i=0;i<n;i++)
    printf("%d\t",w[i]);
printf("\n profit\weight:");
for(i=0;i<n;i++)
    printf("%f\t",pf_w[i]);
    i=0;
while(i<=n){
        if(wght+w[i]<=cap){
            wght=wght+w[i];
            max_pf=max_pf+(pf_w[i]*w[i]);
            x[i]=1;
        }
        else{
            rem=cap-wght;
            wght=wght+(cap-wght);
            max_pf=max_pf+(pf_w[i]*rem);
            x[i]=(float)rem/w[i];
        }
        printf("\n weight:%d, profit:%f\n",wght,max_pf);
        i=i+1;
}
printf("objects in the sack:\n");
for(i=0;i<n;i++)
    printf("%f\t",x[i]);
printf("\nprofit:%f\n",max_pf);

return 0;
}
