import algebra.Fraction;

public class Test {
	public static void main(String[] args) {
		Fraction a = new Fraction(10);
		Fraction b = new Fraction(5);
		Fraction c=  a.div(b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
