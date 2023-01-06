
class EU1{
	public static void main(String[] args){

	}
	)
	public static int min (int[] element) throws IllegalArgumentException{
		if (element.length == 0){
			throw new IllegalArgumentException ("Tom samling");

			int[] sekvens = element;
			int antaletPar = sekvens.length / 2;
			int antaletOparadeElement = sekvens.length % 2;
			int antaletTankbaraElement = antaletPar + antaletOparadeElement;
			int[] delsekvens = new int[antaletTankbaraElement];
			int i = 0;
			int j = 0;

			while (sekvens.length > i){

				i = 0;
				j = 0;

				while (j < antaletPar){
					delsekvens[j++] = sekvens[i] < sekvens[i + 1] ? sekvens[i] : sekvens[i + 1] ;
					i += 2;
				}
			}
		}
	}
}