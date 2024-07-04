/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_de_estudio_1;

/**
 *
 * @author bague
 */
public class ComisionPuntos {
    
    public static double calcularBono(Factura factura) {
        double bono = 0;
        //Calculos para el bono que tendra el vendedor 
        if (factura.getProductosElectricos() && factura.getProductosAutomotrices() && factura.getProductosConstruccion()) {
            bono += factura.getMontoFactura() * 0.10;
        } else {
            if (factura.getProductosElectricos()) {
                bono += factura.getMontoFactura() * 0.04;
            }
            if (factura.getProductosAutomotrices()) {
                bono += factura.getMontoFactura() * 0.04;
            }
            if (factura.getProductosConstruccion()) {
                bono += factura.getMontoFactura() * 0.08;
            }
        }

        if (factura.getMontoFactura() > 50000) {
            bono += factura.getMontoFactura() * 0.05;
        }

        return bono;
    }
    //Calculos para los puntos que obtendra el venderdor
    public static int calcularPuntos(Factura factura) {
        int puntos = 0;

        if (factura.getProductosElectricos() && factura.getProductosAutomotrices() && factura.getProductosConstruccion()) {
            puntos += 3;
        } else {
            if (factura.getProductosElectricos()) {
                puntos += 1;
            }
            if (factura.getProductosAutomotrices()) {
                puntos += 1;
            }
            if (factura.getProductosConstruccion()) {
                puntos += 2;
            }
        }

        if (factura.getMontoFactura() > 50000) {
            puntos += 1;
        }

        return puntos;
    }
    //Calculos para la comision final que tendra el vendedor 
    public static double calcularComisionTotal(Factura[] facturas) {
        double comisionTotal = 0;
        for (Factura factura : facturas) {
            comisionTotal += calcularBono(factura);
        }

        return comisionTotal;
    }
    //Calculos para los puntos fnales que tendra el vendedor 
    public static int calcularPuntosTotales(Factura[] facturas) {
        int puntosTotales = 0;
        for (Factura factura : facturas) {
            puntosTotales += calcularPuntos(factura);
        }

        return puntosTotales;
    }
}

