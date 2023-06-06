/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.dao;

import ec.edu.ups.aroon.isaac.fernandez.saldana.idao.ICarritoDao;
import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.CarritoCompra;
import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Producto;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author aroon
 */
public class CarritoDAO implements ICarritoDao {
    private List<CarritoCompra> listaCarrito;
@Override
    public void create(CarritoCompra carrito) {
        listaCarrito.add(carrito);
    }

    @Override
    public CarritoCompra read(List<Producto> listaproducto) {
     for(CarritoCompra carrito : listaCarrito){
            if(carrito.getListaProducto()== listaproducto){
             return carrito;   
            }
        }
        return null;    
    }

    @Override
    public void update(CarritoCompra carrito) {
         for (int i=0; i<listaCarrito.size(); i++){
            CarritoCompra cp = listaCarrito.get(i);
            if(cp.getListaProducto().equals(carrito));
            listaCarrito.set(i, carrito);
            break;
        }
    }

    @Override
    public void delete(CarritoCompra carrito) {
         Iterator<CarritoCompra> it = listaCarrito.iterator();
        while (it.hasNext()) {
            CarritoCompra cr = it.next();
            if (cr.getListaProducto()== carrito.getListaProducto()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<CarritoCompra> findAll() {
        System.out.println();
        return null;
    }
}
