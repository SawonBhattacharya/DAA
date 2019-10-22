#include<stdio.h>
void find(int *a,int size,int currsum,int index,int sum,int *sol){
//int i=0;
//printf("find function: %d\n",currsum);

if(currsum==sum){
    printf("\n solution found");
    for(int i=0;i<size;i++){
        if (sol[i] == 1) {
            printf(" %d \t" ,a[i]);
        }
    }
}
else if(index==size){
   // printf("find function else if %d \n",currsum);
    return;
}
else{
    //printf("find function %d\n",currsum);
    sol[index]=1;
    currsum+=a[index];
    printf("inserting element in sol array");
    for(int i=0;i<size;i++){
        if (sol[i] == 1) {
            printf(" %d \t" ,a[i]);
        }
    }
    find(a,size,currsum,index+1,sum,sol);
    currsum-=a[index];
    sol[index]=0;
    printf("deleting element in sol array");
    for(int i=0;i<size;i++){
        if (sol[i] == 1) {
            printf(" %d \t" ,a[i]);
        }
    }
    find(a,size,currsum,index+1,sum,sol);
}
return;
}
int main(){
int *a;
int n,sum;
int sol[sizeof(a)/sizeof(int)];
printf("enter the size of your set");
scanf("%d",&n);

a=(int*)malloc(sizeof(int)*n);
printf("enter the elements in your set");

for(int i=0;i<n;i++)
        scanf("%d",&a[i]);
printf("enter the sum you want to derive from the set!!");
scanf("%d",&sum);
find(a,n,0,0,sum,sol);
return 0;
}