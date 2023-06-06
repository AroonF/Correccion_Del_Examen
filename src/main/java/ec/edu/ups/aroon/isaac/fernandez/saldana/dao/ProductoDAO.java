/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.dao;

import ec.edu.ups.aroon.isaac.fernandez.saldana.idao.IProductoDao;
import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Producto;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author aroon
 */
public class ProductoDAO implements IProductoDao{
    private List<Producto> listaProductos;

    @Override
    public void create(Producto producto) {
        listaProductos.add(producto);
    }

    @Override
    public Producto read(long codigo) {
        for(Producto producto : listaProductos){
            if(producto.getCodigo()== codigo){
             return producto;   
            }
        }
        return null;    
    }

    @Override
    public void update(Producto producto) {
         for (int i=0; i<listaProductos.size(); i++){
            Producto p = listaProductos.get(i);
            if(p.getNombre().equals(producto));
            listaProductos.set(i, p);
            break;
        }
    }

    @Override
    public void delete(Producto producto) {
        Iterator<Producto> it = listaProductos.iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            if (p.getCodigo() == producto.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Producto> findAll() {
        System.out.println();
        return null;
    }    
}
