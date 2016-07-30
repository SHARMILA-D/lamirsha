import java.util.Scanner;
class Alphabet
{
	public static void main(String[] arg) throws java.io.IOException
	{
		char ch;
 		System.out.println("Enter the character");
		ch=(char)System.in.read();
		if(Character.isLetter(ch))
			System.out.println(ch+" "+"is an Alphabet");
		else
			System.out.println(ch+" "+"is not an Alphabet");
	}
}
		