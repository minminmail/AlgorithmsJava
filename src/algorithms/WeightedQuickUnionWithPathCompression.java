package algorithms;

/*
 * Starting from an empty data structure, any sequence of M union
 * and find operations on N objects takes O(N + Mlg*N) time.
 *
 * 
 */

public class WeightedQuickUnionWithPathCompression {
		
		private int[] id;
		private int[] sz;
		
		public WeightedQuickUnionWithPathCompression(int N)
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
				id[i]=id[id[i]];
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
