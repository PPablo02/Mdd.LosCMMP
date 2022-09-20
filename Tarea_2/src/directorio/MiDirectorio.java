package directorio;
import javax.swing.JOptionPane;
public class MiDirectorio {
	public static void main(String[] args) {
		int num_contactos = Integer.parseInt(JOptionPane.showInputDialog("Inserta el número de contactos que deseas que tenga el directorio owo:"));
		Directorio directorio = new Directorio();
		for (int i=0; i<=num_contactos; i++) {
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
					
					break;

				default:
					break;
				}
			}
		}
	}
	public static int menu() {
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("==========DIRECTORIO==========\n"
				+ "1) Insertar nuevo contacto.\n2) Mostrar daros de un contacto 8(Insertando nombre).\n3) Mostrar datos de un contacto (insertando nombre y rol)"
				+ "\n4) Eliminar datos de un contacto (Apartir de nombre)\n5) Actualizar información de un contacto (A partir de nombre) \n6) Mostrar contactos con determinado suelto.\n"
				+ "7) Mostrar contactos con correo electrónico.\n8)Mostrar contactos de una carrera en particular"
				+ "\n9)Mostrar solo alumnos o profesores. \n10)Eliminar contacto (A partir del correo)" + 
				"\n11)Mostrar contacto, apartir de celular \n12) Salir \n Escoge opción:"));
		while (opcion<1 || opcion>12) {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoge opción (entre 1 y 11): "));}
		return opcion;
	}

}
