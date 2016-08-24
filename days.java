public class Dy {

    public static void main(String[] args) {
        String str=" ";
        Scanner input=new Scanner(System.in);
         System.out.print("Enter the String:");
        str=input.nextLine();
       
       
        if (str. equalsIgnoreCase( "monday")||str. equalsIgnoreCase("tuesday")||str.equalsIgnoreCase("wednesday")||str. equalsIgnoreCase("thursday")||str.equalsIgnoreCase("friday"))
             
            System.out.print("the given day is WorkingDay");
        
        else if(str.equalsIgnoreCase("saturday")||str.equalsIgnoreCase("sunday"))

            System.out.print("the given day is HoliDay day");
       
    }
    
}
