/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.vista;

import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Producto;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aroon
 */
public class VistaProducto{
    private Scanner entrada;

    public VistaProducto(){
        entrada = new Scanner(System.in);
    }
    
    public Producto ingreseProducto(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa los datos de la direccion");
        int codigo = entrada.nextInt();
        String nombre= entrada.next();
        String descripcion = entrada.next();
        long precio = entrada.nextLong();
        return new Producto(codigo, nombre, descripcion, precio);
    }
    
    public Producto actualizarProducto() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo del producto");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese nuevos datos");
        String nombre= entrada.next();
        String descripcion = entrada.next();
        long precio = entrada.nextLong();
        return new Producto(codigo, nombre, descripcion, precio);
    }
    
     public int buscarProducto() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el id de la direccion a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }
    
     public Producto eliminarProducto() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo para eliminar");
        int codigo = entrada.nextInt();
        return new Producto(codigo, null, null, 0);
    }
     
      public void verProducto(Producto producto) {
        System.out.println("Datos del Producto: " + producto);
    }

    public void verProductos(List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println("Datos del producto: " + producto);
        }
    }
}
