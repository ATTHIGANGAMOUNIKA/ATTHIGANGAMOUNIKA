import java.util.*;
public class Sqrt-Without-Function{
public static void main (String[] args){
Scanner sc = new scanner(system.in);
system.out.println("Enter number");
int n = sc.next int();
float sqrt,t=0;
sqrt = n/2;
while(sqrt!=t)
{
t=sqrt;
sqrt = (n/t + t)/2;
}
system.out.println("square root of "+n+" is "+sqrt);
}
}
