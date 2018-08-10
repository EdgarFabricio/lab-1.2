public class finder 
{
	public static void main (String [] args)
	{
		long startTime= System.nanoTime();
		String word="google";
		System.out.println("String: "+word);
		int index=0;
		int fg=0;
		for (int i=0; i < word.length() ; i++)
		{
			for(int j=0; j < word.length(); j++)
			{
				if(i!=j)
				{
					if(word.charAt(i) == word.charAt(j))
					{
						fg=1;
					}
				}
			}
			if(fg==0)
			{
				index=i;
				break;
			}
			else
			{
				fg=0;
			}
		}
		System.out.println("1st character repeated: "+word.charAt(index));
		long endTime= System.nanoTime();
		long exectTime= endTime - startTime;
		System.out.println("Execution time: "+((float)exectTime/1000000)+"ms");
	}
}
