package nttdata.javat1.game;

public class Map {
	String[][] mapa = new String[30][30];

	/**
	 * Constructor
	 */
	public Map() {
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 30; j++) {
				int variable = (int) (Math.random() * 30);
				switch (variable) {
				case 0:
					mapa[i][j] = "P";
					break;
				case 1, 2, 3:
					mapa[i][j] = "O";
					break;
				case 4, 5, 6:
					mapa[i][j] = "A";
					break;
				case 7:
					mapa[i][j] = "B";
					break;
				default:
					mapa[i][j] = " ";
				}
			}
		}
	}

	/**
	 * Method to know what character is on that site
	 * 
	 * @param n1 ,n2
	 * @return String - Character
	 */

	public String getMap(int n1, int n2) {
		String result;
		result = this.mapa[n1][n2];
		return result;
	}
}
