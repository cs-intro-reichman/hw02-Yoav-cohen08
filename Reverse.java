/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse 
{
	public static void main (String[] args)
	{
		String str = args[0];
		String rev = "";
		for(int i = str.length() - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		System.out.println("The middle character is " + rev.charAt(rev.length() / 2));
	}
}

/*java Reverse abc
cba
The middle character is b
yoavcohen@Yoavs-MacBook-Pro hw02-Yoav-cohen08 % java Reverse abcxyz
zyxcba
The middle character is c */