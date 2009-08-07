/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.ventas.dao.sqlserver;

import pe.edu.cibertec.ventas.dao.factory.DAOFactory;
import pe.edu.cibertec.ventas.dao.interfaces.ClienteDAO;
import pe.edu.cibertec.ventas.dao.interfaces.ProductoDAO;
import pe.edu.cibertec.ventas.dao.interfaces.UsuarioDAO;
import pe.edu.cibertec.ventas.dao.interfaces.VentaDAO;

/**
 *
 * @author Instructor
 */
public class SQLServerDAOFactory extends DAOFactory {

    @Override
    public UsuarioDAO getUsuarioDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ProductoDAO getProductoDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ClienteDAO getClienteDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public VentaDAO getVentaDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
