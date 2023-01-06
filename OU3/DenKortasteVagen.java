
// DenKortasteVagen.java


/*************************************************************************************

	This class will have methods which we will use in BestamDenKortasteVagen.java
	to calculate the amount of staging points and the shortest path.

*************************************************************************************/

class DenKortasteVagen{

	/**
	 * Determines the staging points in zone 2 and 3
	 * @param a vector which holds the value for distances from zone 1 to zone 2
	 * @param b vector which holds the value for distances from zone 2 to zone 3
 	 * @param c vector which holds the value for distances from zone 3 to zone 4
	 * @return vector with the amount of staging points on the shortest path
	 */
	public static int[] stagingPoints (double[] a, double[][] b, double[] c){

		// Assign first value as the shortest path for our comparison
		double shortestPath = a[1] + b[1][1] + c[1];
		int[] amountOfStagingPoints = new int[3];
		amountOfStagingPoints[1] = 1;
		amountOfStagingPoints[2] = 1;

		for(int i = 1; i < a.length - 1; i++){
			for(int j = 1; j < c.length - 1; j++){
				double path = a[i] + b[i][j] + c[j];

				if (shortestPath > path){
					shortestPath = path;

					amountOfStagingPoints[1] = i;
					amountOfStagingPoints[2] = j;
				}
			}
		}
		return amountOfStagingPoints;
	}

	/**
	 * Calculates the shortest path with use of stagingPoints
	 * @param a vector which holds the value for distances from zone 1 to zone 2
	 * @param b vector which holds the value for distances from zone 2 to zone 3
 	 * @param c vector which holds the value for distances zone 3 to zone 4
	 * @return shortest path between the stations
	 */
	public static double length (double[] a, double[][] b, double[] c){

		// Assign the values from stagingPoints to coordinates
		int coordinates[] = stagingPoints(a, b, c);

		// Use the values from stagingPoints and put the points in the array to get the length
		double shortestPath = a[coordinates[1]] + b[coordinates[1]][coordinates[2]]
		                                                        + c[coordinates[2]];
		return shortestPath;
	}
}