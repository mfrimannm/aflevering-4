
public class GameOfLife {
	
	private int[][] lifeGrid;

public GameOfLife(int n){
	// den skal tage værdien n til at lave griddet.
	// Den tegner så starten
	lifeGrid = lifeGrid[n][n];
}



public GameOfLife(int[][] initialState){
	// den skal tage størrelsen af int[][] og bruge til at lave griddet
}



public int[][] getLifeGrid() {
	return lifeGrid;
}



public void setLifeGrid(int[][] lifeGrid) {
	this.lifeGrid = lifeGrid;
}



public void nextState(){
	// når denne kaldes beregner den næste statie og når dette er gjort vises det
	
	// lige inden den viser den næste state skal den bruge clear funktionen.

}


private int liveNeighbours(int x, int y){
	// den tager værdien i x,y fra arrye og kigger hele vejen rundt om den
	// hvor mange som er 1.
	// dette tal retunerer den.
	
	
}

}