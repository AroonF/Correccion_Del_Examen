/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.modelo;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author aroon
 */
public class CarritoCompra {
    private GregorianCalendar fechaHora;
    private long subTotal;
    private long pagarIVA;
    private long totalPagar;
    private List<Cliente> listaCliente;
    private List<Producto> listaProducto;

    public CarritoCompra(GregorianCalendar fechaHora, long subTotal, long pagarIVA, long totalPagar, List<Cliente> listaCliente, List<Producto> listaProducto) {
        this.fechaHora = fechaHora;
        this.subTotal = subTotal;
        this.pagarIVA = pagarIVA;
        this.totalPagar = totalPagar;
        this.listaCliente = listaCliente;
        this.listaProducto =  listaProducto;
    }

    public GregorianCalendar getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(GregorianCalendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    public long getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(long subTotal) {
        this.subTotal = subTotal;
    }

    public long getPagarIVA() {
        return pagarIVA;
    }

    public void setPagarIVA(long pagarIVA) {
        this.pagarIVA = pagarIVA;
    }

    public long getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(long totalPagar) {
        this.totalPagar = totalPagar;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
    
    public void agregarProducto(Producto producto) {
        listaProducto.add(producto);
    }

    public void actualizarProducto(Producto producto) {
        if (listaProducto.contains(producto)) {
            int index = listaProducto.indexOf(producto);
            listaProducto.set(index, producto);
        }
    }

    public void eliminarProducto(Producto producto) {
        if (listaProducto.contains(producto)) {
            int index = listaProducto.indexOf(producto);
            listaProducto.remove(index);
        }
    }

    public List<Producto> listar() {
        return listaProducto;
    }
    
     public void agregarCliente(Cliente cliente) {
        listaCliente.add(cliente);
    }
    public void actualizarCliente(Cliente cliente) {
        if (listaCliente.contains(cliente)) {
            int index = listaProducto.indexOf(cliente);
            listaCliente.set(index, cliente);
        }
    }

    public void eliminarCliente(Cliente cliente) {
        if (listaCliente.contains(cliente)) {
            int index = listaCliente.indexOf(cliente);
            listaCliente.remove(index);
        }
    }
    
    public List<Cliente> listarC(){
        return listaCliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.fechaHora);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CarritoCompra other = (CarritoCompra) obj;
        if  (this.totalPagar != other.totalPagar){
            return false;
        }
        return true;
    }  

    @Override
    public String toString() {
        return "Carrito{" + "fechaHora=" + fechaHora + ", subTotal=" + subTotal + ", pagarIVA=" + pagarIVA + ", totalPagar=" + totalPagar + ", listaCliente=" + listaCliente + ", listaProducto=" + listaProducto + '}';
    }   
}
