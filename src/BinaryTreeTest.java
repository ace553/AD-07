import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;

public class BinaryTreeTest
{
	private BinaryTree<String> _tree;
	private BinaryTree<String> _tree2;
	public BinaryTreeTest()
	{
		_tree = new ArrayBinaryTree<String>();
		_tree2 = new LinkedBinaryTree<String>();
	}

	@Test
	public void testCompare()
	{
		for(int num = 0; num < 50; num++)
		{

			String[] shuffled = shuffledStringArray(20);
			for(int i = 0; i < shuffled.length; i++)
			{
				_tree.add(shuffled[i]);
				_tree2.add(shuffled[i]);
			}
			List<String> preorder1 = _tree.preorder();
			List<String> preorder2 = _tree.preorder();
			
			for(int i = 0; i < preorder1.size(); i++)
			{
				assertEquals(preorder1.get(i), preorder2.get(i));
			}
			_tree = new ArrayBinaryTree<String>();
			_tree2 = new LinkedBinaryTree<String>();
			System.gc();
			
		}
	}
	
	@Test
	public void testPreoder()
	{
		String[] shuffled = shuffledStringArray(20);
		for (int i = 0; i < shuffled.length; i++)
		{
			_tree.add(shuffled[i]);
		}

		System.out.println(_tree.preorder());
	}

	@Test
	public void testPostorder()
	{
		String[] shuffled = shuffledStringArray(20);
		for (int i = 0; i < shuffled.length; i++)
		{
			_tree.add(shuffled[i]);
		}

		System.out.println(_tree.postorder());
	}

	@Test
	public void testInorder()
	{
		String[] shuffled = shuffledStringArray(20);
		for (int i = 0; i < shuffled.length; i++)
		{
			_tree.add(shuffled[i]);
		}

		System.out.println(_tree.inorder());
	}

	private String[] shuffledStringArray(int size)
	{
		String[] array = new String[size];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = "" + i;
		}

		Random r = new Random();
		for (int i = 0; i < array.length; i++)
		{
			String temp = array[i];
			int rand = r.nextInt(size);
			array[i] = array[rand];
			array[rand] = temp;
		}
		return array;
	}

}
