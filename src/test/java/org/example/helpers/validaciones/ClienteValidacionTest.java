package org.example.helpers.validaciones;

import org.example.helpers.generals.Mensaje;
import org.example.helpers.validaciones.ClienteValidacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteValidacionTest {

    //0.Traiga el sujeto de prueba

    private ClienteValidacion sujetoDePrueba;

    //1.Metodo para configurar por defecto la prueba unitaria (RESET/Setup inicial)

    @BeforeEach
    public void configuracionInicial(){
        this.sujetoDePrueba = new ClienteValidacion();
    }

    //2.Definir los metodos y sus respectivos caminos a probar

    @Test
    public void validarNombreFallaPorLongitud(){
        String nombreMaloPorLongitud = "juan andres afnsnsaoincaiv apfcsnvdnvñsvdojnzdjvn" +
                " k<anckjdncsjdvnsodvns oancanjdcsjvnnsdjnvsd akzc nskjc";

        //Probe que se lanza una excepcion al llevar un string con longitud mayor a 70
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.sujetoDePrueba.validarNombre(nombreMaloPorLongitud));

        //Probe que el mensaje de error corresponda a mi prueba
        Assertions.assertEquals(Mensaje.NOMBRE_LONGITUD.getMensaje(), exceptionLanzada.getMessage());
    }

    @Test
    public void validarNombreFallaPorFormato(){
        //Cree la semilla
        String nombreMaloFormato = "juan 23";
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.sujetoDePrueba.validarNombre(nombreMaloFormato));
        Assertions.assertEquals(Mensaje.NOMBRE_FORMATO.getMensaje(), exceptionLanzada.getMessage());

    }
    @Test
    public void validarNombreEjecutaConExito(){
        String nombreBueno = "juan diego";
        Assertions.assertDoesNotThrow(()->this.sujetoDePrueba.validarNombre(nombreBueno));
    }

    @Test
    public void validarCorreoFormato(){
        String correoMalo = "cagudeloc@cesde.net";
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.sujetoDePrueba.validarCorreo(correoMalo));
        Assertions.assertEquals(Mensaje.CORREO_FORMATO.getMensaje(), exceptionLanzada.getMessage());
    }

    @Test
    public void validarCorreoConExito(){
        String correoBueno = "caren.agudelo@globant.com";
        Assertions.assertDoesNotThrow(()->this.sujetoDePrueba.validarCorreo(correoBueno));
    }

    @Test
    public void validarTelefono(){
        String telefonoMalo = "12345";
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.sujetoDePrueba.validarTelefono(telefonoMalo));
        Assertions.assertEquals(Mensaje.TELEFONO_LONGITUD.getMensaje(), exceptionLanzada.getMessage());
    }

    @Test
    public void validarTelefonoConExito(){
        String telefonoBueno = "1234567890";
        Assertions.assertDoesNotThrow(()->this.sujetoDePrueba.validarTelefono(telefonoBueno));
    }



}
