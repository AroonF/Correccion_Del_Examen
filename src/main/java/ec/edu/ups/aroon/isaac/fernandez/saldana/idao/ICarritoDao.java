/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.idao;

import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.CarritoCompra;
import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Producto;
import java.util.List;

/**
 *
 * @author aroon
 */
public interface ICarritoDao {
   public void create(CarritoCompra carrito);
    public CarritoCompra read(List<Producto> listaproducto);
    public void update(CarritoCompra carrito);
    public void delete(CarritoCompra carrito);
    public List<CarritoCompra> findAll();
}
