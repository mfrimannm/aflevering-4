import java.util.Scanner;

public class Opgave2 {

	static int MAX = 255;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// få tre tal
		// først real værdien, eller hvad der svarer til x aksen
		System.out.println("skriv re værdi");
		double re = getNumber(scan);
		// derefter imærginær delen eller hvad der svarer til y aksen
		System.out.println("skriv im værdi");
		double im = getNumber(scan);

		// Complex z0 = new Complex(-0.5, 0);
//		System.out.println(z0.toString());
		// og til sidst side længden som beskriver området der ledes i eller
		// hvad side længden skal være.
		// denne bliver så en slags radius for en firkant, så den
		// halve lægnde læggges til og trækkes fra for at skabe
		// firkanten.
		System.out.println("skriv s værdi");
		double s = getNumberPositive(scan);

		// nu sættes så en grid size som bestemmer præsisionenen
		// denne bruges i denne formel
		// (x_0-s/2+s*j/g-1)+(y0-s/2+s*k/g-1)
		// hvor s er side længde j og k er rækker og sjøjer
		// og g er antal grid.
		System.out.println("skriv g for grid størrelse");
		double g = getNumberPositive(scan);
		// formlen bestemmer alle punkter som testes
		findTalSomBesregnesPaa(re, im, g, s);

		// Det er nu sådan at et punktet x+yi i griddet skal farvelægges hvis og
		// kun hvis metoden
		// iterate anvendt på x+yi returnerer konstanten MAX. Figur 4 viser et
		// simpelt eksempel
		// på griddet fra figur 3. Klassekonstanten MAX er her sat til 20.

		System.out.println("begin iterate");
	}

	private static void findTalSomBesregnesPaa(double re, double im, double g,
			double s) {
		double minGrid = (-s);
		double maxGrid = s;
		StdDraw.setXscale(minGrid, maxGrid);
		StdDraw.setYscale(minGrid, maxGrid);
		StdDraw.setPenRadius(30.0 / 800);
		StdDraw.show(0);
		
		// TODO Auto-generated method stub
		for (int i = 0; i < g; i++) {
			for (int j = 0; j < g; j++) {
				double tempRe = (re - (s / 2) + ((s * j) / (g - 1)));
				double tempIm = (im - (s / 2) + ((s * i) / (g - 1)));
				Complex z0 = new Complex(tempRe, tempIm);
				int max = iterate(z0);
				if (max == 20) {
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.point(tempRe, tempIm);
				} else {
					StdDraw.setPenColor(StdDraw.BLUE);
					StdDraw.point(tempRe, tempIm);
				}
			}
		}
		StdDraw.show(0);
	}

	public static int iterate(Complex z0) {
		Complex z = new Complex(z0);
		for (int i = 0; i < MAX; i++) {
			if (z.abs() > 2.0) {
				return i;
			}
			z = z.times(z).plus(z0);
		}
		return MAX;
	}

	private static double getNumber(Scanner scan) {
		double num = 0;
		while (!scan.hasNextDouble()) {
			scan.nextLine();
			System.out.println("Du skal intaste et tal");
		}
		num = scan.nextDouble();
		scan.nextLine();
		return num;
	}

	private static double getNumberPositive(Scanner scan) {
		double num = 0;
		while (true) {
			while (!scan.hasNextDouble()) {
				scan.nextLine();
				System.out
						.println("Du skal indtaste et positivt heltal");
			}
			num = scan.nextDouble();
			scan.nextLine(); // Så den kun tager en værdi fra consolen af
								// gangen og ikke bare gemmen resten til næste
								// omgang
			if (num >= 0) {
				break;
			} else {
				System.out.println("Du skal indtaste et positivt tal");
			}
		}
		return num;
	}

}
