/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.reservas.dao.interfaces;

import pe.edu.cibertec.security.bean.Usuario;


/**
 *
 * @author Instructor
 */
public interface UsuarioDAO {
    Usuario validarUsuario(String login, String password);
}
