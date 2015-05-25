package widgetheirarchy;
import java.util.ArrayList;
import java.util.List;

/**Class Widget:
 * This class will create a Widget of the generic type T.
 * This class will contain methods to manipulate Widgets in the Game Tree.
 * 
 * @author Garrett Head
 *
 * 
 */
public class Widget {    

	protected float x;
        protected float y;
        protected float w;
        protected float h;
        protected String className;
	protected List<Widget> children;
	protected Widget parent;	
	
	/** Constructor
	 * This will create a Widget assigning it the T data value passed through && created the children for the Widget
         * 
         */        
	public Widget(float x, float y, float w, float h) {
		this.x = x;
                this.y = y;
                this.w = w;
                this.h = h;
		this.children = new ArrayList<>(); // create the list of children
	}

	/** Constructor
	 * This will be passed a Widget node and will assign the data value of the Widget && create the children
	 */
	public Widget(Widget node) {
            this.x = node.getX();
            this.y = node.getY();
            this.w = node.getW();
            this.h = node.getH();
            
            children = new ArrayList<>(); // create the list of children
	}

	/** This method will add a child Widget to THIS by passing in the Widget child; */
	public void addChild(Widget child) {
		child.setParent(this); // assign the parent to the child Widget
		children.add(child); // add
	}

	/** This method will add a new Child to the index value for the ArrayList<Widget> **/
	public void addChildAt(int index, Widget child) {
		child.setParent(this);
		this.children.add(index, child);
	}

	/** This method will assign the parent of the entire children list to the Widget **/
	public void setChildren(List<Widget> children) {
            for (Widget child : children) {
                child.setParent(this);
            }
            this.children = children; // Assign the list to the children list passed in
	}

	/** This method will remove the children list from the Widget **/
	public void removeChildren() {  this.children.clear();	}

	/** This method will remove a individual child at a given index an return the removed Widget **/
	public void remove(Widget rmv) {    this.children.remove(rmv);  }
        
        
	/** This method will Access and return the data of the Widget **/
	public float getX() { return this.x;	}
        public float getY() { return this.y;	}
        public float getW() { return this.w;	}
        public float getH() { return this.h;	}

	/** This method will return the parent of the Widget */
	public Widget getParent() { return this.parent;	}

	/** This method will assign the Parent of the Widget calling the method  **/
	public void setParent(Widget parent) {	this.parent = parent; }

	/** This method will return the children list of the Widget **/
	public List<Widget> getChildren() { return this.children; }

	/** This will return the child of the Widget at the specified index **/
	public Widget getChildAt(int index) { return children.get(index); }

	/** This method will return a String of the data in the Widget **/
        @Override
	public String toString() { return this.className + ": x=" + this.x + " y=" + this.y + " w=" + this.w + " h=" + this.h;	}
        
        public void DebugInfo(){
            
           Tree widgetTree = new Tree(this);
            widgetTree.printPreOrder();
       }    
}
