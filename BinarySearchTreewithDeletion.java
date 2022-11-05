class BST
{
	static class Node{
		
		//Node fields
		
		private int data;
		private Node left;
		private Node right;
		
		// Node methods
		public Node()
		{
			data = 0;
			left = null;
			right = null;
		}
		public Node(int val)
		{
			data = val;
			left = null;
			right = null;
		}
		
	}
	
	//tree fields
	private Node root;
	
	//tree methods
	
	public void binarySearch()
	{
		root = null;
		
	}
	
	public void add(int val)
	{
		Node newnode = new Node(val);
		Node trav;
		trav = root;
		if(root == null)
		{
			root = newnode;
		}
		else
		{
			while(true)
			{
				if(val < trav.data)
				{
					if(trav.left != null)//there is child in left
					{
						trav = trav.left;
					}
					else	//no child in left
					{
						trav.left = newnode;
						break;
					}
				}
				
				else 	//val >= trav.data 
				{
					if(trav.right != null)	//there is child in right
					{
						trav = trav.right;
					}
					else	//no child in rigth
					{
						trav.right = newnode;
						break;
					}
				}
			}
			
		}
	}
	public void preorder(Node trav)	//preorder
	{
		if(trav == null)
			return;
		System.out.print(trav.data+", ");
		preorder(trav.left);
		preorder(trav.right);
	}
	public void preorder()
	{
		System.out.println("Preorder=>> ");
		preorder(root);
		System.out.println();
	}
	
	
	public void inorder(Node trav)
	{
		if(trav == null)
			return;
		inorder(trav.left);
		System.out.print(trav.data+", ");
		inorder(trav.right);
	}
	public void inorder()
	{
		System.out.println("Inorder=>> ");
		inorder(root);
		System.out.println();
	}
	
	public void postorder(Node trav)
	{
		if(trav == null)
			return;
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data+", ");
	}
	public void postorder()
	{
		System.out.println("Preorder=>> ");
		postorder(root);
		System.out.println();
	}
	
	private void deleteAll(Node trav)
	{
		if(trav == null)
			return;
		deleteAll(trav.left);
		deleteAll(trav.right);
		trav.left = null;
		trav.right = null;
		trav = null;
	}
	
	public void deleteAll()
	{
		deleteAll(root);
		root = null;
	}
	
}
class BinarySearchTreewithDeletion
{
	public static void main(String args[])
	{
		BST b1 = new BST();
		b1.add(50);
		b1.add(30);
		b1.add(10);
		b1.add(90);
		b1.add(100);
		b1.add(40);
		b1.add(70);
		b1.add(80);
		b1.add(60);
		b1.add(20);
		
		//display();
		b1.preorder();
		b1.inorder();
		b1.postorder();
		System.out.println("After deletion of all tree:-> ");
		b1.deleteAll();
		
		b1.postorder();
	}	
}