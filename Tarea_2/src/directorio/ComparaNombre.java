package directorio;


	public class ComparaNombre implements java.util.Comparator<Persona> {
		  /**
		   * M�todo que especifica la forma en c�mo se van a comparar los objetos
		   * @param p1 Una de las personas para comparar
		   * @param p2 Una de las personas para comparar
		   * @return int 0 si son iguales, mayor a 0 si p1 es mayor que p2, menor 0 si p2 es mayor que p1
		   */
		  public int compare(Persona p1, Persona p2) {
		    if (p1 == p2) return 0;
		    if(p1 == null) return -1;
		    if(p2 == null) return 1;
		    return p1.getNombre_completo().compareTo(p2.getNombre_completo());
		
		}
}