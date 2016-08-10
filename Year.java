import java.util.Scanner;
class leapyr
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Integer x;
		System.out.println("Enter the year");
		x=in.nextInt();
		if((x%4==0) &&(x%100!=0))
			System.out.println("the  year"+" "+x+" "+"is a leapyear");
		else if(x%400==0)
			System.out.println("the  year"+" "+x+" "+"is a centurian leapyear");
		else
			System.out.println("the year"+" "+x+" "+"is not a leapyear");
	}
}
