/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.reservas.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import pe.edu.cibertec.reservas.dao.factory.DAOFactory;

/**
 *
 * @author Instructor
 */
public class UtilDAO {
    public static Connection getConnection(int tipoBD) throws Exception {
        //Con el uso del throws, ya no sera necesario el try y catch
        Connection conn = null;
        String driver = ""; //driver jdbc
        String url = ""; //cadena de conexion
        String usuario = ""; //usuario de BD
        String password = "";  //password de BD
        switch (tipoBD){
            case DAOFactory.MYSQL: driver = "com.mysql.jdbc.Driver";
                                                        url = "jdbc:mysql://localhost:3306/reservas";
                                                        usuario = "root";
                                                        password = "admin";
                                                        break;
            case DAOFactory.SQL_SERVER:  driver = "";
                                                                    url = "";
                                                                    usuario = "";
                                                                    password = "";
                                                                    break;
        }
        Class.forName(driver);
        conn = DriverManager.getConnection(url, usuario, password);
        return conn;
    }
}
