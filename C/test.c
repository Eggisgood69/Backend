#include <stdio.h>
#include <float.h>

int main()
{
    int x,sum;
    
    printf("Please enter the first integer: ");
    scanf("%d",&x);
    sum = x;

    printf("Please enter the second integer: ");
    scanf("%d",&x);
    sum = sum + x;

    printf("Please enter the third integer: ");
    scanf("%d",&x);
    sum = sum + x;

    printf("Sum is %d.",sum);

    

    return 0;
}