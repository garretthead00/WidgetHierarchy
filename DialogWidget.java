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
public class DialogWidget extends Widget {

    private String header;
    
    public DialogWidget(String hdr, float x, float y, float w, float h) {
        super(x, y, w, h);
        this.className = "DialogWidget";
        this.header = hdr;
    }
    
    @Override
     public String toString() {
		return this.className + ": header=\"" +this.header + "\" x=" + this.x + " y=" + this.y + " w=" + this.w + " h=" + this.h;
	}
    
}
