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
public class PictureWidget extends Widget {

    private String img;
    
    public PictureWidget(String pic, float x, float y, float w, float h) {
        super(x, y, w, h);
        this.img = pic;
        this.className = "PictureWidget";
    }
    
    
    
    public String toString() {
	return this.className + ": img=\"" + img + "\" x=" + this.x + " y=" + this.y + " w=" + this.w + " h=" + this.h;
    }
    
}
