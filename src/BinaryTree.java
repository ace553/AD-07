/**
 * AD Praktikum 7
 * @author Frederic Dlugi & Maximilian Mang
 * 29.11.2017
 */
import java.util.List;

public interface BinaryTree<T extends Comparable>
{
	/**
	 * Fuegt ein Element in den binaeren Suchbaum ein.
	 * @param elem Das Element, welches hinzugefuegt werden soll
	 */
	public void add(T elem);
	
	/**
	 * Generiert eine sortierte Liste aus dem binaeren Suchbaum.
	 * Hier wird das Peorder-Verfahren benutzt
	 * Rekursive Def: preorder(Tk) = (k, preorder(Tk1) , preorder(Tk2))
	 * @return Die sortierte Liste
	 */
	public List<T> preorder();
	
	/**
	 * Generiert eine sortierte Liste aus dem binaeren Suchbaum.
	 * Hier wird das Postorder-Verfahren benutzt
	 * Rekursive Def: postorder(Tk) = ( postorder(Tk1) , postorder(Tk2), k)
	 * @return Die sortierte Liste
	 */
	public List<T> postorder();
	
	/**
	 * Generiert eine sortierte Liste aus dem binaeren Suchbaum.
	 * Hier wird das Inorder-Verfahren benutzt#
	 * Rekursive Def: inorder(Tk) = ( inorder(Tk1) , k , inorder(Tk2))
	 * @return Die sortierte Liste
	 */
	public List<T> inorder();
}
