package directorio;

import java.util.Arrays;

public class Directorio {
	Persona dir[] = {};
	int cont=0;
	/**
	 * Método que inserta contactos al directorio
	 * @param persona
	 */
	public void insertar_contacto(Persona persona) {
		if (cont>dir.length) {Agregar();}
		dir[cont] = persona;
		cont++;}

	/**
	 * Método que muestra contactos con cierto nombre
	 * @param nombre
	 */
	public void mostrar_datos_nombre(String nombre) {
		for(Persona i: dir) {
			if (i!=null) {
				if (nombre.equals(i.getNombre_completo())) {
					System.out.println(i.toString());
				}}
		}
	}
	/**
	 * Método que muestra datos del contacto dado nombre y rol
	 * @param nombre
	 * @param rol
	 */
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
	/**
	 * Método que elimina datos del directorio dado nombre
	 * @param nombre
	 */
	public void eliminar_datos_nombre(String nombre) {
		Persona[] copia = new Persona[dir.length-1];
		for (int i = 0, j = 0; i < dir.length; i++) {
			if (dir[i]!=null) {
				if (!nombre.equals(dir[i].getNombre_completo())) {
					copia[j++] = dir[i];

				}}
		}
		dir = copia;
		cont--;
	}
	/**
	 * Métpdp que actualiza datos de un contacto del directorio, dado nombre
	 * @param nombre
	 * @param n_num_cuenta
	 * @param n_nombre
	 * @param n_celular
	 * @param n_fecha_cumpleaños
	 * @param n_correo
	 * @param n_carrera
	 * @param materias
	 * @param n_semestre
	 */
	public void actualizar_datos_estudiante(String nombre, String n_num_cuenta, String n_nombre,
			String n_celular, String n_fecha_cumpleaños, String n_correo, String n_carrera, String[] 
					materias, int n_semestre) {
		for (Persona i: dir) {
			if (i!=null) {
				if (nombre.equals(i.getNombre_completo())&&(i instanceof Estudiante)){
					((Estudiante)i).setNombre_completo(n_nombre);
					((Estudiante)i).setNumero_cuenta(n_num_cuenta);
					((Estudiante)i).setCelular(n_celular);
					((Estudiante)i).setFecha_cumpleaños(n_fecha_cumpleaños);
					((Estudiante)i).setCorreo_electronico(n_correo);
					((Estudiante)i).setCarrera(n_carrera);
					((Estudiante)i).setMaterias(materias);
					((Estudiante)i).setNumero_semestre(n_semestre);
				}}}}
	/**
	 * Método que actualiza datos de profesores
	 * @param nombre
	 * @param n_num_prof
	 * @param n_nombre
	 * @param n_celular
	 * @param n_fecha_cumpleaños
	 * @param n_correo
	 * @param n_carrera
	 * @param n_num_oficina
	 * @param n_dpto
	 * @param salario
	 * @param n_grupos
	 */
	public void actualizar_datos_Profesor(String nombre, String n_num_prof, String n_nombre, String n_celular,
			String n_fecha_cumpleaños, String n_correo, String n_carrera, String n_num_oficina, String n_dpto,
			double salario, String[] n_grupos) {
		for (Persona i : dir) {
			if (i!=null) {
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

				}}
		}
	}
	/**
	 * Método que actualiza datos de coordinadores
	 * @param nombre
	 * @param n_num_empl
	 * @param n_nombre
	 * @param n_celular
	 * @param n_fecha_cumpleaños
	 * @param n_correo
	 * @param n_carrera
	 * @param n_num_oficina
	 * @param n_dpto
	 * @param salario
	 */
	public void actualizar_datos_Coordinador(String nombre, String n_num_empl, String n_nombre, String n_celular,
			String n_fecha_cumpleaños, String n_correo, String n_carrera, String n_num_oficina, String n_dpto,
			double salario) {
		for (Persona i : dir) {
			if (i!=null) {
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


				}}
		}
	}
	/**
	 * Método que imprime contactos con cierto salario
	 * @param salario
	 */
	public void Mostrar_Segun_Sueldo(double salario) {
		System.out.println("Profesores con ese sueldo: ");
		for (Persona i: dir) {
			if (i!=null) {
				if (i instanceof Profesor) {
					if (salario==((Profesor)i).getSalario()) {
						System.out.println(i.getNombre_completo());
					}
				}}
		}
		System.out.println("Coordinadores con ese sueldo: ");
		for (Persona i: dir) {
			if (i!=null) {
				if (i instanceof Coordinador) {
					if (salario==((Coordinador)i).getSalario()) {
						System.out.println(i.getNombre_completo());
					}
				}}
		}
	}
	/**
	 * Método que imprime contactos con correo diferente de una cadena vacía
	 */
	public void Mostrar_conCorreo() {
		System.out.println("Profesores con correo: ");
		for (Persona i: dir) {
			if (i!=null) {
				if (i instanceof Profesor) {
					if (((Profesor)i).getCorreo_electronico()!="") {
						System.out.println(((Profesor)i).toString());
					}
				}
			}}
		System.out.println("Coordinadores con correo: ");
		for (Persona i: dir) {
			if (i!=null) {
				if (i instanceof Coordinador) {
					if (((Coordinador)i).getCorreo_electronico()!="") {
						System.out.println(((Coordinador)i).toString());
					}
				}}
		}
		System.out.println("Estudiantes con correo: ");
		for (Persona i: dir) {
			if (i!=null) {
				if (i instanceof Estudiante) {
					if (((Estudiante)i).getCorreo_electronico()!="") {
						System.out.println(((Estudiante)i).toString());
					}
				}}
		}
	}
	/**
	 * Método que imprime contactos correspondientes a cierta carrera
	 * @param carrera
	 */
	public void Mostrar_contactos_Carrera (String carrera) {
		System.out.println("Profesores de esa carrera: ");
		for (Persona i: dir) {
			if (i!=null) {
				if (i instanceof Profesor) {
					if (carrera.equals(((Profesor)i).getCarrera())) {
						System.out.println(((Profesor)i).getNombre_completo());
					}
				}}
		}
		System.out.println("Estudiantes de esa carrera: ");
		for (Persona i: dir) {
			if (i!=null) {
				if (i instanceof Estudiante) {
					if (carrera.equals(((Estudiante)i).getCarrera())) {
						System.out.println(((Estudiante)i).getNombre_completo());
					}
				}}
		}
		System.out.println("Coordinador de esa carrera: ");
		for (Persona i: dir) {
			if (i!=null) {
				if (i instanceof Coordinador) {
					if (carrera.equals(((Coordinador)i).getCarrera())) {
						System.out.println(((Coordinador)i).getNombre_completo());
					}
				}
			}}

	}
	/**
	 * Método que imprime solo alumnos o solo profesores, ordenados de forma ascendente
	 * @param rol
	 */
	public void MostrarSoloEoP(String rol) {
		for (Persona p:Ordenar_Asc_Nombre(dir, new ComparaNombre())) {
			if (p!=null) {
				if (rol.equals("Estudiante")&&p instanceof Estudiante) {
					System.out.println(((Estudiante)p).toString());
				}
				if (rol.equals("Profesor")&&p instanceof Profesor) {
					System.out.println(((Profesor)p).toString());
				}
			}}

	}
	/**
	 * Método que elimina contactos dado un correo
	 * @param correo
	 */
	public void eliminar_datos_correo(String correo) {
		Persona[] copia = new Persona[dir.length-1];
		for (int i = 0, j = 0; i < dir.length; i++) {
			if (dir[i]!=null) {
				if (!correo.equals(dir[i].getCorreo_electronico())) {
					copia[j++] = dir[i];
					dir = copia;
					cont--;
				}
			}}
	}
	/**
	 * Método que busca contactos con cierto número de celular
	 * @param celular
	 */
	public void mostrar_datos_celular(String celular) {
		for(Persona i: dir) {
			if (i!=null) {
				if (celular.equals(i.getCelular())) {
					System.out.println(i.toString());
				}
			}}
	}
	/**
	 * Métpdp que ordena ascendentemente los contactos (de acuerdo con nombre)
	 * @param dir
	 * @param cmp
	 * @return Persona [] El arreglo de personas ordenado
	 */
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

	/**
	 * Método que hace crecer al directorio
	 */
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

