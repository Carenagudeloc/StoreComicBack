package org.example.models;
import org.example.helpers.validaciones.MarcaValidacion;

public class Marca {

    //ID
    //NOMBRE: No puede sobrepasar los 50 caracteres
    //PAIS: Solo puede tener letras y máximo 10 caracteres
    //EMAIL REPRESENTANTE: debe cumplir con un formato de mail válido (xxxx@globant.com)

    private String id;
    private String nombre;
    private String pais;
    private String email;

    private MarcaValidacion marcaValidacion = new MarcaValidacion();

    public Marca() {
    }

    public Marca(String id, String nombre, String pais, String email) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try{
            this.marcaValidacion.validarNombre(nombre);
            this.nombre=nombre;
        } catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        try{
            this.marcaValidacion.validarPais(pais);
            this.pais=pais;
        } catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try{
            this.marcaValidacion.validarEmail(email);
            this.email=email;
        } catch(Exception error){
            System.out.println(error.getMessage());
        }
    }
}
