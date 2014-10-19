package algebra;

import java.math.BigInteger;

public class Fraction {
	int numerator;
	int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		gcd();
	}

	public Fraction(int number) {
		numerator = number;
		denominator = 1;
	}

	public void gcd() {
		BigInteger b1 = new BigInteger("" + numerator); // there's a better way
														// to do this. I forget.
		BigInteger b2 = new BigInteger("" + denominator);
		BigInteger gcd = b1.gcd(b2);
		if (gcd.intValue() == 0)
			return;
		numerator /= gcd.intValue();
		denominator /= gcd.intValue();
	}

	public Fraction add(Fraction f) {

		int a = numerator * f.denominator;
		int b = f.numerator * denominator;

		int n = a + b;
		int d = denominator * f.denominator;

		return new Fraction(n, d);
	}

	public Fraction sub(Fraction f) {

		int a = numerator * f.denominator;
		int b = f.numerator * denominator;

		int n = a - b;
		int d = denominator * f.denominator;

		return new Fraction(n, d);
	}

	public Fraction mul(Fraction f) {

		int n = numerator * f.numerator;
		int d = denominator * f.denominator;

		return new Fraction(n, d);
	}
	
	public Fraction div(Fraction f) {
		int n = numerator * f.denominator;
		int d = denominator * f.numerator;
		
		return new Fraction(n,d);
	}

	@Override
	public String toString() {
		if (denominator == 0)
			return "nan";
		if (denominator == 1)
			return "" + numerator;
		if (numerator == 0)
			return "0";
		return numerator + "/" + denominator;
	}
}
