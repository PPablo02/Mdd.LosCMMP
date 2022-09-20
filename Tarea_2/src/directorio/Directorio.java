package directorio;

import java.util.Arrays;

public class Directorio {
	Persona dir[] = {};
	int cont=0;
	public void insertar_contacto(Persona persona) {
		if (cont>dir.length) {Agregar();}
		for (int i=0; i<= dir.length; i++) {
			if (dir[i]==null) {
				dir[cont] = persona;
				cont++;};
		}
		
	}
	public void mostrar_datos_nombre(String nombre) {
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
			break;}  
	} 
	public void eliminar_datos_nombre(String nombre) {
		Persona[] copia = new Persona[dir.length-1];
		for (int i = 0, j = 0; i < dir.length; i++) {
		    if (!nombre.equals(dir[i].getNombre_completo())) {
		        copia[j++] = dir[i];
		        dir = copia;
		        cont--;
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
	public void Mostrar_conCorreo() {
		System.out.println("Profesores con correo: ");
		for (Persona i: dir) {
			if (i instanceof Profesor) {
				if (((Profesor)i).getCorreo_electronico()!="") {
					System.out.println(((Profesor)i).toString());
				}
			}
		}
		System.out.println("Coordinadores con correo: ");
		for (Persona i: dir) {
			if (i instanceof Coordinador) {
				if (((Coordinador)i).getCorreo_electronico()!="") {
					System.out.println(((Coordinador)i).toString());
				}
			}
		}
		System.out.println("Estudiantes con correo: ");
		for (Persona i: dir) {
			if (i instanceof Estudiante) {
				if (((Estudiante)i).getCorreo_electronico()!="") {
					System.out.println(((Estudiante)i).toString());
				}
			}
		}
	}
	public void Mostrar_contactos_Carrera (String carrera) {
		System.out.println("Profesores de esa carrera: ");
		for (Persona i: dir) {
			if (i instanceof Profesor) {
				if (carrera.equals(((Profesor)i).getCarrera())) {
					System.out.println(((Profesor)i).getNombre_completo());
				}
			}
		}
		System.out.println("Estudiantes de esa carrera: ");
		for (Persona i: dir) {
			if (i instanceof Estudiante) {
				if (carrera.equals(((Estudiante)i).getCarrera())) {
					System.out.println(((Estudiante)i).getNombre_completo());
				}
			}
		}
		System.out.println("Coordinador de esa carrera: ");
		for (Persona i: dir) {
			if (i instanceof Coordinador) {
				if (carrera.equals(((Coordinador)i).getCarrera())) {
					System.out.println(((Coordinador)i).getNombre_completo());
				}
			}
		}
	
	}
	public void MostrarSoloEoP(String rol) {
		for (Persona p:Ordenar_Asc_Nombre(dir, new ComparaNombre())) {
			if (rol.equals("Estudiante")) {
				System.out.println(((Estudiante)p).toString());
			}
			if (rol.equals("Profesor")) {
				System.out.println(((Profesor)p).toString());
			}
		}
		
	}
	public void eliminar_datos_correo(String correo) {
		Persona[] copia = new Persona[dir.length-1];
		for (int i = 0, j = 0; i < dir.length; i++) {
		    if (!correo.equals(dir[i].getCorreo_electronico())) {
		        copia[j++] = dir[i];
		        dir = copia;
		        cont--;
		    }
		}
	}
	public void mostrar_datos_celular(String celular) {
		for(Persona i: dir) {
			if (celular.equals(i.getCelular())) {
				System.out.println(i.toString());
			}
		}
	}
	public Persona[] Ordenar_Asc_Nombre(Persona[] dir, java.util.Comparator<Persona> cmp) {
		Persona orden[] = dir;
	    for(int i = 0;i < orden.length;i++)
	      for(int j = i + 1; j < orden.length; j++)
	        if (cmp.compare(dir[i],dir[j]) > 0 ){   //Los datos estan desordenados
	          Persona temp = orden[i];                  //por tanto los intercambia
	          orden[i] = orden[j];
	          orden[j] = temp;
	        }
		return orden;}
	
	public void Agregar() {
		Persona[] nuevo = Arrays.copyOf(dir, dir.length+1);
		dir = nuevo;}
	@Override
	public String toString() {
		String dirStr= "Profesores: ";
		for (Persona p:Ordenar_Asc_Nombre(dir, new ComparaNombre())) {
			if (p instanceof Profesor) {
					dirStr= dirStr+ ((Profesor)p).toString();
				}
		}
		dirStr = dirStr + "\nEstudiantes: ";
		for (Persona p:Ordenar_Asc_Nombre(dir, new ComparaNombre())) {
			if (p instanceof Estudiante) {
					dirStr= dirStr+ ((Estudiante)p).toString();
				}
		}
		dirStr = dirStr + "\nCoordinadores: ";
		for (Persona p:Ordenar_Asc_Nombre(dir, new ComparaNombre())) {
			if (p instanceof Coordinador) {
					dirStr= dirStr+ ((Coordinador)p).toString();
				}
		}
		return dirStr;
	}
	
	
	
	

}

