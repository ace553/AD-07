import java.util.ArrayList;
import java.util.List;

public class LinkedBinaryTree<T extends Comparable<T>> implements BinaryTree<T>
{
	private Node<T> _root;

	public LinkedBinaryTree()
	{
		_root = null;
	}

	@Override
	public void add(T elem)
	{
		if (_root == null)
		{
			_root = new Node<T>(elem, null);
		} else
		{
			addTo(elem, _root);
		}

	}

	private void addTo(T elem, Node<T> root)
	{
		if (root.getElem().compareTo(elem) < 0)
		{
			if (root.getLeft() != null)
			{
				addTo(elem, root.getLeft());
			} else
			{
				root.setLeft(new Node<T>(elem, root));
				return;
			}
		} else
		{
			if (root.getRight() != null)
			{
				addTo(elem, root.getRight());
			} else
			{
				root.setRight(new Node<T>(elem, root));
				return;
			}
		}
	}

	@Override
	public List<T> preorder()
	{
		List<T> list = new ArrayList<T>();
		preorder(_root, list);
		return list;
	}

	private void preorder(Node<T> root, List<T> list)
	{
		list.add(root.getElem());
		if (root.getLeft() != null)
		{
			preorder(root.getLeft(), list);
		}
		if (root.getRight() != null)
		{
			preorder(root.getRight(), list);
		}
	}

	@Override
	public List<T> postorder()
	{
		List<T> list = new ArrayList<T>();
		postorder(_root, list);
		return list;
	}

	private void postorder(Node<T> root, List<T> list)
	{
		if (root.getLeft() != null)
		{
			postorder(root.getLeft(), list);
		}
		if (root.getRight() != null)
		{
			postorder(root.getRight(), list);
		}
		list.add(root.getElem());
	}

	@Override
	public List<T> inorder()
	{
		List<T> list = new ArrayList<T>();
		inorder(_root, list);
		return list;
	}

	private void inorder(Node<T> root, List<T> list)
	{
		if (root.getLeft() != null)
		{
			inorder(root.getLeft(), list);
		}
		list.add(root.getElem());
		if (root.getRight() != null)
		{
			inorder(root.getRight(), list);
		}
	}
}
