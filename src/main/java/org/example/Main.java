package org.example;

import org.example.helpers.generals.Mensaje;
import org.example.models.Cliente;
import org.example.models.Factura;
import org.example.models.Marca;
import org.example.models.Producto;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Marca marca = new Marca();
        Producto producto = new Producto();

        //intentar agregar un nombre al cliente desde la consola
        Scanner lea = new Scanner(System.in);

        //System.out.print("Digita el nombre del cliente: ");
        //cliente.setNombreApellido(lea.nextLine());

       //System.out.print("Digita el correo del cliente: ");
        //cliente.setEmail(lea.nextLine());

        //System.out.print("Digita el telefono del cliente: ");
        //cliente.setTelefono(lea.nextLine());

        //System.out.print("Digita el nombre de la marca del producto: ");
        //marca.setNombre(lea.nextLine());

        //System.out.print("Digita el nombre del país del producto: ");
        //marca.setPais(lea.nextLine());

        //System.out.print("Digita el correo de la marca del producto: ");
        //marca.setEmail(lea.nextLine());

        //System.out.print("Ingrese el nombre del producto: ");
        //producto.setNombre(lea.nextLine());
        /*try {
        System.out.print("Ingrese el precio unitario del producto: ");
        producto.setPrecioUnitario(lea.nextDouble());
        }catch (Exception e){
        System.out.println(Mensaje.PRODUCTO_PRECIOUNITARIO_FORMATO.getMensaje());
        }*/

        //System.out.print("Ingrese la descripción del producto: ");
        //producto.setDescripcion(lea.nextLine());

        //System.out.print("Ingrese la reseña del producto: ");
        //producto.setReseña(lea.nextLine());

    }
}