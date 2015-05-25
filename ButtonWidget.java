/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widgetheirarchy;

/**
 *
 * @author Jarvis
 */
public class ButtonWidget extends Widget {

    private String text;
    
    public ButtonWidget(String tx, float x, float y, float w, float h) {
        super(x, y, w, h);
        this.className = "ButtonWidget";
        this.text = tx;
    }
    
    @Override
     public String toString() {
	return this.className + ": text=\"" + text + "\" x=" + this.x + " y=" + this.y + " w=" + this.w + " h=" + this.h;
    }
}
