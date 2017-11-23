import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest
{
	private BinaryTree<String> _tree;
	public BinaryTreeTest()
	{
		_tree = new LinkedBinaryTree<String>();
	}
	
	@Test
	public void testPreoder()
	{
		for(int i = 20; i > 10; i--)
		{
			_tree.add(""+i);
		}
		
		System.out.println(_tree.preorder());
	}
	
	@Test
	public void testPostorder()
	{
		for(int i = 20; i > 10; i--)
		{
			_tree.add(""+i);
		}
		
		System.out.println(_tree.postorder());
	}
	
	@Test
	public void testInorder()
	{
		for(int i = 20; i > 10; i--)
		{
			_tree.add(""+i);
		}
		
		System.out.println(_tree.inorder());
	}

}
