package directorio;

public class Persona {
	private String celular;
	private String fecha_cumpleaņos;
	private String correo_electronico;
	private String nombre_completo;
	
	/**
	 * Constructor de la clase persona.
	 * @param celular
	 * @param fecha_cumpleaņos
	 * @param correo_electronico
	 * @param nombre_completo
	 */
	public Persona(String celular, String fecha_cumpleaņos, String correo_electronico, String nombre_completo) {
		this.celular = celular;
		this.fecha_cumpleaņos = fecha_cumpleaņos;
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
	 * @return fecha de cumpleaņos del contacto
	 */
	public String getFecha_cumpleaņos() {
		return fecha_cumpleaņos;
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
	 * @param fecha_cumpleaņos
	 */
	public void setFecha_cumpleaņos(String fecha_cumpleaņos) {
		this.fecha_cumpleaņos = fecha_cumpleaņos;
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
