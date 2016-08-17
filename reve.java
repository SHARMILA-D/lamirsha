import java.util.Scanner;
class arrayrevnum
{
public static void main(String[] arg)
{
int[]a;
int n;
Scanner input=new Scanner(System.in);
System.out.print("enter the array:");
n=input.nextInt();
a=new int[n];
System.out.println("enter"+n+"value:");
for(int i=0;i< a.length;i++)
a[i]=input.nextInt();
for(int i=0,j=n-1;i<n/2;i++,j--)
a[i]=a[i]+a[j]-(a[j]=a[i]);
System.out.println("Reverse order");
for(int i=0;i<a.length;i++)
System.out.println(a[i]);
}
}