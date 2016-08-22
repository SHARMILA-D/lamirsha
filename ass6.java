
import java.util.Scanner;

public class joshi {

   
    public static void main(String[] args) {
        int x;
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        if(x>0)
            System.out.print("positive");
        else if(x==0)
            System.out.print("zero");
      
        else
            System.out.print("negative");
    }
    
}
