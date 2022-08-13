//Kevin A Gao, kgao826, 360875515

import java.awt.*;

public class MovingRectangle extends MovingShape{
    public MovingRectangle(){
        super();
    }
    public MovingRectangle(int length){
        super();
        this.setWidth(length);
        this.setHeight(length);
    }
	public MovingRectangle(int x, int y, int width, int height, int mw, int mh, Color bc, Color fc, int pathType) {
        super(x, y, width, height, mw, mh, bc, fc, pathType);
    }
    public void draw(Graphics g){
		Graphics2D shape = (Graphics2D) g;
        shape.setColor(fillColor);
        shape.fillRect(this.x, this.y, this.width, this.height);
		shape.setColor(borderColor);
		shape.drawRect(this.x, this.y, this.width, this.height);
		drawHandles(shape);
    }
    public double getArea(){
        return width * height;
    }
    public boolean contains(Point points){
        if(x < points.getX() && points.getX() < x + width && y < points.getY() && points.getY() < y + height){
            return true;
        } 
        return false;
    }
}