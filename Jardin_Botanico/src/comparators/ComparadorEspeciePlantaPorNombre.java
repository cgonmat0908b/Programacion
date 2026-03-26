package comparators;

import java.util.Comparator;

public class ComparadorEspeciePlantaPorNombre implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String objeto1 = o1.toString();
		String objeto2 = o2.toString();
		
		return objeto1.compareTo(objeto2);
	}

}
