public class NodeTester
{
	public static void main(String[] args)
	{
		Node[] nodeArray = new Node[6];
		
		//Creating nodes
		for(int i = 0; i < 6; i++)
		{
			nodeArray[i] = new Node(i+1);
		}
		
		//Setting node tree
		nodeArray[1].setLeftNode(nodeArray[0]);
		nodeArray[2].setLeftNode(nodeArray[1]);
		nodeArray[2].setRightNode(nodeArray[3]);
		nodeArray[3].setLeftNode(nodeArray[4]);
		nodeArray[3].setRightNode(nodeArray[5]);
		
		//Printing node tree
		for(int i = 0; i < 6; i++)
		{
			nodeArray[i].printNodeTree();
		}
	}
}	
