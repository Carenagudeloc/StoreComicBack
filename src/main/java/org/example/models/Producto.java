package org.example.models;

import org.example.helpers.validaciones.ClienteValidacion;
import org.example.helpers.validaciones.ProductoValidacion;

public class Producto {

    //id
    //nombre: solo se aceptan letras y espacios (80 caracteres)
    //precio unitario: solo se aceptan numeros y solo positivos
    //descripcion: solo se aceptan cadenas hasta 50 caracteres
    //foto
    //reseña limite 100 caracteres
    //marca

    //REVISTAS (VALORACIÓN (a/b/c)) (AÑO PUBLICACIÓN)
    //OTROS (pais origen) (fabricante)

    private Integer id;
    private String nombre;
    private double precioUnitario;
    private String descripcion;
    private String foto;
    private String reseña;
    private String marca;

    private ProductoValidacion productoValidacion = new ProductoValidacion();
    public Producto() {
    }

    public Producto(Integer id, String nombre, double precioUnitario, String descripcion, String foto, String reseña, String marca) {
        this.id = id;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.foto = foto;
        this.reseña = reseña;
        this.marca = marca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try{
            this.productoValidacion.validarNombre(nombre);
            this.nombre=nombre;
        } catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        try{
            this.productoValidacion.validarPrecioUnitario(precioUnitario);
            this.precioUnitario=precioUnitario;
        } catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        try{
            this.productoValidacion.validarDescripcion(descripcion);
            this.descripcion=descripcion;
        } catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        try{
            this.productoValidacion.validarReseña(reseña);
            this.reseña=reseña;
        } catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getMarca() {
        return marca;
    }

}
