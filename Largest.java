import java.util.*;
public class Largest{
Public static void main(String[] args){
Scanner sc = new Scanner(system.in);
System.out.println("Enter Number and Digit");
int number = sc.nextInt();
int digit = sc.nextInt();
char.c = Integer.toString(digit).charAt(0);
int i;
for(i = number; i>0;i--)
{
if(Integer. toString(i).indexof(c) == -1)
{
System.out.println(i);
break;
}
}
if(i==0)
System.out.println("-1");
}
}
