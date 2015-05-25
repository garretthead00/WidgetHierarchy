
package widgetheirarchy;
import java.util.ArrayList;


/**Class: Tree
 * This class will create and manipulate the Tree of generic type T using the Widgets<T> and the methods
 * 
 * @author Garrett Head
 *
 * @param <T>
 */
public class Tree<T> {

	//Declare the root Widget
	private Widget root;
        	
	/** This constructor will create the root of the Tree using the Widget<T> r passed in **/
	public Tree(Widget r) {
		this.root = r;
	}

	/** This method will check to see if the Tree is empty; returning a boolean whether true or false **/
	public boolean isEmpty() {
		return (root == null) ? true : false;
	}

	/** This method will return the Widget root from the Tree **/
	public Widget getRoot() {
		return root;
	}

	/** This method will set the root of the Tree to the Widget passed through **/
	public void setRoot(Widget root) {
		this.root = root;
	}

	/** This method will check whether or not a Widget exist in the Tree by passing in a key
	 * and returning the boolean passed back by the find method
	 *
	public boolean exists(T key) {
		return find(root, key);
	}*/

	/** This returns the number of nodes by calling the getNumberOfDescendants */
	public int getNumberOfNodes() {
		return getNumberOfDescendants(root)+1;
	}

	/** This method will return the number of descendants of the Widget in the Tree */
	public int getNumberOfDescendants(Widget node) {
		int n = node.getChildren().size(); // get the number of kids in the list
		for (Widget child : node.getChildren()){ n+= getNumberOfDescendants(child);} // for each child in the list; the sum
		return n;
	}

	
	@SuppressWarnings("unused")
	/** This method will clone a list of Widgets in the list to a new Widget list and returns the newList */
	private ArrayList<Widget> clone(ArrayList<Widget> list) {
		ArrayList<Widget> newList = new ArrayList<>(); // create a new Widget list
		for (Widget node : list) // for each node in the list
			newList.add(new Widget(node)); // add the node to the newList

		return newList;
	}
	
	/****************************PRE ORDER TRAVERSAL*****************************/
	
	/** This method will build the tree using the Pre Order Method by passing in the node
	 * and an ArrayList of Widgets
	 */
	private void buildPreOrder(Widget node, ArrayList<Widget> preOrder) {
		preOrder.add(node); 
		for (Widget child : node.getChildren()) {
			buildPreOrder(child, preOrder); // Recursively call this method until a leaf is found;
		}
	}
	
	/** This method will returns the preOrder arranged list **/
	public ArrayList<Widget> getPreOrderTraversal() {
		ArrayList<Widget> preOrder = new ArrayList<>();
		buildPreOrder(root, preOrder); // calls the recursive function preOrder
		return preOrder;
	}
        
    public int getHeight(Widget n){
        // if n is a leaf
        if(null == n.getChildren()){
             return 0;
        }
        else{
            int maxDepth = 0;

            for(Widget child : n.getChildren()){
                maxDepth = Math.max(maxDepth, getHeight(child));
            }

            return maxDepth + 1;
        }
        
    } 
     public int getLevel(Widget n) {
        int level = 1;
        while (n != null && n.parent != null) {
            level++;
            n = n.parent;
        }
        return level;
   }
     
   public void printPreOrder(){
       
       for(Widget i : this.getPreOrderTraversal()){
               for(int dent = 1; dent < getLevel(i);dent++ ){System.out.print("\t");}
               System.out.print(i.toString() + " \n");
           }  
   }
}
	
	