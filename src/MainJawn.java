
public class MainJawn
{
	public static void main(String[] args)
	{
		Measurable[] myArr = new Measurable[15];
		for(int i = 0; i < 15; i++)
			myArr[i] = new Country(Math.random() * 150+300);
		
		System.out.println("Average Population: " + findAverage(myArr));
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
