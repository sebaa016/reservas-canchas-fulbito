/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.reservas.dao.factory;

import pe.edu.cibertec.reservas.dao.interfaces.ClienteDAO;
import pe.edu.cibertec.reservas.dao.interfaces.UsuarioDAO;
import pe.edu.cibertec.reservas.dao.interfaces.VentaDAO;
import pe.edu.cibertec.reservas.dao.mysql.MySQLDAOFactory;
import pe.edu.cibertec.reservas.dao.sqlserver.SQLServerDAOFactory;

/**
 *
 * @author Instructor
 */
public abstract class DAOFactory {
    public static final int MYSQL = 1;
    public static final int SQL_SERVER = 2;
    
    public static DAOFactory getDAOFactory(int tipoBD){
        DAOFactory daoFactory = null;
        switch (tipoBD){
            case MYSQL: daoFactory = new MySQLDAOFactory();
                                    break;
            case SQL_SERVER: daoFactory = new SQLServerDAOFactory();
                                              break;
        }
        return daoFactory;
    }

    public abstract UsuarioDAO getUsuarioDAO();
    public abstract ClienteDAO getClienteDAO();
    public abstract VentaDAO getVentaDAO();

}
