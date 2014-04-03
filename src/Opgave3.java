import java.util.Arrays;
import java.util.Scanner;

public class Opgave3 {

	public static void main(String[] args) {
		// Game of life main
		Scanner scan = new Scanner(System.in);
		System.out.println("Hvor grid skal der simulueres");
		int grid = getNumberPositive(scan);
		GameOfLife life = new GameOfLife(grid);
		
		System.out.println(Arrays.deepToString(life.getLIFEGRID()));
		
		System.out.println("Hvor mange generationer skal der simulueres");
		int generations = getNumberPositive(scan);
		for(int i=0;i<generations;i++){
			life.nextState();
		}
	}

	private static int getNumberPositive(Scanner scan) {
		int num = 0;
		while (true) {
			while (!scan.hasNextInt()) {
				scan.nextLine();
				System.out
						.println("Du skal indtaste et positivt heltal (maks. 2^31-1)");
			}
			num = scan.nextInt();
			scan.nextLine(); // S� den kun tager en v�rdi fra consolen af
								// gangen og ikke bare gemmen resten til n�ste
								// omgang
			if (num >= 0) {
				break;
			} else {
				System.out
						.println("Du skal indtaste et positivt heltal (maks. 2^31-1)");
			}
		}
		return num;
	}

}