public class Opgave1 {

	static int MAX = 20;
		
	public static void main(String[] args) {

		Complex z0 = new Complex(-0.5, 0);
		System.out.println(z0.toString());
		System.out.println("begin iterate");
		int max = iterate(z0);
		System.out.println("max " + max);
	}

	public static int iterate(Complex z0) {
		Complex z = new Complex(z0);
		System.out.println(z.toString());
		for (int i = 0; i < MAX; i++) {
			if (z.abs() > 2.0) {
				return i;
			}
			z = z.times(z).plus(z0);
		}
		return MAX;
	}
}