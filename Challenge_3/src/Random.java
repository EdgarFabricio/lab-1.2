import java.io.IOException;

public class Random 
{
	public static void main(String[] args) throws IOException
	{
		long startTime= System.nanoTime();
		int N=10;
		int k=6;
		System.out.println("N: "+N+"\n"+"k: "+k);
		int[] list= new int[k];
		int newIndex=(int)(Math.random()*N);
		int i=0;
		int j=0;
		for(i=0;i<k;i++)
		{
			list[i]=newIndex;
			for(j=0;j<i;j++)
			{
				if(newIndex==list[j])
				{
					i--;
				}
			}
			newIndex=(int)(Math.random()*N);
		}
		System.out.println("Banned list:");
		newIndex=0;
		int[] sortedList= new int[k];
		for(i=0; i<k; i++)
		{
			for(j=0; j<k; j++)
			{
				if(newIndex==list[j])
				{
					sortedList[i]=newIndex;
					System.out.println((i+1)+".\t"+sortedList[i]);
					break;
				}
				else if(j==(k-1))
				{
					i--;
				}
			}
			newIndex++;
		}
		while(j!=0)
		{
			newIndex=(int)(Math.random()*N);
			for(i=0;i<k;i++)
			{
				if(list[i]==newIndex)
				{
					break;
				}
				else if (i==(k-1))
				{
					j=0;
				}
			}	
		}
		System.out.println("Random number: "+newIndex);
		long endTime= System.nanoTime();
		long exectTime= endTime - startTime;
		System.out.println("Execution time: "+((float)exectTime/1000000)+"ms");
	}
}
