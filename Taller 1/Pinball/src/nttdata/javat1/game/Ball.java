package nttdata.javat1.game;

public class Ball {
	private int x;
	private int y;

	/**
	 * Constructor
	 */
	
	public Ball() {
		this.x = (int) (Math.random() * 30);
		this.y = (int) (Math.random() * 30);
	}

	/**
	 * Method to know x
	 *
	 * @return int - x
	 */

	public int getX() {
		return this.x;
	}

	/**
	 * Method to know y
	 *
	 * @return int - y
	 */

	public int getY() {
		return this.y;
	}

	/**
	 * Method to change x
	 * 
	 * @param n
	 */

	public void setX(int n) {
		this.x = n;
	}

	/**
	 * Method to change y
	 * 
	 * @param n
	 */

	public void setY(int n) {
		this.y = n;
	}
}
