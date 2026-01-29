package ejercicio4;

public class ArticuloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String macetaS = "Maceta";
		Articulo maceta = new Articulo(macetaS,15,CalculoPvp(15, Articulo.IVA),4);
		
		System.out.printf("El producto %s tiene un precio sin IVA de %f, con el IVA de %d%%, su precio es %f y quedan %d articulos %n", maceta.getNombre(),maceta.getPrecioSinIva(),Articulo.IVA, maceta.getPVP(),maceta.getCuantosQuedan());
		
		maceta.setPrecioSinIva(27.54f);
		maceta.setPVP(CalculoPvp(maceta.getPrecioSinIva(), Articulo.IVA));
		System.out.printf("El producto %s tiene un precio sin IVA de %f, con el IVA de %d%%, su precio es %f y quedan %d articulos %n", maceta.getNombre(),maceta.getPrecioSinIva(),Articulo.IVA, maceta.getPVP(),maceta.getCuantosQuedan());
		
		// Articulo con precio invalido
		
		Articulo piano;
		String pianoA = "Piano";
		
		try {
			piano = new Articulo(pianoA,-25, CalculoPvp(-25, Articulo.IVA), 5);
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			piano = new Articulo(pianoA,1,CalculoPvp(1, Articulo.IVA),1);
		}
		System.out.printf("El producto %s tiene un precio sin IVA de %f, con el IVA de %d%%, su precio es %f y quedan %d articulos %n ",piano.getNombre(),piano.getPrecioSinIva(),Articulo.IVA, piano.getPVP(),piano.getCuantosQuedan());
	}

	public static float CalculoPvp(float precio, final int IVA) {
		float precioPvp = precio +  ((precio * IVA) / 100);
		return precioPvp;
	}
}
