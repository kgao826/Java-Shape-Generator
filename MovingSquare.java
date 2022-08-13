//Kevin A Gao, kgao826, 360875515

import java.awt.*;

public class MovingSquare extends MovingRectangle{
    public MovingSquare(){
        super();
        super.setWidth(50);
    }
    public MovingSquare(int x, int y, int length, int mw, int mh, Color bc, Color fc, int pathType){
        super(x, y, length, length, mw, mh, bc, fc, pathType);
    }
    public void setHeight(int length){
        super.setWidth(length);
        super.setHeight(length);
    }
    public void setWidth(int length){
        super.setWidth(length);
        super.setHeight(length);
    }
}