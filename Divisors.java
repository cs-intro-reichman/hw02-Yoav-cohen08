/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		for(int i = 1; i <= x; i++)
		{
			if ((x % i) == 0) 
			{
				System.out.println(i);
			}
		}
	}
}

/*java Divisors 239
1
239
yoavcohen@Yoavs-MacBook-Pro hw02-Yoav-cohen08 % java Divisors 18 
1
2
3
6
9
18 */
