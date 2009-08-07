/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.ventas.dao.interfaces;

import java.util.ArrayList;
import pe.edu.cibertec.ventas.bean.Cliente;

/**
 *
 * @author Instructor
 */
public interface ClienteDAO {
    ArrayList queryAll();
    Cliente queryById(int id);
    void add(Cliente p);
    void update(Cliente p);
    void delete(int id);
}
