package tech;

/*
 * Program is written by Jaikant
 * 
 * This is for counting number of leaf nodes in binary tree
 * 
 */

public class Count_Leaf_node_binary_tree {
	
	
	public static int count_leaf_node(New_Node root) {
		if(root==null)
			return 0;
		
		if (root.left==null || root.right==null) {
			return 1;
		}
		
		else 
			return count_leaf_node(root.left) +count_leaf_node(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		New_Node root=new New_Node(4);
		New_Node node2=new New_Node(5);
		New_Node node3=new New_Node(6);
		New_Node node4=new New_Node(7);
		New_Node node5=new New_Node(8);
		
		root.left=node2;
		root.right=node3;
		
		node2.left= node4;
		node2.right=node5;
		
		System.out.println(count_leaf_node(root));

	}

}


class New_Node{
	
	int data;
	New_Node left, right;
	
	New_Node(int item){
		data=item;
		left=null;
		right=null;
	}
}
