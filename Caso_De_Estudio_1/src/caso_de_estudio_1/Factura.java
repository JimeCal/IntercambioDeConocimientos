/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_de_estudio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author bague
 */
public class Factura {
    //Variables
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double montoFactura;
    private int numeroMes;
    private boolean contieneProductosElectricos;
    private boolean contieneProductosAutomotrices;
    private boolean contieneProductosConstruccion;

    // Constructores de las variables
    public Factura(String nombreCliente, String cedulaCliente, String codigoFactura, double montoFactura,
                  int numeroMes, boolean contieneProductosElectricos, boolean contieneProductosAutomotrices,
                  boolean contieneProductosConstruccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.numeroMes = numeroMes;
        this.contieneProductosElectricos = contieneProductosElectricos;
        this.contieneProductosAutomotrices = contieneProductosAutomotrices;
        this.contieneProductosConstruccion = contieneProductosConstruccion;
    }

    // Emcapsuladores (Getters y Setters) de nombre cliente
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    // Emcapsuladores (Getters y Setters) de cedula cliente
    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }
    // Emcapsuladores (Getters y Setters) de codigo de factura
    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }
    // Emcapsuladores (Getters y Setters) de monto de factura
    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }
    // Emcapsuladores (Getters y Setters) de numero de mes
    public int getNumeroMes() {
        return numeroMes;
    }

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }

    public boolean contieneProductosElectricos() {
        return contieneProductosElectricos;
    }

    public void setContieneProductosElectricos(boolean contieneProductosElectricos) {
        this.contieneProductosElectricos = contieneProductosElectricos;
    }

    public boolean contieneProductosAutomotrices() {
        return contieneProductosAutomotrices;
    }

    public void setContieneProductosAutomotrices(boolean contieneProductosAutomotrices) {
        this.contieneProductosAutomotrices = contieneProductosAutomotrices;
    }

    public boolean contieneProductosConstruccion() {
        return contieneProductosConstruccion;
    }

    public void setContieneProductosConstruccion(boolean contieneProductosConstruccion) {
        this.contieneProductosConstruccion = contieneProductosConstruccion;
    }

    // Método para mostrar información de la factura
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Factura: " + codigoFactura +
                "\nCliente: " + nombreCliente + " - Cédula: " + cedulaCliente +
                "\nMonto: " + montoFactura +
                "\nMes: " + obtenerNombreMes(numeroMes) +
                "\nProductos Eléctricos: " + (contieneProductosElectricos ? "Sí" : "No") +
                "\nProductos Automotrices: " + (contieneProductosAutomotrices ? "Sí" : "No") +
                "\nProductos Construcción: " + (contieneProductosConstruccion ? "Sí" : "No"));
    }

    // Método para obtener el nombre del mes
    private String obtenerNombreMes(int numeroMes) {
        switch (numeroMes) {
            case 1: return "enero";
            case 2: return "febrero";
            case 3: return "marzo";
            case 4: return "abril";
            case 5: return "mayo";
            case 6: return "junio";
            case 7: return "julio";
            case 8: return "agosto";
            case 9: return "septiembre";
            case 10: return "octubre";
            case 11: return "noviembre";
            case 12: return "diciembre";
            default: return "mes inválido";
        }
    }

    public boolean getProductosElectricos() {
        return contieneProductosElectricos;
    }

    public boolean getProductosAutomotrices() {
        return contieneProductosAutomotrices;
    }

    public boolean getProductosConstruccion() {
        return contieneProductosConstruccion;
    }
}

