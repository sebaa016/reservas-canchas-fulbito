/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.ventas.dao.mysql;

import pe.edu.cibertec.ventas.dao.factory.DAOFactory;
import pe.edu.cibertec.ventas.dao.interfaces.ClienteDAO;
import pe.edu.cibertec.ventas.dao.interfaces.ProductoDAO;
import pe.edu.cibertec.ventas.dao.interfaces.UsuarioDAO;
import pe.edu.cibertec.ventas.dao.interfaces.VentaDAO;


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
    public ProductoDAO getProductoDAO() {
        return new MySQLProductoDAO();
    }

    @Override
    public ClienteDAO getClienteDAO() {
        return new MySQLClienteDAO();
    }

    @Override
    public VentaDAO getVentaDAO() {
        return new MySQLVentaDAO();
    }



}
