
public class GameOfLife {
	
	private int[][] lifeGrid;

public GameOfLife(int n){
	// den skal tage v�rdien n til at lave griddet.
	// Den tegner s� starten
	lifeGrid = lifeGrid[n][n];
}



public GameOfLife(int[][] initialState){
	// den skal tage st�rrelsen af int[][] og bruge til at lave griddet
}



public int[][] getLifeGrid() {
	return lifeGrid;
}



public void setLifeGrid(int[][] lifeGrid) {
	this.lifeGrid = lifeGrid;
}



public void nextState(){
	// n�r denne kaldes beregner den n�ste statie og n�r dette er gjort vises det
	
	// lige inden den viser den n�ste state skal den bruge clear funktionen.

}


private int liveNeighbours(int x, int y){
	// den tager v�rdien i x,y fra arrye og kigger hele vejen rundt om den
	// hvor mange som er 1.
	// dette tal retunerer den.
	
	
}

}