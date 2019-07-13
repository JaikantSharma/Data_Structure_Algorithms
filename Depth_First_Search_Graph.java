package tech;

/*
 * Program is written by Jaikant
 * 
 * This is for Depth First Search in Graph 
 * 
 * 
 */

import java.util.Iterator;
import java.util.LinkedList;

public class Depth_First_Search_Graph {

	//A Graph is defined by Vertices and Edges
	//To connect vertices and edges we use Adjacency list which is kind of Linked list
	//Its entirely defined by edges & relations defined connections or edges
	int v;
	LinkedList<Integer>[]  adj;
	public Depth_First_Search_Graph(int v){
		this.v=v;
		adj= new LinkedList[v];
		//Initializes vertices linked list
		//Relation will be defined later
		for(int i=0; i<v;i++) {
			adj[i]=new LinkedList<Integer>(); 
		}
		
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	void DFSUtil(int v, boolean visited[]) {
		visited[v]= true;
		
		System.out.print(v+" ");
		
		Iterator<Integer> i= adj[v].listIterator();
		
		while(i.hasNext()){
			int n= i.next();
			
			//Definitely recursive
			if(!visited[n]) {
				DFSUtil(n,visited);
			}
		}
	}
	public void DFS(int V) {
		
		//Boolean array is used to keep track of visited
		boolean visited[] = new boolean[v];
		
		DFSUtil(V, visited);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Depth_First_Search_Graph depth_First_Search_Graph= new Depth_First_Search_Graph(4);
		
		depth_First_Search_Graph.addEdge(0, 1);
		depth_First_Search_Graph.addEdge(0, 2);
		depth_First_Search_Graph.addEdge(0, 3);
		depth_First_Search_Graph.addEdge(1, 2);
		depth_First_Search_Graph.addEdge(2, 0);
		depth_First_Search_Graph.addEdge(2, 3);
		depth_First_Search_Graph.addEdge(3, 3);
		
		depth_First_Search_Graph.DFS(2);

	}

}
