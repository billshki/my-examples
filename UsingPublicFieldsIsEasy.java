//UIUC CS125 FALL 2013 MP. File: UsingPublicFieldsIsEasy.java, CS125 Project: Challenge5-DataStructures, Version: 2013-10-14T15:57:58-0500.653928462
//@author schmnsk2
/**
 * Complete the class method 'analyze' that takes a SimplePublicPair object as
 * an argument and returns a new SimplePublicTriple object. The
 * SimplePublicTriple needs to set up as follows: x = the minimum value of 'a'
 * and 'b' y = the maximum value of 'a' and 'b' description:a*b=M where a,b, and
 * M are replaced with the numerical values of a, b and the multiplication of a
 * and b. Your code will create a SimplePublicTriple, initializes the three
 * fields and return a reference to the SimplePublicTriple object.
 * 
 */
public class UsingPublicFieldsIsEasy {
	static int x = 0, y = 0, m = 0;

	public static SimplePublicTriple analyze(SimplePublicPair in) {
		SimplePublicTriple simple = new SimplePublicTriple();
		if (in.a > in.b) {
			simple.x = in.b;
			simple.y = in.a;
		}
		if (in.b > in.a) {
			simple.x = in.a;
			simple.y = in.b;
		}
		m = simple.x * simple.y;
		simple.description = in.a + "*" + in.b + "=" + m;
		return simple;
	}
}
