package student;

public class Factors
{
	public void main(String args[]) 
	{
		int num = Integer.parseInt(args[0]);
		int result = 1;
		while (num > 0) 
		{
			result = result * num;
			num ++;
		}
		System.out.println("factorial of a given number is :" + result);
	}
}
