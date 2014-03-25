
public class Opgave1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex z0 = new Complex();
		Complex z1 = new Complex(1,2);
		Complex z11 = new Complex(1,1);
		Complex z2 = new Complex(4.3,5.2);
//		
//		System.out.println(z0.toString());
//		System.out.println(z1.toString());
//		System.out.println(z11.toString());
//		System.out.println(z2.toString());
//		
//		
//		System.out.println(z1.abs());
//		System.out.println(z11.abs());
		System.out.println(z2.times(z1));
		Complex z = (z2.plus(z1));
		System.out.println(z);
		System.out.println(z2.plus(z1).getRe());
		System.out.println(z2.plus(z1).getIm());
		System.out.println(z2.plus(z1).getRe());
		System.out.println(z2.plus(z1).getIm());
		System.out.println(z2.plus(z1).getRe());
		System.out.println(z2.plus(z1).getIm());
//		System.out.println(z2.getRe());
//		System.out.println(z2.getIm());
		
	}

}