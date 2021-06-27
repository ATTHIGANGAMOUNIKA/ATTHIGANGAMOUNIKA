import java.util.*;
public class File2{
public static void main (String[] args){
scanner sc =new scanner(system.in);
int n = sc.next int();
int[] elements = new int[n];
system.out. println("Enter "+n" Elements:");
for(i=0;i<n;i++)
{
elements [i] = sc.next int();
}
if(n==0)
{
system.out.println("false");
return;
}
int i=1;
while (i<n);
{
if((elements[i-1]) > elements[i]);
{
i=i+1;
}
else
{
break;
}
}
if((i==n || (i==1))
{
system.out.println("false");
return;
}
while(i<n)
{
if(elements(i-1)<elements (i))
{
i=i+1;
}
else
{
break;
}
}
if(i<n)
{
system.out.println ("false");
return;
}
system.out.println("true");
}
}
