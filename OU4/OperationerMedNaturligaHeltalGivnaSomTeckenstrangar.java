
// OperationerMedNaturligaHeltalGivnaSomTeckenstrangar.java

/*************************************************************************************

	This class will execute different arithmetic operations with
	natural numbers given as strings.

*************************************************************************************/

import java.util.*; // Scanner
import static java.lang.System.out;

class OperationerMedNaturligaHeltalGivnaSomTeckenstrangar{
	public static void main (String[] args){
		out.println ("OPERATIONER MED NATURLIGA HELTATL GIVNA SOM TECKENSTRANGAR");

		// Input tool
		Scanner in = new Scanner (System.in);

		out.println("Tva naturliga heltal: ");
		String number1 = in.next();
		String number2 = in.next();
		out.println();

		String sum = add(number1, number2);
		show (number1, number2, sum, '+');

		// subtrahera heltalen och visa resultatet

		String dif = subtract(number1, number2);
		show (number1, number2, dif, '-');
	}

	public static String add (String number1, String number2){

		String largestNumber;
		String smallestNumber;

			// Sort the largest and smallest number
		if(number1.length() > number2.length()){
			largestNumber = number1;
			smallestNumber = number2;
		}
		else{
			smallestNumber = number1;
			largestNumber = number2;
		}
			// Add zeros to the smallest number
		for(int i = 0; i < (largestNumber.length() - smallestNumber.length()); i++){
			smallestNumber = "0" + smallestNumber;
		}

		String resultString = "";
		int carry = 0;
		int totalSum = 0;

		for(int i = largestNumber.length() - 1; i >= 0; i--){
			int num1 = largestNumber.charAt(i) - '0';
			int num2 = smallestNumber.charAt(i) - '0';

			int result = num1 + num2 + carry;

			if(result >= 10){
				result -= 10;
				carry = 1;
			}
			resultString = result + resultString;
		}
		if (carry != 0){
			resultString = carry + resultString;
		}
		return resultString;
	}

	public static String subtract (String number1, String number2){
	return number2;

	}

	public static void show (String number1, String number2, String result, char operator){
		int length1 = number1.length();
		int length2 = number2.length();
		int length = result.length();
		int maxLength = Math.max (Math.max (length1, length2), length);
		number1 = sattLength (number1, maxLength -length1);
		number2 = sattLength (number2, maxLength -length2);
		result = sattLength (result, maxLength - length);

		// Display the numbers and result
		out.println ("  " + number1);
		out.println ("" + operator + " " + number2);
			for (int i = 0; i < maxLength + 2; i++){
	    	out.print ("-");
		}
		out.println ();
        out.println ("  " + result + "\n");
	}

	public static String sattLength(String s, int amount){

		 StringBuilder sb = new StringBuilder (s);
		        for (int i = 0; i < amount; i++)
		            sb.insert (0, " ");

         return sb.toString ();
	}
}