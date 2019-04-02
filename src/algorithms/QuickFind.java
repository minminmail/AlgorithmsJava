package algorithms;

/* Quick-find algorithm is too slow. 
 * It may take MN steps to process M union commands on N objects 
 * Union too expensive (N steps)
 * Trees are flat, but too expensive to keep them flat.
 */

public class QuickFind {
	
	private int[] id;
	
	public QuickFind(int N)
	{
		//set id of each object to itself
		id = new int[N];
		for(int i=0;i<N;i++)
		{
			id[i]=i;
		}
	}
	
	public boolean find(int p, int q)
	{
		return id[p]==id[q];
	}
	
	public void unite(int p, int q)
	{
		int pid =id[p];
		for(int i=0;i<id.length;i++)
			if(id[i]==pid)
			{
				id[i]=id[q];
			}
	}

}
