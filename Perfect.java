/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect 
{
	public static void main (String[] args) 
	{
		int check = Integer.parseInt(args[0]);
		String per = "";
		per = check + " is a perfect number since " + check + "  = 1";
		int sum = 1; 
		for(int i = 2; i < check; i++)
		{
			if ((check % i) == 0) 
			{
				sum += i;
				per = per + " + " + i;
			}
		}
		if((check != sum)||(check == 0)) per = check + " is not a perfect number";
		System.out.println(per);

	}
}

/*java Perfect 8
8 is not a perfect number
yoavcohen@Yoavs-MacBook-Pro hw02-Yoav-cohen08 % java Perfect 6
6 is a perfect number since 6  = 1 + 2 + 3
yoavcohen@Yoavs-MacBook-Pro hw02-Yoav-cohen08 % java Perfect 24
24 is not a perfect number
yoavcohen@Yoavs-MacBook-Pro hw02-Yoav-cohen08 % java Perfect 28
28 is a perfect number since 28  = 1 + 2 + 4 + 7 + 14
yoavcohen@Yoavs-MacBook-Pro hw02-Yoav-cohen08 % java Perfect 496
496 is a perfect number since 496  = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248
yoavcohen@Yoavs-MacBook-Pro hw02-Yoav-cohen08 % java Perfect 5002
5002 is not a perfect number
yoavcohen@Yoavs-MacBook-Pro hw02-Yoav-cohen08 % java Perfect 8128
8128 is a perfect number since 8128  = 1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064
*/
