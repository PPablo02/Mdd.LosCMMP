package directorio;

public class Directorio {
	Persona dir[] = {};
	int cont=0;
	public void insertar_contacto(Persona persona) {	
		for (int i=0; i<= dir.length; i++) {
			if (dir[i]==null) {cont++;};
		}
		dir[cont] = persona;
		
	}
	public void mostrar_datos(String nombre) {
		for(Persona i: dir) {
			if (nombre.equals(i.getNombre_completo())) {
				System.out.println(i.toString());
			}
		}
	}
	public void mostrar_datos(String nombre, String rol) {
		switch (rol) {
		case "Estudiante":
			for(Persona i: dir) {
				if (nombre.equals(i.getNombre_completo())&&(i instanceof Estudiante)) {
					System.out.println(i.toString());
				}
			}
			break;
		case "Profesor":
			for(Persona i: dir) {
				if (nombre.equals(i.getNombre_completo())&&(i instanceof Profesor)) {
					System.out.println(i.toString());
				}
			}
			break;
		case "Coordinador":
			for(Persona i: dir) {
				if (nombre.equals(i.getNombre_completo())&&(i instanceof Coordinador)) {
					System.out.println(i.toString());
				}
			}
				
		}  
	} 
	public void eliminar_datos() {
		Persona[] copia = new Persona[dir.length-1];
		for (int i = 0, j = 0; i < dir.length; i++) {
		    if (i != ind) {
		        copia[j++] = dir[i];
		    }
		}
	}
	
	

}

