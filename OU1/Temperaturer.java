import java.util.*;

class Temperaturer{

	public static void main(String[] args){
		System.out.println ("TEMPERATURER\n");

		//input
		Scanner in = new Scanner (System.in);
		in.useLocale (Locale.US);

		//input week and measure
		System.out.print ("Antalet veckor: ");
		int amountWeeks = in.nextInt ();
		System.out.println ("Antalet mätningar per vecka: ");
		int measuresPerWeek = in.nextInt ();

		//store temperature
		double[][] t = new double[amountWeeks + 1][measuresPerWeek + 1];

		//input temperature
		for (int week = 1; week <= amountWeeks; week++){
			System.out.println ("Temperaturer - vecka " + week + ":");
			for (int measure = 1; measure <= measuresPerWeek; measure++){
				t[week][measure] = in.nextDouble ();
			}
		}
		System.out.println ();

		//display temperatures
		System.out.println ("Temperaturerna: ");
		for (int week = 1; week <= amountWeeks; week++){
			for (int measure = 1; measure <= measuresPerWeek; measure++){
				System.out.print (t[week][measure] + " ");
				System.out.println ();
			}
		}
		System.out.println ();

		//min and max averagetemp, per week
		double[] minT = new double[amountWeeks +1];
		double[] maxT = new double[amountWeeks +1];
		double[] sumT = new double[amountWeeks +1];
		double[] averageT = new double[amountWeeks + 1];

		//Min and max temp
		for (int week = 1; week <= amountWeeks; week++){

			//assign value from column 1 as minT
			minT[week] = t[week][1];
			maxT[week] = t[week][0];

			//Start in column 1, we will compare the values
			for (int measure = 1; measure <= measuresPerWeek; measure++){

				//Min
				if (minT[week] > t[week][measure]){
					minT[week] = t[week][measure];
				}

				//Max
				if (maxT[week] < t[week][measure]){
				    maxT[week] = t[week][measure];
				}

			    //Total sum per week
			   sumT[week] += t[week][measure];
			}
		   //Calculate average
		   averageT[week] = sumT[week] / measuresPerWeek;
		}


		//Display the values for min, max and average each week
		for (int week = 1; week <= amountWeeks; week++){
			System.out.println ("Minsta temperaturen - vecka " + week + ": " + minT[week]);
			System.out.println ("Högsta temperaturen - vecka " + week + ": " + maxT[week]);
			System.out.println ("Medeltemperaturen - vecka " + week + ": " + averageT[week]);
		}
		System.out.println ();


		//min and max averagetemp, whole period
		double minTemp = minT[1];
		double maxTemp = maxT[1];
		double sumTemp =sumT[1];
		double averageTemp = 0;

		for (int week = 2; week <= amountWeeks; week++){
			//Min
			if (minTemp > minT[week]){
				minTemp = minT[week];
			}
			//Max
			if (maxTemp < maxT[week]){
				maxTemp = maxT[week];
			}

			//Sum for whole period
			sumTemp += sumT[week];

		}

		//Average temperatur for the whole period
		averageTemp = sumTemp / (measuresPerWeek * amountWeeks);

		System.out.println ("Den minsta temperaturen för hela perioden: " + minTemp);
		System.out.println ("Den högsta temperaturen för hela perioden: " + maxTemp);
		//System.out.println (sumTemp);
		System.out.println ("Medelvärdet för hela perioden: " + averageTemp);
	}
}