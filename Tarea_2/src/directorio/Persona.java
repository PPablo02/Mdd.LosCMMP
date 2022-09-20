package directorio;

public class Persona {
	private String celular;
	private String fecha_cumpleaños;
	private String correo_electronico;
	private String nombre_completo;
	
	public Persona(String celular, String fecha_cumpleaños, String correo_electronico, String nombre_completo) {
		this.celular = celular;
		this.fecha_cumpleaños = fecha_cumpleaños;
		this.correo_electronico = correo_electronico;
		this.nombre_completo = nombre_completo;
	}
	public String getCelular() {
		return celular;
	}
	public String getFecha_cumpleaños() {
		return fecha_cumpleaños;
	}
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	public String getNombre_completo() {
		return nombre_completo;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public void setFecha_cumpleaños(String fecha_cumpleaños) {
		this.fecha_cumpleaños = fecha_cumpleaños;
	}
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}
	
}
