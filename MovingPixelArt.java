//Kevin A Gao, kgao826, 360875515
import java.awt.*;

public class MovingPixelArt extends MovingSquare{
	private String[] values = {"1111111111", "1111551111", "1111551111", "1115555111", "1115555111", "1155555511", "1555555551", "1111881111", "1111881111", "1111111111"};
	private Color[] colours = {Color.black, Color.white, Color.red, Color.orange, Color.yellow, Color.green, Color.cyan, Color.blue, Color.gray, Color.DARK_GRAY}; 
	public MovingPixelArt(){
        super();
    }
    public MovingPixelArt(int x, int y, int length, int mw, int mh, Color bc, Color fc, int pathType){
        super(x, y, length, mw, mh, bc, fc, pathType);
    }
	public void draw(Graphics g){
		Graphics2D shape = (Graphics2D) g;
		int number;
		int step = this.width / 10; //since each line is 10 pixels, this moves the square by 1/10
		int pixelX = this.x;
		int pixelY = this.y;
		for(String value: values){
			for(int i = 0; i < value.length(); i++){ //Goes through each number per line
				number = Integer.parseInt("" + value.charAt(i));
				shape.setColor(colours[number]);
				shape.fillRect(pixelX, pixelY, this.width / 10, this.height / 10); //each pixel is 1/10 of the size of the square
				pixelX += step;
			}
			pixelY += step;
			pixelX = this.x;
		}
		drawHandles(shape);
	}
}