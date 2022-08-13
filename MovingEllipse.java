//Kevin A Gao, kgao826, 360875515

import java.awt.*;

public class MovingEllipse extends MovingShape{
    public MovingEllipse(){
        super();
    }
    public MovingEllipse(int x, int y, int width, int height, int mw, int mh, Color bc, Color fc, int pathType){
        super(x, y, width, height, mw, mh, bc, fc, pathType);
    }
    public MovingEllipse(int length){
        super();
        this.setWidth(length);
        this.setHeight(length);
    }
    public void draw(Graphics g){
		Graphics2D shape = (Graphics2D) g;
		shape.setColor(fillColor);
        shape.fillOval(this.x, this.y, this.width, this.height);
		shape.setColor(borderColor);
		shape.drawOval(this.x, this.y, this.width, this.height);
		drawHandles(shape);
    }
    public double getArea(){
        return width/2.0 * height/2.0 * Math.PI; //ellipse area = a * b * PI
    }
    public boolean contains(Point mousePt){ //extracted from assignment handout
        double dx, dy;
        Point EndPt = new Point(x + width, y + height); 
        dx = (2 * mousePt.x - x - EndPt.x) / (double) width; 
        dy = (2 * mousePt.y - y - EndPt.y) / (double) height;
        return dx * dx + dy * dy < 1.0;
    }
}