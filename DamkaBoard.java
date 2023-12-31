/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard 
{
	public static void main(String[] args) 
	{
		int size = Integer.parseInt(args[0]);
		for(int i = 1; i <= size; i++)
		{
			if(i % 2 == 0) System.out.print(" ");
			for(int j = 1; j <= size; j++)
			{
				if((j == size ) && (i % 2 == 0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}

	}
}
/*java DamkaBoard 4
* * * * 
 * * * * 
* * * * 
 * * * * 
yoavcohen@Yoavs-MacBook-Pro hw02-Yoav-cohen08 % java DamkaBoard 6
* * * * * * 
 * * * * * * 
* * * * * * 
 * * * * * * 
* * * * * * 
 * * * * * *            */