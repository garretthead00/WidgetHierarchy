package widgetheirarchy;

/**
 *
 * @author Jarvis
 */
public class PanelWidget extends Widget {
    
    

    public PanelWidget(float x, float y, float w, float h) {
        super(x, y, w, h);
        this.className = "PanelWidget";
    }
    public PanelWidget(Widget w) {
        super(w);
        this.className = "PanelWidget";
    }
    
    
   
}
