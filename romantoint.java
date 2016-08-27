
import java.util.Scanner;


public class rommann {
    public static void main(String args[])throws NullPointerException
    {
        Scanner in =new Scanner(System.in);
        String str=in.next();
        int b=0;
        int a=str.length();
        str='a'+str;
        for(int i=1;i<=a;i++)
        {
            switch(str.charAt(i))
            {
                case 'I':
                    b=b+1;
                    break;
                case 'V':
                   switch(str.charAt(i-1))
                   {
                       case 'I':
                           b=b+3;
                           break;
                       default:
                           b=b+5;
                           break;
                    }
                break;
          
                case 'X':
                    switch(str.charAt(i-1))
                   {
                       case 'I':
                           b=b+8;
                           break;
                       default:
                           b=b+10;
                           break;
                    }
                break;
                    
                case 'L':
                    switch(str.charAt(i-1))
                   {
                       case 'X':
                           b=b+30;
                           break;
                       default:
                           b=b+50;
                           break;
                    }
                break;
                    
                case 'C':
                    switch(str.charAt(i-1))
                   {
                       case 'X':
                           b=b+80;
                           break;
                       default:
                           b=b+100;
                           break;
                    }
                break;
                case 'D':
                    switch(str.charAt(i-1))
                   {
                       case 'X':
                           b=b+480;
                           break;
                       default:
                           b=b+500;
                           break;
                    }
                break;
                case 'M':
                    switch(str.charAt(i-1))
                   {
                       case 'C':
                           b=b+800;
                           break;
                       default:
                           b=b+1000;
                           break;
                    }
                break;
                    
                    
            }
           
        }
        System.out.print(b);
    }
    
}
