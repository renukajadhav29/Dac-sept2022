class DoublyLinkedList
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
	
static void insertAtend(int new_data)
{
	Node newnode = new Node(new_data);
	Node temp = head;
	newnode.next = null;
	if(head == null)
	{
		newnode.prev = null;
		head = newnode;
		return;
	}
	while(temp.next != null)
	{
		temp = temp.next;
	}
	temp.next = newnode;
	newnode.prev = temp;
}

//insert in between two nodes...
static void insertInBetween(int new_data, Node temp)
{
	if(head == null)
	{
		return;
	}
	Node newnode = new Node(new_data);
	newnode.next = temp.next;
	temp.next = newnode;
	newnode.prev = temp;
	newnode.next.prev = newnode;
	
}

//delete a node
static void deleteNode(Node temp)
{
	if((head == null) || (temp == null))
	{
		return;
	}
	//case 1: head deletion
	if(head == temp)
	{
		head = temp.next;
		head.prev = null;
	}
		
	//case 2: and case 3: deletion
	
	if(temp.next != null)//checking is there any last node..? 
		temp.next.prev = temp.prev;
	if(temp.prev != null)
		temp.prev.next = temp.next;
	return;
} 


static void display(Node n)
{
	Node last = null;
	System.out.println("Forward :-> ");
	while(n != null)
	{
		System.out.print(n.data+"-->");
		last = n;//to reach last node of linked list initialized as last = n;
		n = n.next;
	}
	
	System.out.println("\nBackward :-> ");
	while(last != null)//here now last pointing to last node 
	{
		System.out.print(last.data+"-->");
		last = last.prev;
	}
	
}
public static void main(String args[])
{
	//DoublyLinkedList dl = new DoublyLinkedList();
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
