package org.example.helpers.generals;

public enum Mensaje {

    NOMBRE_LONGITUD("El nombre ingresado debe tener menos de 70 caracteres"),
    NOMBRE_FORMATO("El nombre solo puede contener letras y espacios"),
    CORREO_FORMATO("El correo debe tener la forma: correo@globant.com"),
    TELEFONO_LONGITUD("El numero de telefono no puede tener mas o menos de 10 digitos"),
    MARCA_NOMBRE_LONGITUD("El nombre ingresado debe tener menos de 50 caracteres"),
    MARCA_PAIS_FORMATO("El país solo puede contener letras y espacios y máximo 10 caracteres"),
    MARCA_CORREO_FORMATO("El correo debe tener la forma: correo@globant.com"),
    PRODUCTO_NOMBRE_FORMATO("El nombre del producto solo puede contener letras y espacios y máximo 80 caracteres"),
    PRODUCTO_PRECIOUNITARIO_FORMATO("El precio del producto solo puede contener números positivos"),
    PRODUCTO_DESCRIPCION_FORMATO("La descripcion del producto no puede tener mas de 80 caracteres"),
    PRODUCTO_RESEÑA_FORMATO("La reseña del producto no puede tener mas de 100 caracteres")

    ;

    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
