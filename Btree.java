class Btree
{
	static Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d)
		{
			data = d;
			left = right = null;
		}
	}
	
	Btree()
	{
		root = null;
	}
	Btree(int d)
	{
		root = new Node(d);
	}
	
	
	void printPreorder(Node n)
	{
		if(n == null)
		{
			return;
		}
		System.out.println(n.data);
		printPreorder(n.left);
		printPreorder(n.right);
		
	}
	void preorder()
	{
		printPreorder(root);
	}
	
	
	void printInorder(Node n)
	{
		if(n == null)
		{
			return;
		}
		printInorder(n.left);
		System.out.println(n.data);
		printInorder(n.right);
		
	}
	void inorder()
	{
		printInorder(root);
	}
	
	void printPostorder(Node n)
	{
		if(n == null)
		{
			return;
		}
		printPostorder(n.left);
		printPostorder(n.right);
		System.out.println(n.data);
		
	}
	void postorder()
	{
		printPostorder(root);
	}
	
	
	
	public static void main(String args[])
	{
		Btree bt1 = new Btree();
		root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(12);
		root.left.left = new Node(5);
		root.left.right = new Node(9);
		
		System.out.println("--------Preorder---------");
		bt1.preorder();
		System.out.println("--------Inorder---------");
		bt1.inorder();
		System.out.println("--------Postorder---------");
		bt1.postorder();
		
	}
}

/*
suppose :-> root = 2, left = 1, right = 3


1-> Preorder
	root , left, right.==>> 2,1,3
2-> Inorder
	left, root, right.==>>1,2,3
3-> Postorder
	left, right, root.==>>1,3,2
----------------------------------------------------------

Preorder:->
	void printPreorder(Node n)
	{
		if(n == null)
		{
			return;
		}
		System.out.println(n.data);
		printPreorder(n.left);
		printPreorder(n.right);
		
	}
	void priorder()
	{
		printPreorder(root);
	}
---------------------------------------------------------
Inorder:->
	void printInorder(Node n)
	{
		if(n == null)
		{
			return;
		}
		System.out.println(n.left);
		printInorder(n.data);
		printInorder(n.right);
		
	}
	void inorder()
	{
		printInorder(root);
	}
------------------------------------------------------------

Postorder:->
	void printPostorder(Node n)
	{
		if(n == null)
		{
			return;
		}
		System.out.println(n.left);
		printPostorder(n.right);
		printPostorder(n.data);
		
	}
	void postorder()
	{
		printPostorder(root);
	}
--------------------------------------------------------------


	

*/