/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.idao;

import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Cliente;
import java.util.List;

/**
 *
 * @author aroon
 */
public interface IClienteDao {
    public void create(Cliente cliente);
    public Cliente read(String cedula);
    public void update(Cliente cliente);
    public void delete(Cliente cliente);
    public List<Cliente> findAll();
}
