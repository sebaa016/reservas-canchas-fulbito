/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.ventas.dao.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.edu.cibertec.security.bean.Usuario;
import pe.edu.cibertec.ventas.dao.factory.DAOFactory;
import pe.edu.cibertec.ventas.dao.interfaces.UsuarioDAO;
import pe.edu.cibertec.ventas.dao.util.UtilDAO;

/**
 *
 * @author Instructor
 */
public class MySQLUsuarioDAO implements UsuarioDAO{

    public Usuario validarUsuario(String login, String password) {
        Usuario usuario = null;
        //Recetario para el acceso a la BD
        Connection conn = null;
        //PreparedStatement pstmt = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        try {
            //1 y 2. Se registra el driver y se obtiene la conexion a la BD
            conn = UtilDAO.getConnection(DAOFactory.MYSQL);
            //3. Se prepara la sentencia SQL
            //String sql = "SELECT * FROM Usuario WHERE login=? AND password=?";
            //pstmt = conn.prepareStatement(sql);
            //pstmt.setString(1, login);
            //pstmt.setString(2, password);

            String sql = "{call usp_validarUsuario(?,?)}";
            cstmt = conn.prepareCall(sql);
            cstmt.setString(1, login);
            cstmt.setString(2, password);

            //4. Se ejecuta la sentencia SQL
            //rs = pstmt.executeQuery();
            rs = cstmt.executeQuery();

            //5. Se interpretan los resultados
            if (rs.next()){
                usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setLogin(login);
                usuario.setNombre(rs.getString("nombre"));
                usuario.setRol(rs.getString("rol"));
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           //6. Se cierran los objetos de conexion
            if (rs != null ) try {rs.close(); } catch(Exception e) {e.printStackTrace();}
            //if (pstmt != null ) try {pstmt.close(); } catch(Exception e) {e.printStackTrace();}
            if (cstmt != null ) try {cstmt.close(); } catch(Exception e) {e.printStackTrace();}
            if (conn != null ) try {conn.close(); } catch(Exception e) {e.printStackTrace();}
        }

        return usuario;
    }
}
