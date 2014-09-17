package bulletgame;

import java.util.LinkedList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class BulletGame extends BasicGame{

	public static final int GAME_WIDTH = 640;
	public static final int GAME_HEIGHT = 480;
	private LinkedList<Entity> entities;
	private Graphics g;
	private int delta;
	
	public BulletGame(String title) {
		super(title);
		entities = new LinkedList<Entity>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		for(Entity entity : entities){
			entity.render(arg1);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		entities.add(new Bullet(200,0));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		for(Entity entity : entities){
			entity.update(arg1);
		}
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args){
		 try {
			 BulletGame game = new BulletGame("Bullet Game");
		     AppGameContainer appgc = new AppGameContainer(game);
		     appgc.setDisplayMode(GAME_WIDTH, GAME_HEIGHT, false);
		     appgc.setTargetFrameRate(60);
		     appgc.start();
		 } catch (SlickException e) {
		     e.printStackTrace();
		   }
	}

}
