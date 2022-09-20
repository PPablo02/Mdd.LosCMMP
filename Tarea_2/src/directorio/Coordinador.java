package directorio;

public class Coordinador extends Persona{
	private String num_empleado;
	private String tel_oficina;
	private String carrera;
	private double salario;
	private String dep_escolar;
	
	public Coordinador(String celular, String fecha_cumpleaños, String correo_electronico, String nombre_completo,
			String num_empleado, String tel_oficina, String carrera, double salario, String dep_escolar) {
		super(celular, fecha_cumpleaños, correo_electronico, nombre_completo);
		this.num_empleado = num_empleado;
		this.tel_oficina = tel_oficina;
		this.carrera = carrera;
		this.salario = salario;
		this.dep_escolar = dep_escolar;
	}
	@Override
	public String toString() {
		return "Coordinador \nNumero de empleado: " + num_empleado + "\nTelefono Oficina: " + tel_oficina + "\nCarrera que coordina: " + carrera
				+ "\nSalario: " + salario + "\nDepartamento escolar: " + dep_escolar + "\nCelular: " + getCelular()
				+ "\nFecha de cumpleaños: " + getFecha_cumpleaños() + "\nCorreo electrónico: "
				+ getCorreo_electronico() + "\nNombre completo: " + getNombre_completo();
	}
	public String getNum_empleado() {
		return num_empleado;
	}
	public String getTel_oficina() {
		return tel_oficina;
	}
	public String getCarrera() {
		return carrera;
	}
	public double getSalario() {
		return salario;
	}
	public String getDep_escolar() {
		return dep_escolar;
	}
	public void setNum_empleado(String num_empleado) {
		this.num_empleado = num_empleado;
	}
	public void setTel_oficina(String tel_oficina) {
		this.tel_oficina = tel_oficina;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public void setSalario(double sueldo) {
		this.salario = sueldo;
	}
	public void setDep_escolar(String dep_escolar) {
		this.dep_escolar = dep_escolar;
	}
	

}
