package org.example.models.children;

import org.example.models.Producto;

public class Otro extends Producto {
    private String paisOrigen;
    private String fabricante;

    public Otro() {
    }

    public Otro(Integer id, String nombre, double precioUnitario, String descripcion, String foto, String reseña, String marca, String paisOrigen, String fabricante) {
        super(id, nombre, precioUnitario, descripcion, foto, reseña, marca);
        this.paisOrigen = paisOrigen;
        this.fabricante = fabricante;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
