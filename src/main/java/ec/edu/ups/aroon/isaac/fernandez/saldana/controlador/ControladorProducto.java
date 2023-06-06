/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.controlador;

import ec.edu.ups.aroon.isaac.fernandez.saldana.idao.IProductoDao;
import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Producto;
import ec.edu.ups.aroon.isaac.fernandez.saldana.vista.VistaProducto;
import java.util.List;

/**
 *
 * @author aroon
 */
public class ControladorProducto {
    private VistaProducto vistaProducto;
    private  Producto producto;
    private IProductoDao productoDAO;

    public ControladorProducto(VistaProducto vistaProducto, Producto producto, IProductoDao productoDAO) {
        this.vistaProducto = vistaProducto;
        this.producto = producto;
        this.productoDAO = productoDAO;
    }

    public void registrar() {
        producto = vistaProducto.ingreseProducto();
        productoDAO.create(producto);
    }
    
    public void verProducto() {
        int codigo = vistaProducto.buscarProducto();
        producto = productoDAO.read(codigo);
        vistaProducto.verProducto(producto);
    }
    
    public void actualizar() {
        producto = vistaProducto.actualizarProducto();
        productoDAO.update(producto);
    }

    public void eliminar() {
        producto = vistaProducto.eliminarProducto();
        productoDAO.delete(producto);
    }

    public void verProductos() {
        List<Producto> productos;
        productos = productoDAO.findAll();
        vistaProducto.verProductos(productos);
    }
}
