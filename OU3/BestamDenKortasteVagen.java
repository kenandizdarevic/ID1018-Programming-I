
// BestamDenKortasteVagen.java

/***************************************************************************************

	This class will use the methods from DenKortasteVagen.java to let the user
	determine the shortest path between the zones and calculate the of staging points.

****************************************************************************************/

import java.util.*; //Scanner

class BestamDenKortasteVagen{

	/**
	 * Calculates the shortest path and which zones are in the path
	 *
	 * @param args command-line arguments
	 */
	public static void main(String[] args){

		// Input tool
	/*	Scanner in = new Scanner(System.in);

		// User input, amount of stations
		System.out.println("Hur manga stationer finns i Z2?\n");
		int Z2 = in.nextInt();

		System.out.println("Hur manga stationer finns i Z3?\n");
		int Z3 = in.nextInt();

		/* Arrays that save the input for the zones, add 1 so
		that the index starts from 1
		double[] a = new double[Z2 + 1];
		double[][] b = new double[Z2 + 1][Z3 + 1];
		double[] c = new double[Z3 + 1];

		// Input the distance between Z1 and Z2
		for(int i = 1; i <= Z2; i++){
			System.out.println("Langden mellan stationer Z1 och Z2, station " + i);
			a[i] = in.nextDouble();
		}

		// Assign values
		for(int i = 1; i <= Z2; i++){
			for(int j = 1; j <= Z3; j++){
			System.out.println("Langden mellan stationer Z2 station " + i
								+ " och Z3 station " + j);
				b[i][j] = in.nextDouble();
			}
		}
		for(int i = 1; i <= Z3; i++){
			System.out.println("Langden mellan stationer Z3 och Z4, station " + i);
			c[i] = in.nextDouble();

		}
		*/

		// Values for the arrays
		double[] a = {0, 4, 6, 1};
		double b[][] = {{0, 0, 0, 0}, {0, 4, 2, 3, 1}, {0, 8, 11, 2, 1},
		                                               {0, 6, 3, 7, 1}};
		double c[] = {0, 4, 5, 5, 1};

		// Call the metods from DenKortasteVagen.java and assign them
		double shortestPath = DenKortasteVagen.length(a, b, c);
		int[] stagingPoints = DenKortasteVagen.stagingPoints(a, b, c);

		// Print out the shortest path and the staging points
		System.out.println("Den kortaste vagen ar: " + shortestPath + " km.");
		System.out.println("Mellanstationerna ar Z2's station " + stagingPoints[1]
							+ " och Z3's station " + stagingPoints[2]);
	}

}