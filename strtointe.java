import java.util.Scanner;


public class string to int{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        String str=in.next();
        int b=0;
        int a=str.length();
        for(int i=0;i<a;i++)
        {
            b=b*10;
            b=b+(int)str.charAt(i);
             System.out.print(b);
             System.out.println();
        }
        System.out.print(b);
    }
    
}
//gok 11517