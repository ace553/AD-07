import java.util.Random;

import org.junit.Test;

public class BinaryTreeTest
{
	private BinaryTree<String> _tree;

	public BinaryTreeTest()
	{
		_tree = new ArrayBinaryTree<String>();
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
