package algorithms;

/*  Quick union is also too slow
 * Trees can get tall
 * Find too expensive 
 * Need to do find to do union
 */

public class QuickUnion {
	
	private int[] id;
	
	public QuickUnion(int N) {
		id = new int[N];
		for (int i=0;i<N;i++)
		{
			id[i]=i;
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
		int i = root(p);
		int j= root(q);
		id[i]=j;
	}
	

}
