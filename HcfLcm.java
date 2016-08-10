import java.util.Scanner;
class hl
{
	public static void main(String[] arg)
	{
		Integer a,b,m,h=0,l=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		a=in.nextInt();
		b=in.nextInt();
		m=a*b;
		for(int i=2;i<m;i++)
		{
			if((a%i==0)&&(b%i==0))
				h=i;
		}
		l=m/h;
		System.out.println("The HCF is"+" "+h);
		System.out.println("The Lcm is"+" "+l);
	}
}