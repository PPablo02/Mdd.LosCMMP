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
					System.out.println(((Estudiante)i).toString());
				}
			}
			break;
		case "Profesor":
			for(Persona i: dir) {
				if (nombre.equals(i.getNombre_completo())&&(i instanceof Profesor)) {
					System.out.println(((Profesor)i).toString());
				}
			}
			break;
		case "Coordinador":
			for(Persona i: dir) {
				if (nombre.equals(i.getNombre_completo())&&(i instanceof Coordinador)) {
					System.out.println(((Coordinador)i).toString());
				}
			}
				
		}  
	} 
	public void eliminar_datos(String nombre) {
		Persona[] copia = new Persona[dir.length-1];
		for (int i = 0, j = 0; i < dir.length; i++) {
		    if (!nombre.equals(dir[i].getNombre_completo())) {
		        copia[j++] = dir[i];
		        dir = copia;
		    }
		}
	}
	
	public void actualizar_datos_estudiante(String nombre, String n_num_cuenta, String n_nombre,
			String n_celular, String n_fecha_cumpleaños, String n_correo, String n_carrera, String[] 
			materias, int n_semestre) {
		for (Persona i: dir) {
			if (nombre.equals(i.getNombre_completo())&&(i instanceof Estudiante)){
			((Estudiante)i).setNombre_completo(n_nombre);
			((Estudiante)i).setNumero_cuenta(n_num_cuenta);
			((Estudiante)i).setCelular(n_celular);
			((Estudiante)i).setFecha_cumpleaños(n_fecha_cumpleaños);
			((Estudiante)i).setCorreo_electronico(n_correo);
			((Estudiante)i).setCarrera(n_carrera);
			((Estudiante)i).setMaterias(materias);
			((Estudiante)i).setNumero_semestre(n_semestre);
			}}}

	public void actualizar_datos_Profesor(String nombre, String n_num_prof, String n_nombre, String n_celular,
			String n_fecha_cumpleaños, String n_correo, String n_carrera, String n_num_oficina, String n_dpto,
			double salario, String[] n_grupos) {
		for (Persona i : dir) {
			if (nombre.equals(i.getNombre_completo()) && (i instanceof Profesor)) {
				((Profesor) i).setNombre_completo(n_nombre);
				((Profesor) i).setNum_profesor(n_num_prof);
				((Profesor) i).setCelular(n_celular);
				((Profesor) i).setFecha_cumpleaños(n_fecha_cumpleaños);
				((Profesor) i).setCorreo_electronico(n_correo);
				((Profesor) i).setCarrera(n_carrera);
				((Profesor) i).setTel_oficina(n_num_oficina);
				((Profesor) i).setSalario(salario);
				((Profesor) i).setDep_escolar(n_dpto);
				((Profesor) i).setGrupos(n_grupos);
		
			}
		}
	}
	public void actualizar_datos_Coordinador(String nombre, String n_num_empl, String n_nombre, String n_celular,
			String n_fecha_cumpleaños, String n_correo, String n_carrera, String n_num_oficina, String n_dpto,
			double salario) {
		for (Persona i : dir) {
			if (nombre.equals(i.getNombre_completo()) && (i instanceof Coordinador)) {
				((Coordinador) i).setNombre_completo(n_nombre);
				((Coordinador) i).setNum_empleado(n_num_empl);
				((Coordinador) i).setCelular(n_celular);
				((Coordinador) i).setFecha_cumpleaños(n_fecha_cumpleaños);
				((Coordinador) i).setCorreo_electronico(n_correo);
				((Coordinador) i).setCarrera(n_carrera);
				((Coordinador) i).setTel_oficina(n_num_oficina);
				((Coordinador) i).setSalario(salario);
				((Coordinador) i).setDep_escolar(n_dpto);
				
		
			}
		}
	}
	public void Mostrar_Segun_Sueldo(double salario) {
		System.out.println("Profesores con ese sueldo: ");
		for (Persona i: dir) {
			if (i instanceof Profesor) {
				if (salario==((Profesor)i).getSalario()) {
					System.out.println(i.getNombre_completo());
				}
			}
		}
		System.out.println("Coordinadores con ese sueldo: ");
		for (Persona i: dir) {
			if (i instanceof Coordinador) {
				if (salario==((Coordinador)i).getSalario()) {
					System.out.println(i.getNombre_completo());
				}
			}
		}
	}
	
	
	

}

