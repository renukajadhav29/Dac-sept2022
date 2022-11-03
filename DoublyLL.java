class DoublyLL
{
	static Node head;
	
	static class Node{
	int data;
	Node prev;
	Node next;
	
	Node(int d)
	{
		data = d;
		prev = next = null;
	}
}
static void insertAtBegining(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		
		if(head != null)
		{
			head.prev = new_node;
		}
		head = new_node;
	}
static void display(Node n)
{
	Node last = null;
	System.out.println("Forward :-> ");
	while(n != null)
	{
		System.out.print(n.data+"-->");
		last = n;
		n = n.next;
	}
	
	System.out.println("\nBackward :-> ");
	while(last != null)
	{
		System.out.print(last.data+"-->");
		last = last.prev;
	}
	
}
public static void main(String args[])
{
	//DoublyLL dl = new DoublyLL();
	insertAtBegining(10);
	insertAtBegining(20);
	insertAtBegining(30);
	insertAtBegining(40);
	insertAtBegining(50);
	insertAtBegining(60);
	//display(dl.head);
	display(head);
}
}



/*Node Structure:->
------------------

class Node{
	int data;
	Node prev;
	Node next;
	
	Node(int d)
	{
		data = d;
		prev = next = null;
	}
}

Insert Operation:
-----------------

case 1:
Insert at begining
	
	static void insertAtBegining(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		
		if(head != null)
		{
			head.prev = new_node;
			head = new_node;
		}
	}
	
	*/