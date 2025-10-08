
public class conversionTipos {

	public static void main(String[] args) {
		
		byte monederoPequenyo = 10;
		int monederoMediano = 32123;
		long monederoGrande = 10000000000000000l;
		
		//monederoGrande = monederoMediano;
		//monederoMediano = monederoPequenyo;
		
		monederoPequenyo = (byte) monederoMediano;//Cast
		System.out.println("Monedero pequeño: " + monederoPequenyo);
		System.out.println("Monedero mediano: " + monederoMediano);
		System.out.println("Monedero grande: " + monederoGrande);
	}

}
