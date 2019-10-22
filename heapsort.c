
#include<stdio.h>
#include<stdlib.h>
void heapsort(int [],int);
void buildheap(int [],int,int);
int main (){
	int i,j,n;
	int *a;
	scanf("%d",&n);
	a=(int *)malloc(n*sizeof(int));
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	heapsort(a,n);
	/*printf("heapsort:\n");
	for(i=0;i<n;i++)
		printf("%d\t",a[i]);*/
}
void heapsort(int a[],int n){
	int temp,i,j;
	for(i=n/2-1;i>=0;i--)
		buildheap(a,n,i);
	for(i=n-1;i>=0;i--){
		temp=a[i];
		a[i]=a[0];
		a[0]=a[i];
		buildheap(a,i,0);
		printf("\n");
		for(j=0;j<n;j++)
			printf("%d\t",a[i]);			
	}
}
void buildheap(int a[],int n,int i){
	int temp,l_index=i,lc=2*i+1,rc=2*i+2;
	//adjust left child
	if(lc<n && a[lc]>a[l_index])
		l_index=lc;
	//adjust right child
	if(rc<n && a[rc]>a[l_index])
		l_index=rc;
	//place large number in the parent pos to make maxheap
	if(l_index!=i){
		temp=a[i];
		a[i]=a[l_index];
		a[l_index]=temp;
		buildheap(a,n,l_index);
	}
}