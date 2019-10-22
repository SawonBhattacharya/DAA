#include<stdio.h>

int min(int a,int b)
{
  return (a>b)?b:a;
}

void floyds(int p[10][10],int n)
{
 int i,j,k;
 for(k=1;k<=n;k++)
  for(i=1;i<=n;i++)
   for(j=1;j<=n;j++)
    if(i==j)
     p[i][j]=0;
    else
     p[i][j]=min(p[i][j],p[i][k]+p[k][j]);
}

void main()
{
 int p[10][10],n,i,j;;
 printf("\n Enter the number of vertices:");
 scanf("%d",&n);
 
 for(i=1;i<=n;i++)
 {
  for(j=1;j<=n;j++)
   p[i][j]=999;
 }
 
 printf("\n Enter matrix data:\n");
 for(i=1;i<=n;i++)
 {
  for(j=1;j<=n;j++)
   scanf("%d",&p[i][j]);
 }
 
 printf("\n Matrix of input data:\n");
 for(i=1;i<=n;i++)
 {
  for(j=1;j<=n;j++)
   printf("%d \t",p[i][j]);
  printf("\n");
 }
 
 floyds(p,n);
 
 printf("\n Transitive closure:\n");
 for(i=1;i<=n;i++)
 {
  for(j=1;j<=n;j++)
   printf("%d \t",p[i][j]);
  printf("\n");
 }
 
 printf("\n The shortest paths are:\n");
 for(i=1;i<=n;i++)
  for(j=1;j<=n;j++)
  {
   if(i!=j)
    printf("\n <%d,%d>=%d",i,j,p[i][j]);
  }
}
