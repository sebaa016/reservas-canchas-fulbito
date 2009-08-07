    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.security.control;

import pe.edu.cibertec.security.bean.Usuario;
import pe.edu.cibertec.reservas.dao.factory.DAOFactory;
import pe.edu.cibertec.reservas.dao.interfaces.UsuarioDAO;

/**
 *
 * @author Instructor
 */
public class GestorUsuario {

    public static Usuario validarUsuario(String login, String password){
        Usuario usuario = null;
        DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        UsuarioDAO usuarioDAO = daoFactory.getUsuarioDAO(); //Uso de polimorfismo
        usuario = usuarioDAO.validarUsuario(login, password); //Uso de polimorfismo

        return usuario;
    }
}
