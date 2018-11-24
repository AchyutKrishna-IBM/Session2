import java.util.Scanner;
class Highest
{
public static void main(String[] args)
{
int a;
int b;
int c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first num:");
a=sc.nextInt();
System.out.println("Enter the second num:");
b=sc.nextInt();
System.out.println("Enter the third num:");
c=sc.nextInt();
if(a>b && a>c)
System.out.println("Largest number is: "+a);
else if(b>a && b>c)
System.out.println("Largest number is: "+b);
else if(c>a && c>b)
System.out.println("Largest number is: "+c);
else
System.out.println("numbers are not distinct");
}
}