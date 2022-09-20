package directorio;

import java.util.Arrays;

public class Estudiante extends Persona {
	private int numero_semestre;
	private String carrera;
	private String numero_cuenta;
	private String[] materias = {};
	public Estudiante(String celular, String fecha_cumpleaños, String correo_electronico, String nombre_completo,
			int num_semestre, String carrera, String num_cuenta, String[] materias) {
		super(celular, fecha_cumpleaños, correo_electronico, nombre_completo);
		this.numero_semestre=num_semestre;
		this.carrera=carrera;
		this.numero_cuenta=num_cuenta;
		this.materias= materias;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Estudiante \nNumero de semestre: " + numero_semestre + " \nCarrera:" + carrera + "\nNumero de cuenta:"
				+ numero_cuenta + "\n Materias: " + Arrays.toString(materias) + "\nCelular: " + getCelular()
				+ "\nFecha de Cumpleaños: " + getFecha_cumpleaños() + "\nCorreo electrónico: "
				+ getCorreo_electronico() + "Nombre completo: " + getNombre_completo();
	}
	public int getNumero_semestre() {
		return numero_semestre;
	}
	public String getCarrera() {
		return carrera;
	}
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	public String[] getMaterias() {
		return materias;
	}
	public void setNumero_semestre(int numero_semestre) {
		this.numero_semestre = numero_semestre;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	public void setMaterias(String[] materias) {
		this.materias = materias;
	}

}
