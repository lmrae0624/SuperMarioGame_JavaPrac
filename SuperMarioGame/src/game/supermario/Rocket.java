package game.supermario;

import java.awt.Graphics;

public class Rocket {

	GameImg img = new GameImg();

	int x_tcl, y_tcl;
	int speed;	

	public boolean move() {
		x_tcl--;
		return (x_tcl <=0);
	}

	public void draw(Graphics g){
        g.drawImage(img.tclimg2,x_tcl,y_tcl,null);
    }
}
