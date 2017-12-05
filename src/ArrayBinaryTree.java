import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBinaryTree<T extends Comparable<T>> implements BinaryTree<T>
{
	private Comparable<T>[] _array;

	public ArrayBinaryTree()
	{
		_array = new Comparable[10];
	}

	@Override
	public void add(T elem)
	{
		if (_array[0] == null)
		{
			_array[0] = elem;
		} else
		{
			addTo(elem, 0);
		}

		//System.out.println(Arrays.toString(_array));

	}

	private void addTo(T elem, int root)
	{
		int left = getLeft(root);
		int right = getRight(root);

		if (_array[root].compareTo(elem) < 0)
		{
			if (_array.length <= left)
			{
				_array = Arrays.copyOf(_array, (_array.length+1) * 2);
			}

			if (_array[left] != null)
			{
				addTo(elem, left);
			} else
			{
				_array[left] = elem;
				return;
			}
		} else
		{
			if (_array.length <= right)
			{
				_array = Arrays.copyOf(_array, (_array.length+1) * 2);
			}

			if (_array[right] != null)
			{
				addTo(elem, right);
			} else
			{
				_array[right] = elem;
				return;
			}
		}
	}

	@Override
	public List<T> preorder()
	{
		List<T> list = new ArrayList<T>();
		preorder(0, list);
		return list;
	}

	private void preorder(int root, List<T> list)
	{
		int left = getLeft(root);
		int right = getRight(root);

		list.add((T) _array[root]);

		if (left < _array.length && _array[left] != null)
		{
			preorder(left, list);
		}
		if (right < _array.length &&_array[right] != null)
		{
			preorder(right, list);
		}
	}

	@Override
	public List<T> postorder()
	{
		List<T> list = new ArrayList<T>();
		postorder(0, list);
		return list;
	}

	@SuppressWarnings("unchecked")
	private void postorder(int root, List<T> list)
	{
		int left = getLeft(root);
		int right = getRight(root);

		if (_array[left] != null)
		{
			preorder(left, list);
		}
		if (_array[right] != null)
		{
			preorder(right, list);
		}

		list.add((T) _array[root]);
	}

	@Override
	public List<T> inorder()
	{
		List<T> list = new ArrayList<T>();
		inorder(0, list);
		return list;
	}

	private void inorder(int root, List<T> list)
	{
		int left = getLeft(root);
		int right = getRight(root);

		if (_array[left] != null)
		{
			preorder(left, list);
		}

		list.add((T) _array[root]);

		if (_array[right] != null)
		{
			preorder(right, list);
		}

	}

	private int getRight(int root)
	{
		return (root + 1) * 2;
	}

	private int getLeft(int root)
	{
		return (root + 1) * 2 - 1;
	}
}
