package org.example.models.children;

import org.example.models.Cliente;

import java.time.LocalDate;

public class ClienteOrdinario extends Cliente {
    private String direccion;
    private String municipio;

    public ClienteOrdinario() {
    }

    public ClienteOrdinario(Integer id, String nombreApellido, String email, LocalDate fechaRegistro, String telefono, String direccion, String municipio) {
        super(id, nombreApellido, email, fechaRegistro, telefono);
        this.direccion = direccion;
        this.municipio = municipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
