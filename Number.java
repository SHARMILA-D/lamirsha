import java.util.Scanner;
class multiple
{
	public static void main(String arg[])
	{
		Integer x,cnt=0;
		Integer rev=0;
		Double mul=0.0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value");
		x=in.nextInt();
		while(x!=0)
		{
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}
		while(rev!=0)
		{
			int re=rev%10;
			cnt=cnt+1;
			if(cnt==1)
			mul=(double)re;
			else
			mul=Math.pow(mul,re);
			rev=rev/10;
		}
		System.out.println("The output is" +" "+ mul);				
	}
}
		