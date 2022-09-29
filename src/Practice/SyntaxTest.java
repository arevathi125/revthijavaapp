package Practice;

public class SyntaxTest {

	public static void main(String[] args) {
		// using all operators
		String fn = "REVATHI";
		String ln = "ANBAZHAGAN";
		String fullname = fn + " " + ln;
		int a = 20, b = 30, c = 40, d = 50, e;
		long h = 111111L;
		float A = 200.50f, B = 300.50f, C = 400.50f, D = 500.50f;
		double s = 110.10d, t = 220.20d, u = 330.30d;
		char n = 'O';
		int a1 = 20 + 10;
		int a2 = a1 + a;
		int a3 = a2 + 15;
		a = a3;
		b += 10;
		c = ++c;
		d = 80;
		e = 4;
		e = a + b + c;
		//e &= 3;
		System.out.println("WELCOME  " + fullname);
		System.out.println(fullname);
		System.out.println(fn + " " + ln);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e&=3);
		System.out.println(h);
		System.out.println(a + b + c + d);
		System.out.println(A > B);
		System.out.println(D != C);
		System.out.println(A == D);
		System.out.println(a < b && b > d);
		System.out.println("GRADE IS " + n);
		System.out.println(s + t - u);
	}

}
