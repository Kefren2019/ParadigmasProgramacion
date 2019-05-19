import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usaurio=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		String edad=JOptionPane.showInputDialog("Introduce tu edad, por favor");
		int edad_usuario=Integer.parseInt(edad);
		edad_usuario++;
		System.out.println("Hola " + nombre_usaurio + ". El año que viene tendras " + edad_usuario + " años");


	}

}
