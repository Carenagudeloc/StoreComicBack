package org.example.models.children;

import org.example.models.Producto;

import java.time.LocalDate;

public class Revista extends Producto {
    private String valoracion;
    private LocalDate anoPublicacion;

    public Revista() {
    }

    public Revista(Integer id, String nombre, double precioUnitario, String descripcion, String foto, String reseña, String marca, String valoracion, LocalDate anoPublicacion) {
        super(id, nombre, precioUnitario, descripcion, foto, reseña, marca);
        this.valoracion = valoracion;
        this.anoPublicacion = anoPublicacion;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public LocalDate getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(LocalDate anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
}
