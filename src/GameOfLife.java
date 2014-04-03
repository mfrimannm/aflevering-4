public class GameOfLife {
	
	private int[][] LIFEGRID;
	private int SIZE;

public GameOfLife(int n){
	// den skal tage v�rdien n til at lave griddet.
	// Den tegner s� starten
	setLIFEGRID(new int[n][n]);
	SIZE = n;
	
	// random life
	for(int i=0;i<getLIFEGRID().length;i++){
		for(int j=0;j<getLIFEGRID().length;j++){
			getLIFEGRID()[i][j] = (int) (Math.random()*2);
		}
	}
}

public GameOfLife(int[][] initialState){
	// den skal tage st�rrelsen af int[][] og bruge til at lave griddet
	SIZE = initialState.length;
	setLIFEGRID(initialState);
}

public int[][] getLIFEGRID() {
	return LIFEGRID;
}

public void setLIFEGRID(int[][] lIFEGRID) {
	LIFEGRID = lIFEGRID;
}

public void nextState(){
	// n�r denne kaldes beregner den n�ste statie og n�r dette er gjort vises det
	
	// lige inden den viser den n�ste state skal den bruge clear funktionen.
	
}


private void liveNeighbours(int x, int y){
	// den tager v�rdien i x,y fra arrye og kigger hele vejen rundt om den
	// hvor mange som er 1.
	// dette tal retunerer den.
	
	
}

private void drawLife(){
	StdDraw.clear();
	StdDraw.show(0);
	
}

}