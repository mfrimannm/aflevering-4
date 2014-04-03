public class GameOfLife {
	
	private int[][] LIFEGRID;
	private int SIZE;

public GameOfLife(int n){
	// den skal tage værdien n til at lave griddet.
	// Den tegner så starten
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
	// den skal tage størrelsen af int[][] og bruge til at lave griddet
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
	// når denne kaldes beregner den næste statie og når dette er gjort vises det
	
	// lige inden den viser den næste state skal den bruge clear funktionen.
	
}


private void liveNeighbours(int x, int y){
	// den tager værdien i x,y fra arrye og kigger hele vejen rundt om den
	// hvor mange som er 1.
	// dette tal retunerer den.
	
	
}

private void drawLife(){
	StdDraw.clear();
	StdDraw.show(0);
	
}

}