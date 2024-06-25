package org.example.helpers.validaciones;

import org.example.helpers.generals.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarcaValidacionTest {

    private MarcaValidacion sujetoDePrueba;

    @BeforeEach
    public void configuracionInicial() { this.sujetoDePrueba = new MarcaValidacion(); }

    @Test
    public void validarFallaNombre() {
        String nombreMalo = "lkksjfhdf kajdkjasbdsjb kjadwajwbdjawsjfdbjsbf sjfbsjkdbfjdskb" +
                "sfnkjdsnbdkjbfdkj";

        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.sujetoDePrueba.validarNombre(nombreMalo));
        Assertions.assertEquals(Mensaje.MARCA_NOMBRE_LONGITUD.getMensaje(), exceptionLanzada.getMessage());
    }

    @Test
    public void validarNombreCorrecto(){
        String nombreBueno = "Adidas";
        Assertions.assertDoesNotThrow(()->this.sujetoDePrueba.validarNombre(nombreBueno));
    }

    @Test
    public void validarFallaNombrePais() {
        String nombrePaisMalo = "COLOMBIAESCUADORPERU34";

        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.sujetoDePrueba.validarPais(nombrePaisMalo));
        Assertions.assertEquals(Mensaje.MARCA_PAIS_FORMATO.getMensaje(), exceptionLanzada.getMessage());
    }

    @Test
    public void validarNombrePaisCorrecto(){
        String nombrePaisBueno = "Colombia";
        Assertions.assertDoesNotThrow(()->this.sujetoDePrueba.validarPais(nombrePaisBueno));
    }

    @Test
    public void validarFallaEmail() {
        String emailMalo = "caren@cesde.net";

        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.sujetoDePrueba.validarEmail(emailMalo));
        Assertions.assertEquals(Mensaje.MARCA_CORREO_FORMATO.getMensaje(), exceptionLanzada.getMessage());
    }

    @Test
    public void validarEmailCorrecto() {
        String emailBueno = "caren@globant.com";
        Assertions.assertDoesNotThrow(()->this.sujetoDePrueba.validarEmail(emailBueno));
    }
}