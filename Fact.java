import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Integer x,fact=1;
		System.out.println("Enter the number");
		x=in.nextInt();
		if(x<0)
			return;
		else if(x==0)
			System.out.println("The factorial of"+" "+x+" "+"is"+" "+1);
		else	
		for(int i=1;i<=x;i++)
			fact=fact*i;
			System.out.println("The factorial of"+" "+x+" "+"is"+" "+fact);
	}
}
