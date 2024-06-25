package org.example.helpers.validaciones;

import org.example.helpers.generals.General;
import org.example.helpers.generals.Mensaje;

public class MarcaValidacion {

    private General general = new General();


    public boolean validarNombre(String nombre) throws Exception{
        if(nombre.length()>50){//se pasó de caracteres
            throw new Exception(Mensaje.MARCA_NOMBRE_LONGITUD.getMensaje());
        }
        return true;
    }

    public boolean validarPais(String pais) throws Exception{
        String regex = "^[a-zA-Z]{1,10}$";

        boolean coincidencia = this.general.validarRegex(regex, pais);

        if (!coincidencia){
            throw new Exception(Mensaje.MARCA_PAIS_FORMATO.getMensaje());
        }
        return true;
    }

    public boolean validarEmail(String email) throws Exception{
        String regex =  "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@globant\\.com$";

        boolean coincidencia = this.general.validarRegex(regex, email);

        if(!coincidencia){
            throw new Exception(Mensaje.MARCA_CORREO_FORMATO.getMensaje());
        }

        return true;
    }
}
