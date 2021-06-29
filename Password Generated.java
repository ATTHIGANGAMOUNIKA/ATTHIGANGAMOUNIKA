import java.util.*;
public class Pass_Gen{
static String Password(String name,String num){
int len = name.length();
while(len!=0)
{
if(num.contains(len+ " "))
{
char ch[] = name.to CharArray();
return ch[len-1]+ " ";
}
else 
  len = len-1;
}
return "x";
}
public static void main (String[] args){
Scanner sc = new scanner (System.in);
String String = sc.nextLine();
String emp[] = String.splot(",");
String  emp_name[],emp_number[];
emp_name = new String[emp.length];
emp_number = new String[emp.length];
for(int i=0;i<emp.length;i++)
{
String temp[] = emp[i].split(":");
emp_name = temp[0];
emp_number[i] = temp[1];
}
for(int i=0,i < emp_name length; i++)
{
System.out.println(Password(emp_name[i],emp_number[i]));
}
}
}
