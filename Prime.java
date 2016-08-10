import java.util.Scanner;
class numbers
{
	public static void main(String[] arg)
	{
		int[] a;
		int count=0,n,j=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		n=in.nextInt();
		a=new int[n];
		System.out.println("Enter the"+" "+n+" "+"numbers");
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		do
		{
		int b=0;
		for(int i=2;i<=(int)Math.sqrt(a[j]);i++)
		{
			if(a[j]%i==0)
				b=b+1;
		}
		if(b==0)
			count=count+1;
		j++;
		}while(j<n);
		System.out.println("The number of prime nos is"+" "+count);
	}
}
		
		
		