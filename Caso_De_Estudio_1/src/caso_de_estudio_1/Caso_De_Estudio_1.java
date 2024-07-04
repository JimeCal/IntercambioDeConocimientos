/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso_de_estudio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author bague
 */
public class Caso_De_Estudio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se solicitan los datos del vendedor
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del agente vendedor:");
        String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del agente vendedor:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del agente vendedor:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código del agente vendedor:");
        String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal del agente vendedor:");
        boolean tieneVehiculoPropio = JOptionPane.showConfirmDialog(null, "¿Tiene vehículo propio?", "Vehículo Propio", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        // Se guardan los daros del venderdor
        Vendedor vendedor = new Vendedor(nombre, apellidos, cedula, codigo, sucursal, tieneVehiculoPropio);

        // Se solicita la atidad de facturas
        int numFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de facturas:"));
        Factura[] facturas = new Factura[numFacturas];
        //Dependiendo del numero de facturas ingresadas es la cantidad de veces que se le va a preguntar la informacion del cliente
        for (int i = 0; i < numFacturas; i++) {
            // Solicitud de la informacion del cliente
            String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
            String codigoFactura = JOptionPane.showInputDialog("Ingrese el código de la factura:");
            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura (1-12):"));
            boolean productosElectricos = JOptionPane.showConfirmDialog(null, "¿Incluye productos eléctricos?", "Productos Eléctricos", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            boolean productosAutomotrices = JOptionPane.showConfirmDialog(null, "¿Incluye productos automotrices?", "Productos Automotrices", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            boolean productosConstruccion = JOptionPane.showConfirmDialog(null, "¿Incluye productos de construcción?", "Productos de Construcción", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            //  Se guardan los dados de la factura 
            facturas[i] = new Factura(nombreCliente, cedulaCliente, codigoFactura, montoFactura, mes, productosElectricos, productosAutomotrices, productosConstruccion);
        }

        // Se calculan las comisiones y puntos del vendedor 
        double comisionTotal = ComisionPuntos.calcularComisionTotal(facturas);
        int puntosTotales = ComisionPuntos.calcularPuntosTotales(facturas);
 
        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "Información del Agente Vendedor:\n" +
                "Nombre: " + vendedor.getNombre() + "\n" +
                "Apellidos: " + vendedor.getApellidos() + "\n" +
                "Cédula: " + vendedor.getCedula() + "\n" +
                "Código: " + vendedor.getCodigo() + "\n" +
                "Sucursal: " + vendedor.getSucursal() + "\n" +
                "Vehículo Propio: " + (vendedor.getTieneVehiculo()? "Sí" : "No") + "\n" +
                "Detalles de las Facturas:\n" + facturas.toString() +
                "Comisión Total: " + comisionTotal + "\n" +
                "Puntos Totales: " + puntosTotales);
    }
}
