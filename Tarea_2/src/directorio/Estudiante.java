package directorio;

public class Estudiante extends Persona {
	private int numero_semestre;
	private String carrera;
	private String numero_cuenta;
	private String[] materias = new String[5];
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
