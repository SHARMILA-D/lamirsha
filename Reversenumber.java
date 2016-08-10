import java.util.Scanner;
class reversenum
{
	public static void main(String arg[])
	{
		Integer x,cnt=0;
		Integer rev=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value");
		x=in.nextInt();
		while(x!=0)
		{
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}
		System.out.println("The number is"+" "+rev);
	}
}