/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.reservas.dao.mysql;

import pe.edu.cibertec.reservas.dao.factory.DAOFactory;
import pe.edu.cibertec.reservas.dao.interfaces.CanchaDAO;
import pe.edu.cibertec.reservas.dao.interfaces.ClienteDAO;
import pe.edu.cibertec.reservas.dao.interfaces.UsuarioDAO;
import pe.edu.cibertec.reservas.dao.interfaces.VentaDAO;


/**
 *
 * @author Instructor
 */
public class MySQLDAOFactory extends DAOFactory{

    @Override
    public UsuarioDAO getUsuarioDAO() {
        return new MySQLUsuarioDAO();
    }


    @Override
    public ClienteDAO getClienteDAO() {
        return new MySQLClienteDAO();
    }

    @Override
    public VentaDAO getVentaDAO() {
        return new MySQLVentaDAO();
    }

    @Override
    public CanchaDAO getCanchaDAO() {
        return new MySQLCanchaDAO();
    }


}
