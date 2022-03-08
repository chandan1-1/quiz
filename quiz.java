import java.util.*;
class quiz
{
public static void main(String args[])
{
	int a=0,s=0;
	Scanner sc=new Scanner(System.in);
System.out.println("## This is a random quiz on the basis of java programming ##");
System.out.println("\n");
System.out.println("--to start the quiz enter start--");
String c=sc.next();
System.out.println("\n");
if(c.equals("start"))
{
Random r=new Random();
a=r.nextInt(50);
if(a!=26)
{
System.out.println("          [ Task for rollno :"+a+ ".....]");
}
if(a>0)
{
s=r.nextInt(10);
switch(s)
{

case 1:
System.out.println(":-  write a programme to display first 5 armstrong number?");
break;
case 2:
System.out.println(":-   prompt the user to provide two no. using conditional operator to find the smallest no and print that no.");
break;
case 3:
System.out.println(":-   write a program to find factorial of a given number?");
break;
case 4:
System.out.println(":-   write a program to print fibonacci series ?");
break;
case 5:
System.out.println(":-   find the greatest number between three numbers?");
break;
case 6:
System.out.println(":-write a programe to check if a given number is prime?");
break;
case 7:
System.out.println(":-write a program to count digit of a number");
break;
case 8:
System.out.println(":-write a program to find the number is odd or even ");
break;
case 9:
System.out.println(":-write a program to find the table of that number which is given by user");
break;
case 10:
System.out.println(":- you r lucky you have no task");
break;
default:
System.out.println("wrong choise");
break;
}
}
}
else
{
	System.out.println("cbbbb ");
}
}
}
