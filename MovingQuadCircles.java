 //	YOUR UPI: Kevin A Gao, kgao826, 360875515
 
import java.awt.*;
import java.awt.geom.*;

public class MovingQuadCircles extends MovingCircle{
    public MovingQuadCircles(){
        super();
    }
    public MovingQuadCircles(int x, int y, int length, int mw, int mh, Color bc, Color fc, int pathType){
        super(x, y, length, mw, mh, bc, fc, pathType);
    }
	public void draw(Graphics g){
		Graphics2D shape = (Graphics2D) g;
		int topCircleX = this.x + this.width / 4; //Top circle: x = 1/4 width, y = 0
		int leftCircleY = this.y + this.height / 4; //Left circle: x = 0, y = 1/4 height
		int rightCircleX = this.x + this.width / 2; //Right circle: x = 1/2 width, y = 1/4 height
		int rightCircleY = leftCircleY;
		int bottomCircleX = topCircleX; //Bottom circle: x = 1/4 width, y = 1/2 height
		int bottomCircleY = this.y + this.height / 2;
		shape.setColor(fillColor); //this is the shape intersection colour
		Ellipse2D topCircle = new Ellipse2D.Double(topCircleX, this.y, this.width / 2, this.height / 2);
		Ellipse2D leftCircle = new Ellipse2D.Double(this.x, leftCircleY, this.width / 2, this.height / 2);
		Ellipse2D bottomCircle = new Ellipse2D.Double(bottomCircleX, bottomCircleY, this.width / 2, this.height / 2);
		Ellipse2D rightCircle = new Ellipse2D.Double(rightCircleX, rightCircleY, this.width / 2, this.height / 2);
		Area area1 = new Area(topCircle); 
		Area area2 = new Area(leftCircle); 
		Area area3 = new Area(rightCircle);
		Area area4 = new Area(bottomCircle);
		Area area5 = new Area(topCircle);
		area1.intersect(area2); //intersection between top and left circle
		area2.intersect(area4); //intersection between left and bottom circle
		area4.intersect(area3); //intersection between bottom and right circle
		area3.intersect(area5); //intersection between right and top circle
		shape.fill(area1);
		shape.fill(area2);
		shape.fill(area3);
		shape.fill(area4);
		shape.setColor(borderColor); //border colour
		shape.drawOval(topCircleX, this.y, this.width / 2, this.height / 2);
		shape.drawOval(this.x, leftCircleY, this.width / 2, this.height / 2);
		shape.drawOval(rightCircleX, rightCircleY, this.width / 2, this.height / 2);
		shape.drawOval(bottomCircleX, bottomCircleY, this.width / 2, this.height / 2);
		drawHandles(shape);
	}
}	