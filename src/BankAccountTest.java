
public class BankAccountTest
{
	public static void main(String[] args)
	{
		BankAccount[] myArr = new BankAccount[15];
		for(int i = 0; i < 15; i++)
			myArr[i] = new BankAccount(Math.random() * 4000+3000);
		
		System.out.println("Average Balance: " + findAverage(myArr));
	}
	
	private static double findAverage(Measurable[]  arr)
	{
		double total = 0;
		for(Measurable obj:arr)
		{
			total += obj.getMeasure();
		}
		return total/arr.length;
	}
}
