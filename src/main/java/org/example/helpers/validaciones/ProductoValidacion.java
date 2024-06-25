package org.example.helpers.validaciones;

import org.example.helpers.generals.General;
import org.example.helpers.generals.Mensaje;

public class ProductoValidacion {

    private General general = new General();

    public boolean validarNombre(String nombre)throws Exception{
        String regex = "^[a-zA-Z ]{1,80}$";

        boolean coincidencia = this.general.validarRegex(regex, nombre);

        if(!coincidencia){
            throw new Exception(Mensaje.PRODUCTO_NOMBRE_FORMATO.getMensaje());
        }
        return true;

    }

    public boolean validarPrecioUnitario(double precioUnitario) throws Exception{
        String cadena = String.valueOf(precioUnitario);
        String regex = "^[1-9]\\d*(\\.\\d+)?$";

        boolean coincidencia = this.general.validarRegex(regex, cadena);

        if(!coincidencia){
            throw new Exception(Mensaje.PRODUCTO_PRECIOUNITARIO_FORMATO.getMensaje());
        }
        return true;
    }

    public boolean validarDescripcion(String descripcion) throws Exception{
        if(descripcion.length()>80){
            throw new Exception(Mensaje.PRODUCTO_DESCRIPCION_FORMATO.getMensaje());
        }
        return true;
    }

    public boolean validarReseña(String reseña) throws Exception{
        if(reseña.length()>100){
            throw new Exception(Mensaje.PRODUCTO_RESEÑA_FORMATO.getMensaje());
        }
        return true;
    }

}
