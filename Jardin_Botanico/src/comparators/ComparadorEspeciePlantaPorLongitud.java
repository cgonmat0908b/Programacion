package comparators;

import java.util.Comparator;

public class ComparadorEspeciePlantaPorLongitud implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String objeto1 = o1.toString();
		String objeto2 = o2.toString();
		
		int comparacion = 0;
		
		if(objeto1.length() == objeto2.length()) {
			comparacion = 0;
		}else if(objeto1.length() > objeto2.length()) {
			comparacion = -1;
		}else {
			comparacion = 1;
		}
		
		return comparacion;
	}

}
