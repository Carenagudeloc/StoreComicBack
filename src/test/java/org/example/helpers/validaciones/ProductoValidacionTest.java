package org.example.helpers.validaciones;

import org.example.helpers.generals.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoValidacionTest {

    private ProductoValidacion sujetoDePrueba;

    @BeforeEach
    public void configuracionInicial(){
        this.sujetoDePrueba = new ProductoValidacion();
    }

    @Test
    public void validarNombreFuncionConErrores() {
        String nombreIngresadoInvalido = "svdvxv11";
        Exception excepcionLanzada = Assertions.assertThrows(Exception.class,()->this.sujetoDePrueba.validarNombre(nombreIngresadoInvalido));
        Assertions.assertEquals(Mensaje.PRODUCTO_NOMBRE_FORMATO.getMensaje(), excepcionLanzada.getMessage());
    }

    @Test
    public void validarNombreFuncionaCorrectamente() {
        String nombreIngresadoValido = "Figura SuperMan";
        Assertions.assertDoesNotThrow(()->this.sujetoDePrueba.validarNombre(nombreIngresadoValido));
    }

    @Test
    public void validarPrecioUnitarioConErrores() {
        Integer precioUnitarioNoValido = -10000;
        Exception excepcionLanzada = Assertions.assertThrows(Exception.class,()->this.sujetoDePrueba.validarPrecioUnitario(precioUnitarioNoValido));
        Assertions.assertEquals(Mensaje.PRODUCTO_PRECIOUNITARIO_FORMATO.getMensaje(), excepcionLanzada.getMessage());
    }

    @Test
    public void validarPrecioUnitarioSinErrores(){
        Integer precioUnitarioValido = 10000;
        Assertions.assertDoesNotThrow(()->this.sujetoDePrueba.validarPrecioUnitario(precioUnitarioValido));
    }

    @Test
    public void validarDescripcionConErrores() {
        String descripcionNoValida = "kjancjsdnjdnvd aonfcajdnvjsdfnvjsd OAIJDXOAINFCSANCnjdskvnxk akcnskdjnvkjdsnvkjdnv snvcs" +
                "sldvnsknvdkfdnvdkfkvl";
        Exception excepcionLanzada = Assertions.assertThrows(Exception.class,()->this.sujetoDePrueba.validarDescripcion(descripcionNoValida));
        Assertions.assertEquals(Mensaje.PRODUCTO_DESCRIPCION_FORMATO.getMensaje(), excepcionLanzada.getMessage());
    }

    @Test
    public void validarDescripcionSinErrores(){
        String descripcionValida = "Este producto se encuentra en descuento";
        Assertions.assertDoesNotThrow(()->this.sujetoDePrueba.validarDescripcion(descripcionValida));
    }

    @Test
    public void validarResenaConErrores() {
        String resenaNoValida = "El Funko que encontré en la tienda de cómics es simplemente increíble. Su nivel" +
                " de detalle y calidad de fabricación es impresionante. Es el complemento perfecto para cualquier " +
                "fanático de los cómics. ¡Definitivamente una adición obligatoria a cualquier colección!";
        Exception excepcionLanzada = Assertions.assertThrows(Exception.class,()->this.sujetoDePrueba.validarReseña(resenaNoValida));
        Assertions.assertEquals(Mensaje.PRODUCTO_RESEÑA_FORMATO.getMensaje(), excepcionLanzada.getMessage());
    }

    @Test
    public void validarResenaSinErrores() {
        String resenaValida = "Un Funko imprescindible para los fans de los cómics.";
        Assertions.assertDoesNotThrow(()->this.sujetoDePrueba.validarReseña(resenaValida));

    }
}