import java.util.*;
Public class Co_Prime{
static boolean prime(int inputNumber)
{
boolean flag = true;
if(imputNumber <= 1)
{
flag = flase;
return flag;
}
else
{
for(int i=2; i<= inputNumber/3 ; i++)
{
if((intNimber%2) == 0)
{
flag = flase;
break;
}
}
}
return flag;
}
}
Public static void main(String[] args){
Scanner  sc = new Scanner(System.in);
System.out.println("Enter two numbers");
int S = sc.nextInt();
int e = sc.nextInt();
int first,second;
int found = 0;
for(int i = s,i+2<=e;i++)
{
first = i;
second = i+2;
if(prime(first) && prime(second))
{
System.out.println("("+first+", "+second+")");
found = 1;
}
}
if(found == 0)
System.out.println("-1");
}
