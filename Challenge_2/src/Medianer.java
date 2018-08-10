import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Medianer 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		long startTime= System.nanoTime();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		String integers="";
		StringTokenizer valores; 
		int[] numbers;
		int tokens;
		while (true) 
		{
			System.out.print("\nSelect an option by typing the number:\n1.Add a number.\n2.Get the median.\n3.Exit.\nOption: ");
			i = Integer.parseInt(br.readLine());
			//System.out.println(i);
			if(i==1)
			{
				System.out.print("Type the next numer: ");
				integers=integers+Integer.parseInt(br.readLine())+"+";
				//System.out.println("\n"+integers);
				//System.out.println(valores.nextToken());
				//System.out.println(valores.nextToken());				
			}
			else if(i==2)
			{
				valores= new StringTokenizer(integers, "+");
				tokens= valores.countTokens();
				numbers= new int[tokens];
				//System.out.println(valores.countTokens());
				for(int n=0; n<tokens;n++)
				{
					numbers[n]=Integer.parseInt(valores.nextToken());
				}
				Arrays.sort(numbers);
				System.out.println("Inseted numbers:\n"+Arrays.toString(numbers));
				if(numbers.length%2==0)
				{
					System.out.println("The median is "+(float)(numbers[numbers.length/2]+numbers[numbers.length/2-1])/2);
				}
				else
				{
					System.out.println("The median is "+numbers[numbers.length/2]);	
				}
				br.readLine();
			}
			else if(i==3)
			{
				System.out.println("Exiting program...");
				break;
			}
			else 
			{
				System.out.println("Invalid option");
			}
		}
		long endTime= System.nanoTime();
		long exectTime= endTime - startTime;
		System.out.println("Execution time: "+((float)exectTime/1000000)+"ms");
	}
}
