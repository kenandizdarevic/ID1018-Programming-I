import java.util.*; //Scanner, locale


class EnTriangelOchDessCirklar{

	//main method
	public static void main(String[] args){

		//Input tool
		Scanner in = new Scanner(System.in);

		//New object from my triangle class
		//Triangle myObject = new Triangle();

		//Gives the user information
		System.out.println ("Vänligen mata in längden på triangelns sidor!");

		//Input for the length of the sides
		System.out.println("A: ");
		double a = in.nextDouble();

		System.out.println("B: ");
		double b = in.nextDouble();

		System.out.println("C: ");
		double c = in.nextDouble();


		//Prints the result
		System.out.println ("Den omskrivna cirkeln har radien: " + Triangle.rewrittenCircle(a, b, c) + " l.e.");
		System.out.println ("Den inskrivna cirkeln har radien: " + Triangle.inwrittenCircle(a, b, c) + " l.e.");
	}
}