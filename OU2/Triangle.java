
import java.lang.Math.*; //Math library

class Triangle{

	/**
	 * this method calculates the semiperemiter of the triangle
	 * @param a length of side a
	 * @param b length of side b
	 * @param c length of side c
	 * @return the semiperemiter of the triangle
	 */
	public static double semiperemiter(double a, double b, double c){
		double semi = (a + b + c) / 2;

		return semi;
	}

	/**
	 * this method calculates the area of the triangle
	 * @param a length of side a
	 * @param b length of side b
	 * @param c length of side c
	 * @return the area of the triangle
	 */
	public static double area(double a, double b, double c){

			//We use the method semiperemiter in this equation
		double area = Math.sqrt(semiperemiter(a, b, c) * (semiperemiter(a, b, c) - a) * (semiperemiter(a, b, c) - b)
		                                                                  * (semiperemiter(a, b, c) - c));
		return area;
	}

	/**
	 * this method calculates the bisector between side b and c
	 * @param b length of side b
	 * @param c length of side c
	 * @param alpha the angle between b and c
	 * @return bisector between side b and c
	 */
	public static double bisectorAlpha (double b, double c, double alpha){
		double p = 2 * b * c * Math.cos (alpha / 2);
		double bisAlpha = p / (b + c);

		return bisAlpha;
	}

	/**
	 * this method calculates the bisector between side a and c
	 * @param b length of side a
	 * @param c length of side c
	 * @param beta the angle between a and c
	 * @return bisector between side a and c
	 */
	public static double bisectorBeta (double a, double c, double beta){
			double p = 2 * a * c * Math.cos (beta / 2);
			double bisBeta = p / (a + c);

			return bisBeta;
	}

	/**
	 * this method calculates the bisector between side a and b
	 * @param b length of side a
	 * @param c length of side b
	 * @param alpha the angle between a and b
	 * @return bisector between side a and b
	 */
	public static double bisectorGamma (double a, double b, double gamma){
		double p = 2 * a * b * Math.cos (gamma / 2);
		double bisGamma = p / (a + b);

		return bisGamma;
	}

	/**
	 * this method calculates the rewritten circle of the triangle
	 * @param a length of side a
	 * @param b length of side b
	 * @param c length of side c
	 * @return radius of the rewritten circle
	 */
	public static double rewrittenCircle (double a, double b, double c){

			//We use the method semiperemiter to calculate the rewritten radius
		double radiusRewritten = (a * b * c) / ((4 * Math.sqrt(semiperemiter(a, b, c)*(semiperemiter(a, b, c) - a)
		                                          * (semiperemiter(a, b, c) - b) * (semiperemiter(a, b, c) - c))));

		return radiusRewritten;
	}

	/**
	 * this method calculates the inwritten circle in the triangle
	 * @param a length of side a
	 * @param b length of side b
	 * @param c length of side c
	 * @return radius of the inwritten circle
	 */
	public static double inwrittenCircle (double a, double b, double c){

			//we use the method semiperemiter to calculate the inwritten circle
		double radiusInwritten = Math.sqrt(((semiperemiter(a , b, c) - a) * (semiperemiter(a, b, c) - b)
		                                        * (semiperemiter(a, b, c) - c)) / semiperemiter(a, b, c));

		return radiusInwritten;
	}
}