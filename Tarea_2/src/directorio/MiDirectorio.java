package directorio;
import javax.swing.JOptionPane;
public class MiDirectorio {
	public static void main(String[] args) {
		int num_contactos = Integer.parseInt(JOptionPane.showInputDialog("Inserta el número de contactos que deseas que tenga el directorio owo:"));
		Directorio directorio = new Directorio();
		for (int i=0; i<=num_contactos+1; i++) {
			directorio.Agregar();
		}
		int opcion= menu();
		while (opcion!=12) {
			if (opcion==1) {
				String rol =JOptionPane.showInputDialog("Inserte el rol del contacto: ");
				switch (rol) {
				case "Estudiante":
					String nombre =JOptionPane.showInputDialog("Inserte el nombre del contacto: ");
					String num_cuenta =JOptionPane.showInputDialog("Inserte el número de cuenta del contacto: ");
					String celular =JOptionPane.showInputDialog("Inserte el celular del contacto: ");
					String fecha_cumpleaños =JOptionPane.showInputDialog("Inserte la fecha de cumpleaños del contacto: ");
					String correo =JOptionPane.showInputDialog("Inserte el correo del contacto: ");
					String carrera =JOptionPane.showInputDialog("Inserte la carrera del contacto: ");
					int num_materias = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de materias del contacto"));
					String[] materias = new String[num_materias];
					for (int i=0; i<num_materias;i++) {
						materias[i]= JOptionPane.showInputDialog("Inserte materia: ");
					}
					int semestre = Integer.parseInt(JOptionPane.showInputDialog("Inserte en que semstre estpa inscrito: "));
					directorio.insertar_contacto(new Estudiante(celular, fecha_cumpleaños, correo, nombre, semestre, carrera, num_cuenta, materias));
					break;
				case "Profesor":
					String nombre2 =JOptionPane.showInputDialog("Inserte el nombre del contacto: ");
					String tel_oficina =JOptionPane.showInputDialog("Inserte el telefono de oficina del contacto: ");
					double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Inserte el sueldo del contacto"));
					String depto =JOptionPane.showInputDialog("Inserte el departamento ");
					String num_cuenta2 =JOptionPane.showInputDialog("Inserte el número de profesor del contacto: ");
					String celular2 =JOptionPane.showInputDialog("Inserte el celular del contacto: ");
					String fecha_cumpleaños2 =JOptionPane.showInputDialog("Inserte la fecha de cumpleaños del contacto: ");
					String correo2 =JOptionPane.showInputDialog("Inserte el correo del contacto: ");
					String carrera2 =JOptionPane.showInputDialog("Inserte la carrera del contacto: ");
					int num_materias2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de grupos del contacto"));
					String[] materias2 = new String[num_materias2];
					for (int i=0; i<num_materias2;i++) {
						materias2[i]= JOptionPane.showInputDialog("Inserte grupo: ");
					}
					directorio.insertar_contacto(new Profesor(celular2, fecha_cumpleaños2, correo2, nombre2, num_cuenta2, tel_oficina, depto,materias2, sueldo, carrera2));
					break;
				case "Coordinador":
					String nombre3 =JOptionPane.showInputDialog("Inserte el nombre del contacto: ");
					String tel_oficina2 =JOptionPane.showInputDialog("Inserte el telefono de oficina del contacto: ");
					double sueldo2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el sueldo del contacto"));
					String depto2 =JOptionPane.showInputDialog("Inserte el departamento ");
					String num_cuenta3 =JOptionPane.showInputDialog("Inserte el número de empleado del contacto: ");
					String celular3 =JOptionPane.showInputDialog("Inserte el celular del contacto: ");
					String fecha_cumpleaños3 =JOptionPane.showInputDialog("Inserte la fecha de cumpleaños del contacto: ");
					String correo3 =JOptionPane.showInputDialog("Inserte el correo del contacto: ");
					String carrera3 =JOptionPane.showInputDialog("Inserte la carrera del contacto: ");
					directorio.insertar_contacto(new Coordinador(celular3, fecha_cumpleaños3, correo3, nombre3, num_cuenta3, tel_oficina2, depto2, sueldo2, carrera3));
					break;

				default:
					break;
				}
			}
			else if (opcion==2) {
				String nombre_b =JOptionPane.showInputDialog("Inserte el nombre del contacto: ");
				directorio.mostrar_datos_nombre(nombre_b);
			}
			else if (opcion==3) {
				String nombre_b =JOptionPane.showInputDialog("Inserte el nombre del contacto: ");
				String rol =JOptionPane.showInputDialog("Inserte el rol del contacto: ");
				directorio.mostrar_datos(nombre_b, rol);
			}
			else if (opcion==4) {
				String nombre_b =JOptionPane.showInputDialog("Inserte el nombre del contacto: ");
				directorio.eliminar_datos_nombre(nombre_b);
			}
			else if(opcion==5) {
				String rol =JOptionPane.showInputDialog("Inserte el rol del contacto: ");
				switch (rol) {
				case "Estudiante":
					String nombre =JOptionPane.showInputDialog("Inserte el nombre del contacto: ");
					String n_nombre =JOptionPane.showInputDialog("Inserte el nombre actualizado del contacto: ");
					String num_cuenta =JOptionPane.showInputDialog("Inserte el número de cuenta del contacto: ");
					String celular =JOptionPane.showInputDialog("Inserte el celular del contacto: ");
					String fecha_cumpleaños =JOptionPane.showInputDialog("Inserte la fecha de cumpleaños del contacto: ");
					String correo =JOptionPane.showInputDialog("Inserte el correo del contacto: ");
					String carrera =JOptionPane.showInputDialog("Inserte la carrera del contacto: ");
					int num_materias = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de materias del contacto"));
					String[] materias = new String[num_materias];
					for (int i=0; i<num_materias;i++) {
						materias[i]= JOptionPane.showInputDialog("Inserte materia: ");
					}
					int semestre = Integer.parseInt(JOptionPane.showInputDialog("Inserte en que semstre estpa inscrito: "));
					directorio.actualizar_datos_estudiante(nombre, num_cuenta, n_nombre,
							celular, fecha_cumpleaños, correo, carrera,
									materias, semestre);
					break;
				case "Profesor":
					String nombre2 =JOptionPane.showInputDialog("Inserte el nombre del contacto: ");
					String n_nombre2 =JOptionPane.showInputDialog("Inserte el nombre actualizado del contacto: ");
					String tel_oficina =JOptionPane.showInputDialog("Inserte el telefono de oficina del contacto: ");
					double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Inserte el sueldo del contacto"));
					String depto =JOptionPane.showInputDialog("Inserte el departamento ");
					String num_cuenta2 =JOptionPane.showInputDialog("Inserte el número de profesor del contacto: ");
					String celular2 =JOptionPane.showInputDialog("Inserte el celular del contacto: ");
					String fecha_cumpleaños2 =JOptionPane.showInputDialog("Inserte la fecha de cumpleaños del contacto: ");
					String correo2 =JOptionPane.showInputDialog("Inserte el correo del contacto: ");
					String carrera2 =JOptionPane.showInputDialog("Inserte la carrera del contacto: ");
					int num_materias2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de grupos del contacto"));
					String[] materias2 = new String[num_materias2];
					for (int i=0; i<num_materias2;i++) {
						materias2[i]= JOptionPane.showInputDialog("Inserte grupo: ");
					}
					directorio.actualizar_datos_Profesor( nombre2, num_cuenta2, n_nombre2, celular2,
							fecha_cumpleaños2, correo2, carrera2, tel_oficina, depto,
							sueldo, materias2);
					break;
				case "Coordinador":
					String nombre3 =JOptionPane.showInputDialog("Inserte el nombre del contacto: ");
					String n_nombre3 =JOptionPane.showInputDialog("Inserte el nombre actualizado del contacto: ");
					String tel_oficina2 =JOptionPane.showInputDialog("Inserte el telefono de oficina del contacto: ");
					double sueldo2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el sueldo del contacto: "));
					String depto2 =JOptionPane.showInputDialog("Inserte el departamento ");
					String num_cuenta3 =JOptionPane.showInputDialog("Inserte el número de empleado del contacto: ");
					String celular3 =JOptionPane.showInputDialog("Inserte el celular del contacto: ");
					String fecha_cumpleaños3 =JOptionPane.showInputDialog("Inserte la fecha de cumpleaños del contacto: ");
					String correo3 =JOptionPane.showInputDialog("Inserte el correo del contacto: ");
					String carrera3 =JOptionPane.showInputDialog("Inserte la carrera del contacto: ");
					directorio.actualizar_datos_Coordinador(nombre3, num_cuenta3,  n_nombre3, celular3,
							fecha_cumpleaños3, correo3, carrera3, tel_oficina2, depto2,
							sueldo2);
					break;

				default:
					break;
				}
				
			}
			else if(opcion==6) {
				double sueldo2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el sueldo del contacto: "));
				directorio.Mostrar_Segun_Sueldo(sueldo2);
			}
			else if(opcion==7) {
				directorio.Mostrar_conCorreo();
			}
			else if(opcion==8) {
				String carrera3 =JOptionPane.showInputDialog("Inserte la carrera del contacto: ");
				directorio.Mostrar_contactos_Carrera(carrera3);
				
			}
			else if(opcion==9) {
				String rol =JOptionPane.showInputDialog("Inserte el rol del contacto(Alumnos o Profesores): ");
				directorio.MostrarSoloEoP(rol);
			}
			else if(opcion==10) {
				String correo3 =JOptionPane.showInputDialog("Inserte el correo del contacto: ");
				directorio.eliminar_datos_correo(correo3);
			}
			else if(opcion==11) {
				String celular3 =JOptionPane.showInputDialog("Inserte el celular del contacto: ");
				directorio.mostrar_datos_celular(celular3);
			}
		
			
			opcion = menu();}
	}
	public static int menu() {
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("==========DIRECTORIO==========\n"
				+ "1) Insertar nuevo contacto.\n2) Mostrar daros de un contacto (Insertando nombre).\n3) Mostrar datos de un contacto (insertando nombre y rol)"
				+ "\n4) Eliminar datos de un contacto (Apartir de nombre)\n5) Actualizar información de un contacto (A partir de nombre) \n6) Mostrar contactos con determinado sueldo.\n"
				+ "7) Mostrar contactos con correo electrónico.\n8)Mostrar contactos de una carrera en particular"
				+ "\n9)Mostrar solo alumnos o profesores. \n10)Eliminar contacto (A partir del correo)" + 
				"\n11)Mostrar contacto, apartir de celular \n12) Salir \n Escoge opción:"));
		while (opcion<1 || opcion>12) {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoge opción (entre 1 y 11): "));}
		return opcion;
	}

}
