import java.util.List;

public interface BinaryTree<T extends Comparable>
{
	public void add(T elem);
	public List<T> preorder();
	public List<T> postorder();
	public List<T> inorder();
}
