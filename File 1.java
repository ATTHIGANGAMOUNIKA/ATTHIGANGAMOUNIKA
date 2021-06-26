import java.util.*;
Public class File1{
Public static void main(String[] args)
{
int n,e_sum=0,o_sum=0;
scanner obj=new scanner (system.in);
System. out.println("Enter Array Size:");
n=obj.next int();
int a[]=new int[n];
int i,sum=0;
for(i=0;i<n;i++)
{
a[i] = obj.next int();
}
for(i=0;i<n;i++)
{
if(a[i]%2==0 && i%2==0)
e_sum = e_sum +a[i];
else if(a[i]%2==1 && i%2==1)
o_sum = o_sum + a[i];
}
System. out.println(e_sum" "+o_sum);
}
