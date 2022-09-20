package directorio;

public class Persona {
	private String celular;
	private String fecha_cumpleaños;
	private String correo_electronico;
	private String nombre_completo;
	
	/**
	 * Constructor de la clase persona.
	 * @param celular
	 * @param fecha_cumpleaños
	 * @param correo_electronico
	 * @param nombre_completo
	 */
	public Persona(String celular, String fecha_cumpleaños, String correo_electronico, String nombre_completo) {
		this.celular = celular;
		this.fecha_cumpleaños = fecha_cumpleaños;
		this.correo_electronico = correo_electronico;
		this.nombre_completo = nombre_completo;
	}
	/**
	 * 
	 * @return el celular del contacto
	 */
	public String getCelular() {
		return celular;
	}
	/**
	 * 
	 * @return fecha de cumpleaños del contacto
	 */
	public String getFecha_cumpleaños() {
		return fecha_cumpleaños;
	}
	/**
	 * 
	 * @return correo del contacto
	 */
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	/**
	 * 
	 * @return nombre del contacto
	 */
	public String getNombre_completo() {
		return nombre_completo;
	}
	/**
	 * 
	 * @param celular
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}
	/**
	 * 
	 * @param fecha_cumpleaños
	 */
	public void setFecha_cumpleaños(String fecha_cumpleaños) {
		this.fecha_cumpleaños = fecha_cumpleaños;
	}
	/**
	 * 
	 * @param correo_electronico
	 */
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	/**
	 * 
	 * @param nombre_completo
	 */
	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}
	
}
