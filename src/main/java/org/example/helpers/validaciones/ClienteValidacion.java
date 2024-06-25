package org.example.helpers.validaciones;

import org.example.helpers.generals.General;
import org.example.helpers.generals.Mensaje;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClienteValidacion {
    //Inyectando la dependencia a la clase general
    private General general = new General();

    //Las clases de validación normalmente solo tienen métodos con la lógica de validación

    public boolean validarNombre (String nombres) throws Exception {

        //Establecer rutinas para validar el campo nombres, segun las reglas del negocio

        //1.La cadena del nombre solo puede tener hasta 70 caracteres
        if(nombres.length()>70){//se pasó de caracteres
            throw new Exception(Mensaje.NOMBRE_LONGITUD.getMensaje());
        }

        //2.La cadena del nombre solo puede tener letras aA zZ y espacios
        //Pasos para aplicar in REGEX
        String regex="^[a-zA-Z ]+$";

        boolean coincidencia = this.general.validarRegex(regex, nombres);

        if(!coincidencia){//No hubo coincidencia
            throw new Exception(Mensaje.NOMBRE_FORMATO.getMensaje());
        }
        //Retorno true si todas las validaciones pasan con exito
        return true;
    }
    public boolean validarCorreo(String correo) throws Exception {
        String regex =  "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@globant\\.com$";

        boolean coincidencia = this.general.validarRegex(regex, correo);

        if(!coincidencia){
            throw new Exception(Mensaje.CORREO_FORMATO.getMensaje());
        }

        return true;
    }
    public  boolean validarFechaRegistro(LocalDate fechaIngreso) {
        return true;
    }

    public  boolean validarTelefono(String telefono) throws Exception{
        String regex = "^\\d{10}$";

        boolean coincidencia = this.general.validarRegex(regex, telefono);

        if (!coincidencia){
            throw new Exception(Mensaje.TELEFONO_LONGITUD.getMensaje());
        }
        return true;
    }
}
