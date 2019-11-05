#include <stdio.h>
int main()
{
    int n1, n2, i;
    printf("Enter two integers: ");
    scanf("%d %d", &n1, &n2);
    int m1=n1,m2=n2,gcd,q,r=0;
    
   while(n2!=0){
       q=n1/n2;
       r=n1-(n2*q);
       n1=n2;
       n2=r;
       
   }    
   gcd=n1;
    printf("G.C.D of %d and %d is %d", m1, m2, gcd);
    return 0;
}