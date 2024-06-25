package org.example.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {

    //ID
    //FECHA: (DD-MM-YYYY) local date
    //LISTA DE PRODUCTOS: (Revisar ArrayList)
    //COSTO BRUTO
    //COSTO NETO: Aplicar iva y descontar descuentos

    private String id;
    private LocalDate fecha;
    private ArrayList listDeProductos;
    private double costoBruto;
    private double costoNeto;

    public Factura() {
    }

    public Factura(String id, LocalDate fecha, ArrayList listDeProductos, double costoBruto, double costoNeto) {
        this.id = id;
        this.fecha = fecha;
        this.listDeProductos = listDeProductos;
        this.costoBruto = costoBruto;
        this.costoNeto = costoNeto;
    }
}
