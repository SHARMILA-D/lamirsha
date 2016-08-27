
import java.util.Scanner;



public class JavaApplication4 {

    
    public static void main(String[] args) {
       String str;
      int count=0;
     Scanner input=new Scanner(System.in);
       System.out.print("enter the string");
         str=input.nextLine();
         for(int i=0;i<str.length();i++)
         {
             if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i) =='u')        
          count=count+1;
         }
         if(count==0)
        
             System.out.print("the given string not contain  vowel"); 
    else
    System.out.print("the given string  contain a vowels");
    }
       
    
}
    

