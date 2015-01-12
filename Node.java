public class Node
{
	private int value;
	private Node left;
	private Node right;
	
	Node(int value)
	{
		this.value = value;
	}
	
	public void setLeftNode(Node left)
	{
		this.left = left;
	}
	
	public void setRightNode(Node right)
	{
		this.right = right;
	}
	
	public void printNodeTree()
	{
		System.out.print("Node Value: "+value+"\n");
		
		if(left != null)
			System.out.print("\tLeft Node Value: "+left.value+"\n");
		
		if(right != null)
			System.out.print("\tRight Node Value: "+right.value+"\n");
		
		System.out.print("\n");
	}
}
