public class InOrder 
{
	public static void main (String[] args) 
	{
		int sub = 0;
		int num = (int)(Math.random() * 10);
		do
		{
		System.out.print(num + " ");
		sub = num;
		num = (int)(Math.random() * (10));
		}	while(num >= sub);
	}
}
//(int)(Math.random() * (num2 - num1)) + num1;