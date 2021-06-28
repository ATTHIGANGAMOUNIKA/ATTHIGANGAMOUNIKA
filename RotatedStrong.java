import java.util.*;
public class Rotated_String{
public static void main(String[] args){
scanner sc = new Scanner(system.in);
system.out.println("Enter two strings);
string s1 = sc.next();
string s2 = sc.next();
if(s1.length()!=s2.length)
{
system.out.println("No");
}
else
{
string s3 = s1+s1;
if(s3.contains(s2))
{
system.out.println("yes");
}
else
{
system.out.println("No");
}
}
