import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Opgave3 {

	public static void main(String[] args) throws FileNotFoundException {
		// Game of life main
		Scanner scan = new Scanner(System.in);
		// hvilke fil vil du have...
		File file = new File("pulsar.gol");
		Scanner in = new Scanner(file);
		int[][] initialState = lavArrayFromFile(in);
		GameOfLife life = new GameOfLife(initialState);

		// File f = new File("problem.dat");
		// s1 = readEntireFile(new Scanner(f));

//		System.out.println("Hvor grid skal der simulueres");
//		int grid = getNumberPositive(scan);
//		GameOfLife life = new GameOfLife(grid);

		System.out.println(Arrays.deepToString(life.getLIFEGRID()));

		System.out.println("Hvor mange generationer skal der simulueres");
		int generations = getNumberPositive(scan);
		for (int i = 0; i <= generations; i++) {
			life.nextState();
		}
		System.out.println("done");

		// til allerde sidst
		scan.close();
		// in.close();
	}

	private static int[][] lavArrayFromFile(Scanner in) {
		int n = 512;
		int[][] initialState = new int[n][n];
		while (in.hasNextLine()) {
			for (int i = 0; i <= 10; i++) {
				for (int j = 0; j <= 10; j++) {
					initialState[i][j] = in.nextInt();
				}
			}
		}
		// TODO Auto-generated method stub
		return initialState;
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
			scan.nextLine(); // Så den kun tager en værdi fra consolen af
								// gangen og ikke bare gemmen resten til næste
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
