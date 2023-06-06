/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.controlador;

import ec.edu.ups.aroon.isaac.fernandez.saldana.idao.ICarritoDao;
import ec.edu.ups.aroon.isaac.fernandez.saldana.idao.IClienteDao;
import ec.edu.ups.aroon.isaac.fernandez.saldana.idao.IProductoDao;
import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.CarritoCompra;
import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Cliente;
import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Producto;
import ec.edu.ups.aroon.isaac.fernandez.saldana.vista.VistaCarrito;
import ec.edu.ups.aroon.isaac.fernandez.saldana.vista.VistaCliente;
import ec.edu.ups.aroon.isaac.fernandez.saldana.vista.VistaProducto;

/**
 *
 * @author aroon
 */
public class ControladorCarrito {
    private VistaCliente vistaCliente;
    private VistaProducto vistaProducto;
    private VistaCarrito vistaCarrito;
    private Cliente cliente;
    private Producto producto;
    private CarritoCompra carrito;
    private IClienteDao clienteDAO;
    private IProductoDao productoDAO;
    private ICarritoDao carritoDAO;    

    public ControladorCarrito(VistaCliente vistaCliente, VistaProducto vistaProducto, VistaCarrito vistaCarrito, Cliente cliente, Producto producto, CarritoCompra carrito, IClienteDao clienteDAO, IProductoDao productoDAO, ICarritoDao carritoDAO) {
        this.vistaCliente = vistaCliente;
        this.vistaProducto = vistaProducto;
        this.vistaCarrito = vistaCarrito;
        this.cliente = cliente;
        this.producto = producto;
        this.carrito = carrito;
        this.clienteDAO = clienteDAO;
        this.productoDAO = productoDAO;
        this.carritoDAO = carritoDAO;
    }
   
    public void registrar() {
        cliente = vistaCliente.ingresarCliente();
        clienteDAO.create(cliente);
    }

    public void verCliente() {
        String cedula = vistaCliente.buscarCliente();
        cliente = clienteDAO.read(cedula);
        vistaCliente.verCliente(cliente);
    }

    public void actualizar() {
        cliente = vistaCliente.actualizarCliente();
        clienteDAO.update(cliente);
    }

    public void eliminar() {
        cliente = vistaCliente.eliminarCliente();
        clienteDAO.delete(cliente);
    }

    public void verClientes() {
        List<Cliente> clientes;
        clientes = clienteDAO.findAll();
        vistaCliente.verClientes(clientes);
    }
    
    //ejemplo de agregacion
    public void agregarDireccion(){
        int id = vistaDireccion.buscarDireccion();
        direccion = direccionDAO.read(id);
        cliente.agregarDireccion(direccion);
        clienteDAO.update(cliente);        
    }
}
