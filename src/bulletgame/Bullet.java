package bulletgame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Bullet implements Entity{
	private static final float BULLET_SIZE = 5;
	private float x;
	private float y;
	private Image image;
	
	public Bullet(float x, float y) throws SlickException{
		this.setXY(x,y);
		//image = new Image("res/bullet.png");
	}
	
	@Override
	public void render(Graphics g){
		g.fillOval(getX(), getY(), BULLET_SIZE, BULLET_SIZE);
	}
	
	@Override
	public void update(int delta){
		y += 10;
	}
	
	public float getX(){
		return x;
	}
	
	public float getY(){
		return y;
	}
	
	protected void setXY(float x, float y){
		this.x = x;
		this.y = y;
	}
}
