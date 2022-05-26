package nttdata.javat1.game;

public class Score {
	private int score = 0;

	/**
	 * Constructor
	 */

	public Score(Ball ball1) {

	}

	/**
	 * Method to know the score
	 * 
	 * @return String - Score
	 */

	public String getScore() {
		String getscore = "" + this.score;
		return getscore;
	}

	/**
	 * Method to reset score
	 */

	public void resetScore() {
		this.score = 0;
	}

	/**
	 * Method to update score
	 * 
	 * @param n
	 */

	public void updateScore(int n) {
		this.score += n;
	}
}
