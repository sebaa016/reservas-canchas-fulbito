/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.ventas.dao.interfaces;

import java.util.ArrayList;
import pe.edu.cibertec.ventas.bean.Producto;

/**
 *
 * @author Instructor
 */
public interface ProductoDAO {
    ArrayList queryAll();
    Producto queryById(int id);
    void add(Producto p);
    void update(Producto p);
    void delete(int id);
}
