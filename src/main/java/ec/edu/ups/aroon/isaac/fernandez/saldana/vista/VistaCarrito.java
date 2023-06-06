/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.vista;

import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.CarritoCompra;
import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Cliente;
import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Producto;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aroon
 */
public class VistaCarrito {
    private Scanner entrada;

    public VistaCarrito() {
        entrada = new Scanner(System.in);
    }
    public CarritoCompra ingresarCarrito(){
        entrada = new Scanner(System.in );
        System.out.println("Ingrese la lista de Datos");
        
        long subTotal= entrada.nextLong();
        long pagarIVA = entrada.nextLong();
        long totalPagar = entrada.nextLong();
        
        return new CarritoCompra(fechaHora, subTotal, pagarIVA, totalPagar, listaCliente, listaProducto);
    }
    
      public CarritoCompra actualizarCliente(){
        entrada = new Scanner(System.in);
        System.out.println("Ingrese la cedula para actualizar");
        String listaCliente = entrada.next();
        System.out.println("Ingrese los nuevos datos");
        String listaProducto = entrada.next();
        long subTotal =entrada.nextLong();
        long pagarIVA = entrada.nextLong();
        long totalPagar = entrada.nextLong();
        return new CarritoCompra(fechaHora, subTotal, pagarIVA, totalPagar, listaCliente, listaProducto);
    }
     
    public CarritoCompra eliminarCarrito(){
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el cliente para eliminar");
        String listaCliente = entrada.next();
        return  new CarritoCompra(null, 0, 0, 0, listaCliente, null);
    }
    
     public void verCarrito(CarritoCompra carritoCompra) {
        System.out.println("Datos del carrito " + carritoCompra);
    }

    public void verCarrito(List<CarritoCompra> carritoc){
        for (CarritoCompra carritoCompra : carritoc) {
            System.out.println("Datos del carrito: " + carritoCompra);
        }
    }
}
