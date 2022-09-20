package directorio;

import java.util.Arrays;

public class Profesor extends Persona{
	private String num_profesor;
	private String tel_oficina;
	private String dep_escolar;
	private String[] grupos = {};
	private double salario;
	private String carrera;
	
	public Profesor(String celular, String fecha_cumpleaños, String correo_electronico, String nombre_completo,
			String num_profesor, String tel_oficina, String dep_escolar, String[] grupos, double salario,
			String carrera) {
		super(celular, fecha_cumpleaños, correo_electronico, nombre_completo);
		this.num_profesor = num_profesor;
		this.tel_oficina = tel_oficina;
		this.dep_escolar = dep_escolar;
		this.grupos = grupos;
		this.salario = salario;
		this.carrera = carrera;
	}
	@Override
	public String toString() {
		return "Profesor \nNumero de profesor: " + num_profesor + "\nTelefono Oficina: " + tel_oficina + "\nDepartamento escolar: "
				+ dep_escolar + "\nGrupos que imparte: " + Arrays.toString(grupos) + "\nSalario: " + salario + "\nCarrera a la que imparte materias: " + carrera
				+ "\nCelular: " + getCelular() + "\nFecha de Cumpleaños: " + getFecha_cumpleaños()
				+ "\nCorreo electrónico: " + getCorreo_electronico() + "\nNombre completo: "
				+ getNombre_completo();
	}
	public String getNum_profesor() {
		return num_profesor;
	}
	public String getTel_oficina() {
		return tel_oficina;
	}
	public String getDep_escolar() {
		return dep_escolar;
	}
	public String[] getGrupos() {
		return grupos;
	}
	public double getSalario() {
		return salario;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setNum_profesor(String num_profesor) {
		this.num_profesor = num_profesor;
	}
	public void setTel_oficina(String tel_oficina) {
		this.tel_oficina = tel_oficina;
	}
	public void setDep_escolar(String dep_escolar) {
		this.dep_escolar = dep_escolar;
	}
	
	public void setGrupos(String[] grupos) {
		this.grupos = grupos;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
