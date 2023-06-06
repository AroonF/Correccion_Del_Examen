/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.aroon.isaac.fernandez.saldana.controlador;

import ec.edu.ups.aroon.isaac.fernandez.saldana.idao.IClienteDao;
import ec.edu.ups.aroon.isaac.fernandez.saldana.modelo.Cliente;
import ec.edu.ups.aroon.isaac.fernandez.saldana.vista.VistaCliente;
import java.util.List;

/**
 *
 * @author aroon
 */
public class ContrladorCliente {
    private VistaCliente vistaCliente;
    private Cliente cliente;
    private IClienteDao clienteDAO;

    public ContrladorCliente(VistaCliente vistaCliente, IClienteDao clienteDAO) {
        this.vistaCliente = vistaCliente;
        this.clienteDAO = clienteDAO;
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
}
