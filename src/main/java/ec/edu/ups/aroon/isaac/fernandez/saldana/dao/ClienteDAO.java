/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.dao;

import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ec.edu.ups.aroon.isaac.fernandez.saldana.idao.IClienteDao;

/**
 *
 * @author aroon
 */
public class ClienteDAO implements IClienteDao{
    private List<Cliente> listaClientes;

    public ClienteDAO() {
        listaClientes = new ArrayList<>();
    }
    
    @Override
    public void create(Cliente cliente) {
        listaClientes.add(cliente);
    }

    @Override
    public Cliente read(String cedula) {
        for(Cliente cliente : listaClientes){
            if(cliente.getCedula()== cedula){
             return cliente;   
            }
        }
        return null;    
    }

    @Override
    public void update(Cliente cliente) {
        for (int i=0; i<listaClientes.size(); i++){
            Cliente c = listaClientes.get(i);
            if(c.getCedula().equals(cliente));
            listaClientes.set(i, cliente);
            break;
        }
    }

    @Override
    public void delete(Cliente cliente) {
        Iterator<Cliente> it = listaClientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getCedula() == cliente.getCedula()) {
                it.remove();
                break;
            }
        }
    }
    
    @Override
    public List<Cliente> findAll() {
        System.out.println();
        return null;
    }
    
}
