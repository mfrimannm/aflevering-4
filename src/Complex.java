
public class Complex {

	private double re;
	private double im;
	
	
	public Complex() {
		this(0,0);
	}

	public Complex(double re, double im) {
		setValues(re,im);
	}
	
	public Complex(Complex other){
		setValues(other.re,other.im);
	}
	
	public void setValues(double re, double im){
		this.re = re;
		this.im = im;
	}
	
	public double getRe(){
		return re;
	}
	
	public double getIm(){
		return im;
	}
	
	
	public double abs(){
		return Math.sqrt((Math.pow(re, 2))+(Math.pow(im,2)));
	}
	
	
	public Complex plus(Complex other){
		double tempRe = ((this.re+other.re));
		double tempIm = ((this.im+other.im));
		double cleanRe = clean(tempRe);
		double cleanIm = clean(tempIm);
		Complex z = new Complex(cleanRe,cleanIm);
		return z;
	}
	
	
	public Complex times(Complex other){
		double tempRe = ((this.re*other.re-this.im*other.im));
		double tempIm = ((this.im*other.re+this.re*other.im));
		double cleanRe = clean(tempRe);
		double cleanIm = clean(tempIm);
		
		Complex z = new Complex(cleanRe,cleanIm);
		return z;
	}
	
	private double clean(double tempNum) {
		tempNum = Math.round(tempNum*10000000000.0)/10000000000.0;
		return tempNum;
	}

	public String toString(){
		return re + " + i" + im;
	}
	
	
	
}
