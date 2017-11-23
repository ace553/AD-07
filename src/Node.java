
public class Node<T extends Comparable>
{
	private Node<T> _root;
	private Node<T> _left;
	private Node<T> _right;
	
	private T _elem;
	
	public Node(T elem,Node<T> root, Node<T> right, Node<T> left)
	{
		_right = right;
		_left = left;
		_root = root;
		_elem = elem;
	}
	
	public Node(T elem,Node<T> root)
	{
		_root = root;
		
		_elem = elem;
	}
	
	public Node<T> getLeft()
	{
		return _left;
	}

	public Node<T> getRight()
	{
		return _right;
	}
	
	public T getElem()
	{
		return _elem;
	}
	
	
	public Node<T> getRoot()
	{
		return _root;
	}
	
	public void setRoot(Node<T> root)
	{
		this._root = root;
	}
	
	public void setLeft(Node<T> left)
	{
		_left = left;
	}
	
	public void setRight(Node<T> right)
	{
		_right = right;
	}
	
	public void setElem(T elem)
	{
		this._elem = elem;
	}
	
	
}

