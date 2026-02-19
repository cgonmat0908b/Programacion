package ej3;

import java.time.LocalDate;

public class Profesor extends Personal {

	// Constantes estaticas de clase
	public static final String TITULACIO_DEF = "Desconocida";
	public static final String ASIG1_DEF = "Desconocida";
	public static final String ASIG2_DEF = "Desconocida";
	public static final boolean TUTOR_DEF = false;
	public static final byte ANYOS_EXPERIENCIA_DEF = 0;
	
	
	
	private String titulacion;
	private String asig1;
	private String asig2;
	private boolean tutor;
	private byte anyosExperiencia;
	

	public Profesor(String dni,String nombre,String apellidos,LocalDate fechaNacim,String genero,
			double salario,String telefono,String email,String titulacion,String asig1,String asig2,
			boolean tutor,byte anyosExperiencia) {
		
		super(dni,nombre,apellidos,fechaNacim,genero,salario,telefono,email);
		
		this.titulacion = titulacion;
		this.asig1 = asig1;
		this.asig2 = asig2;
		this.tutor = tutor;
		this.anyosExperiencia = anyosExperiencia;
		
	}
	

	public Profesor() {
		this(Personal.DNI_DEF, Personal.NOMBRE_DEF, Personal.APELLIDOS_DEF, Personal.FECHA_NACIM_DEF, Personal.GENERO_DEF, 1500.00, Personal.TELEFONO_DEF, Personal.EMAIL_DEF,
				Profesor.TITULACIO_DEF,Profesor.ASIG1_DEF,Profesor.ASIG2_DEF,Profesor.TUTOR_DEF, Profesor.ANYOS_EXPERIENCIA_DEF);
		
	}
	
	
	
	@Override
	public String toString(){
		String cadena = super.toString();
		return String.format("%s Titulacion: %s Asignatura1: %s, Asignatura2: %s, Es tutor?: %b Años de experiencia: %s", cadena, this.titulacion, this.asig1, this.asig2,this.tutor,this.anyosExperiencia);
	}
	
	// Aumento de salario segun los años de experiencia
	

	public void aumentoSalario() {
		
		double porcentaje = 1;
		
		if(this.anyosExperiencia >= 5) {
			porcentaje = 1.05;
			
		}else if(this.anyosExperiencia >= 3) {
			porcentaje = 1.03;
			
		}else if(this.anyosExperiencia >= 1){
			porcentaje = 1.01;
		}

		this.salario = this.salario * porcentaje;
		
	}
	
}
