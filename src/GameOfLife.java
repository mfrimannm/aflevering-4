public class GameOfLife {

	private int[][] LIFEGRID;
	private int SIZE;
	private int GENERATION;

	public GameOfLife(int n) {
		// den skal tage værdien n til at lave griddet.
		// Den tegner så starten
		setLIFEGRID(new int[n][n]);
		SIZE = n;
		GENERATION = 0;

		// random life
		for (int i = 0; i < getLIFEGRID().length; i++) {
			for (int j = 0; j < getLIFEGRID().length; j++) {
				getLIFEGRID()[i][j] = (int) (Math.random() * 2);
			}
		}
		drawLife();
	}

	public GameOfLife(int[][] initialState) {
		// den skal tage størrelsen af int[][] og bruge til at lave griddet
		SIZE = initialState.length;
		setLIFEGRID(initialState);
		GENERATION = 0;
		drawLife();
	}

	public int[][] getLIFEGRID() {
		return LIFEGRID;
	}

	public int getLIFEGRIDAt(int x, int y) {
		return LIFEGRID[x][y];
	}

	public void setLIFEGRID(int[][] lifeGrid) {
		LIFEGRID = lifeGrid;
	}

	public void nextState() {
		// når denne kaldes beregner den næste statie og når dette er gjort
		// vises det
		int[][] LifeGrid_next = new int[SIZE][SIZE];

		for (int i = 0; i < getLIFEGRID().length; i++) {
			for (int j = 0; j < getLIFEGRID().length; j++) {
				if ((getLIFEGRIDAt(i, j) == 0 && liveNeighbours(i, i) == 3)
						|| (getLIFEGRIDAt(i, j)) == 1
						&& (liveNeighbours(i, j) > 2 && !(liveNeighbours(i, j) > 3))) {
					LifeGrid_next[i][j] = 1;
				} else {
					LifeGrid_next[i][j] = 0;
				}
			}
		}
		GENERATION++;
		LIFEGRID = LifeGrid_next;
		drawLife();
	}

	private int liveNeighbours(int x, int y) {
		int countLife = 0;
		// den tager værdien i x,y fra arrye og kigger hele vejen rundt om den
		// hvor mange som er 1.
		// dette tal retunerer den.
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				if (i == 0 && j == 0) {

				} else {
					if ((x - i > 0 && y - j > 0)
							&& (x - i < LIFEGRID.length && y - j < LIFEGRID.length)) {
						if (getLIFEGRIDAt(x - i, y - j) == 1) {
							countLife++;
						}
					}
				}
			}
		}

		return countLife;
	}

	private void drawLife() {
		StdDraw.clear();
		StdDraw.show(100);
		if (GENERATION == 0) {
			int min = 0;
			int max = SIZE;
			StdDraw.setXscale(min, max);
			StdDraw.setYscale(min, max);
			StdDraw.setPenRadius(6.0 / 2000);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.square(0, 0, SIZE);
			
		}

		for (int i = 0; i < getLIFEGRID().length; i++) {
			for (int j = 0; j < getLIFEGRID().length; j++) {
				if (getLIFEGRIDAt(i, j) == 0) {
					StdDraw.point(i, j);
				}
			}
		}
	}

}