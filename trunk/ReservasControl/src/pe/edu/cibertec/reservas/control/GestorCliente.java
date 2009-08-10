/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.reservas.control;

import java.util.ArrayList;
import pe.edu.cibertec.reservas.bean.Cliente;
import pe.edu.cibertec.reservas.dao.factory.DAOFactory;
import pe.edu.cibertec.reservas.dao.interfaces.ClienteDAO;

/**
 *
 * @author Instructor
 */
public class GestorCliente {
    private static DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
    private static ClienteDAO clienteDAO = daoFactory.getClienteDAO();

    public static void add(Cliente cliente){
        clienteDAO.add(cliente);
    }

    public static void update(Cliente cliente){
        clienteDAO.update(cliente);
    }

    public static void delete(int codigo){
       clienteDAO.delete(codigo);
    }

    public static ArrayList queryAll(){
        return clienteDAO.queryAll();
    }

    public static Cliente queryById(int codigo){
        return clienteDAO.queryById(codigo);
    }
}
