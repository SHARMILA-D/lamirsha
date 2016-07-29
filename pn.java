import java.util.Scanner;
class Posneg
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Integer x;
		System.out.println("Enter the number");
		x=in.nextInt();
		if(x>0)
			System.out.println("the number"+" "+x+"is positive");
		else if(x<0)
			System.out.println("the number"+" "+x+"is negative");
		else
			System.out.println("the number"+" "+x+"is zero");
	}
}
