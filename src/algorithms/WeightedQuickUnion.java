package algorithms;

/*
 * data structure Union Find
 * Quick-find      N     1
 * Quick-union     N*    N
 * Weighted QU     lgN*  lgN 
 */

public class WeightedQuickUnion {
	
	private int[] id;
	private int[] sz;
	
	public WeightedQuickUnion(int N)
	{		
		id = new int[N];
		for (int i=0;i<N;i++)
		{
			id[i]=i;
			sz[i]=1;
		}		
	}
	
	private int root(int i) {
		while(i!=id[i])
			i=id[i];
		
		return i;
	}
	
	public boolean find(int p, int q)
	{
		return root(p)==root(q);
	}
	
	public void unite(int p,int q)
	{
		if(sz[p]<sz[q])
		{
			id[p]=q;
			sz[q]+=sz[p];
			
		}
		else
		{
			id[q]=p;
			sz[p]+=sz[q];
			
		}
		
	}

}
