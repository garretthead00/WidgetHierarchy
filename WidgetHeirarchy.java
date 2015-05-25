/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widgetheirarchy;

public class WidgetHeirarchy {

    
    
    
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		

                Widget mainScreen = new PanelWidget(0,0,800,600);
		mainScreen.addChild(new PictureWidget("background.jpg", 0, 0, 800, 600));
		mainScreen.addChild(new PictureWidget("icon.jpg",10,10,50,50));
                mainScreen.addChild(new ButtonWidget("X",780,0,20,20));
                
                Widget dialog = new DialogWidget("Pick a card!",100,50,200,200);
                ButtonWidget aceButton = new ButtonWidget("Ace",0,50,50,75);
                aceButton.addChild(new PictureWidget("ace.jpg",10,20,30,30));
                dialog.addChild(aceButton);
                
                ButtonWidget kingButton = new ButtonWidget("King",50,50,50,75);
                kingButton.addChild(new PictureWidget("king.jpg",10,20,30,30));
                dialog.addChild(kingButton);
                
                ButtonWidget queenButton = new ButtonWidget("Queen",100,50,50,75);
                queenButton.addChild(new PictureWidget("queen.jpg",10,20,30,30));
                dialog.addChild(queenButton);
                
                ButtonWidget jackButton = new ButtonWidget("Jack",150,50,50,75);
                jackButton.addChild(new PictureWidget("jack.jpg",10,20,30,30));
                dialog.addChild(jackButton);                
                dialog.remove(aceButton);
                dialog.remove(queenButton);
                dialog.addChild(queenButton);
                dialog.addChild(aceButton);
                dialog.addChild(new ButtonWidget("EXIT",50,175,100,25));
                
                mainScreen.addChild(dialog);
		mainScreen.DebugInfo();

	}
}