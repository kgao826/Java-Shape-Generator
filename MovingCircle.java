//Kevin A Gao, kgao826, 360875515

import java.awt.*;

public class MovingCircle extends MovingEllipse{
    public MovingCircle(){
        super();
        super.setWidth(50);
    }
    public MovingCircle(int x, int y, int length, int mw, int mh, Color bc, Color fc, int pathType){
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