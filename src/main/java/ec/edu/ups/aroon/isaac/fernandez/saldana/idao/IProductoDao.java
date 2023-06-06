/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.idao;

import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Producto;
import java.util.List;

/**
 *
 * @author aroon
 */
public interface IProductoDao {
    public void create(Producto producto);
    public Producto read(long codigo);
    public void update(Producto producto);
    public void delete(Producto producto);
    public List<Producto> findAll();
}
