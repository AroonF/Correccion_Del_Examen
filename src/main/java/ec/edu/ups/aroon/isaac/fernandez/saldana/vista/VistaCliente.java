/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.vista;

import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Cliente;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aroon
 */
public class VistaCliente {
    private Scanner entrada;

    public VistaCliente() {
        entrada = new Scanner(System.in );
    }
    
    public Cliente ingresarCliente(){
        entrada = new Scanner(System.in );
        System.out.println("Ingrese datos del cliente");
        String cedula= entrada.next();
        String nombre = entrada.next();
        String apellido= entrada.next();
        String direccion= entrada.next();
        int telefono = entrada.nextInt();
        return new Cliente(cedula, nombre, apellido, direccion, telefono);
    }
    
    public Cliente actualizarCliente(){
        entrada = new Scanner(System.in);
        System.out.println("Ingrese la cedula para actualizar");
        String cedula = entrada.next();
        System.out.println("Ingrese los nuevos datos");
        String nombre = entrada.next();
        String apellido = entrada.next();
        String direccion= entrada.next();
        int telefono = entrada.nextInt();
        return new Cliente(cedula, nombre, apellido, direccion, telefono);
    }
    
     public String buscarCliente() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el id de la direccion a buscar");
        String cedula = entrada.next();
        return cedula;
    }
     
    public Cliente eliminarCliente(){
        entrada = new Scanner(System.in);
        System.out.println("Ingrese la cedula para eliminar");
        String cedula = entrada.next();
        return  new Cliente(cedula, null, null, null, 0);
    }
    
     public void verCliente(Cliente cliente) {
        System.out.println("Datos del cliente: " + cliente);
    }

    public void verClientes(List<Cliente> clientes){
        for (Cliente cliente : clientes) {
            System.out.println("Datos del cliete: " + cliente);
        }
    }
}
