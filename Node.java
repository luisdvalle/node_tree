public class Node 
{
  private int value;
  private Node left;
  private Node right;

  void setLeftNodeValue(int value)
  {
    left.value = value;
  }
  
  void setRightNodeValue(int value)
  {
    right.value = value;
  }

  void PrintNodeTree(node tree) 
  {
    if(left != null)
      System.out.print(left.value);
    
    System.out.print(tree.value);
    
    if(right != null)
      System.out.print(right.value);
  }

}
