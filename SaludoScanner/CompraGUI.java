/**********************************************************
	* CompraGUI.java
	* Javier Santa Cruz
	* Este programa utiliza una ventana de dialogo
**********************************************************/

import javax.swing.JOptionPane;

public class CompraGUI{
	public static void main(String args[]){

		String nombreArticulo;
		double precioArticulo;
		int cantidadArticulo;

		nombreArticulo = JOptionPane.showInputDialog("Nombre del articulo");
		precioArticulo = Double.parseDouble(JOptionPane.
									showInputDialog("Precio del articulo"));
		cantidadArticulo = Integer.parseInt(JOptionPane.
								showInputDialog("Cantidad del articulo"));

		JOptionPane.showMessageDialog(null,"ORDEN DE COMPRA:\n\n" + "Artículo: " + nombreArticulo + "\nCantidad: " + cantidadArticulo + "\nPrecio total: $" + precioArticulo * cantidadArticulo);
	}
}