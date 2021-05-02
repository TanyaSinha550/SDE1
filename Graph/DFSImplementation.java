package Com.learning;

import java.util.ArrayList;


public class DFSImplementation {

	public static void main(String[] args) {
		int vertex=5;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		
		for(int i=0;i<=vertex;i++)
			adj.add(new ArrayList<Integer>());


		addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
		
        printGraph(adj,vertex);
        
        ArrayList<Integer> ty=DFS(adj,vertex);
        for(Integer i:ty)
        	System.out.print(i+" ");
        
	}
	
	
	public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	
	public static void printGraph(ArrayList<ArrayList<Integer>> adj,int vertex)
	{
		for(int i=1;i<adj.size();i++)
		{
			System.out.println("Vertex "+ i);
			for(int j=0;j<adj.get(i).size();j++)
				System.out.print("-> "+adj.get(i).get(j));
			System.out.println();
		}
	}
	
	public static ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> adj,int vertex)
	{
		
		
		ArrayList<Integer> dfsStore=new ArrayList<>();
		boolean[] vis=new boolean[vertex+1];
		for(int i=1;i<=vertex;i++)
		{
			if(vis[i]==false)
				DfsCheck(i,adj,vis,dfsStore);
		}
		return dfsStore;
	
	} // end of dfs
	
	public static void DfsCheck(int i,ArrayList<ArrayList<Integer>> adj,boolean[] vis,ArrayList<Integer> storeDfs)
	{
		storeDfs.add(i);
		vis[i]=true;
		
		for(Integer tt:adj.get(i))
		{
			if(vis[tt]==false)
				DfsCheck(tt,adj,vis,storeDfs);
		}
	
	}
	
}
