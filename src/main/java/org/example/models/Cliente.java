package org.example.models;

import org.example.helpers.validaciones.ClienteValidacion;

import java.time.LocalDate;

public class Cliente {

    //ID
    //NOMBRE Y APELLIDO: Solo se puede letras y espacios y maximo 70 caracteres
    //EMAIL: Que sea un email válido
    //FECHA REGISTRO: (YYYY/MM/DD) se recomienda usar la clase local date
    //TELEFONO: Solamete puede tener 10 digitos, ni más ni menos

    private Integer id;
    private String nombreApellido;
    private String email;
    private LocalDate fechaRegistro;
    private String telefono;

    //inyectando una dependencia de la clase clienteValidacion
    private ClienteValidacion clienteValidacion = new ClienteValidacion();

    public Cliente() {
    }
    public Cliente(Integer id, String nombreApellido, String email, LocalDate fechaRegistro, String telefono) {
        this.id = id;
        this.nombreApellido = nombreApellido;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id>0){
            this.id = id;
        } else{
            System.out.println("Revise ya que no se aceptan  idnnegativos");
        }
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        try{
            this.clienteValidacion.validarNombre(nombreApellido);
            this.nombreApellido=nombreApellido;
        } catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try{
            this.clienteValidacion.validarCorreo(email);
            this.email=email;

        } catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        try {
            this.clienteValidacion.validarTelefono(telefono);
            this.telefono=telefono;
        } catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}
