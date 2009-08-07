/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.ventas.dao.mysql;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.cibertec.ventas.bean.Producto;
import pe.edu.cibertec.ventas.dao.factory.DAOFactory;
import pe.edu.cibertec.ventas.dao.interfaces.ProductoDAO;
import pe.edu.cibertec.ventas.dao.util.UtilDAO;

/**
 *
 * @author Instructor
 */
public class MySQLProductoDAO implements ProductoDAO{

    public ArrayList queryAll() {
        ArrayList lista = new ArrayList();
        //Recetario para el acceso a la BD
        Connection conn = null;
        //PreparedStatement pstmt = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        try {
            //1 y 2. Se registra el driver y se obtiene la conexion a la BD
            conn = UtilDAO.getConnection(DAOFactory.MYSQL);
            //3. Se prepara la sentencia SQL
            String sql = "{call usp_queryAllProducts()}";
            cstmt = conn.prepareCall(sql);

            //4. Se ejecuta la sentencia SQL
            rs = cstmt.executeQuery();

            //5. Se interpretan los resultados
            while (rs.next()){
                Producto p = new Producto();
                    p.setCodigo(rs.getInt("codigo"));
                    p.setDescripcion(rs.getString("descripcion"));
                    p.setPrecio(rs.getDouble("precio"));
                    p.setStock(rs.getInt("stock"));
                    Blob fotito = rs.getBlob("foto");
                    if (fotito  != null)
                        p.setFoto(fotito.getBinaryStream());
                lista.add(p);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           //6. Se cierran los objetos de conexion
            if (rs != null ) try {rs.close(); } catch(Exception e) {e.printStackTrace();}
            if (cstmt != null ) try {cstmt.close(); } catch(Exception e) {e.printStackTrace();}
            if (conn != null ) try {conn.close(); } catch(Exception e) {e.printStackTrace();}
        }
        return lista;
    }

    public Producto queryById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void add(Producto p) {

        //Recetario para el acceso a la BD
        Connection conn = null;
        //PreparedStatement pstmt = null;
        CallableStatement cstmt = null;
        try {
            //1 y 2. Se registra el driver y se obtiene la conexion a la BD
            conn = UtilDAO.getConnection(DAOFactory.MYSQL);
            //3. Se prepara la sentencia SQL
            String sql = "{call usp_addProducto(?,?,?,?)}";
            cstmt = conn.prepareCall(sql);
            cstmt.setString(1, p.getDescripcion());
            cstmt.setDouble(2, p.getPrecio());
            cstmt.setInt(3, p.getStock());
            cstmt.setBinaryStream(4, (InputStream)p.getFoto());
            //4. Se ejecuta la sentencia SQL
             cstmt.execute();

            //5. Se interpretan los resultados
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           //6. Se cierran los objetos de conexion
            if (cstmt != null ) try {cstmt.close(); } catch(Exception e) {e.printStackTrace();}
            if (conn != null ) try {conn.close(); } catch(Exception e) {e.printStackTrace();}
        }


    }

    public void update(Producto p) {
        //Recetario para el acceso a la BD
        Connection conn = null;
        //PreparedStatement pstmt = null;
        CallableStatement cstmt = null;
        try {
            //1 y 2. Se registra el driver y se obtiene la conexion a la BD
            conn = UtilDAO.getConnection(DAOFactory.MYSQL);
            //3. Se prepara la sentencia SQL
            String sql = "{call usp_updProducto(?,?,?,?,?)}";
            cstmt = conn.prepareCall(sql);
            cstmt.setInt(1, p.getCodigo());
            cstmt.setString(2, p.getDescripcion());
            cstmt.setDouble(3, p.getPrecio());
            cstmt.setInt(4, p.getStock());
            cstmt.setBinaryStream(5, (InputStream)p.getFoto());
            //4. Se ejecuta la sentencia SQL
             cstmt.execute();

            //5. Se interpretan los resultados
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           //6. Se cierran los objetos de conexion
            if (cstmt != null ) try {cstmt.close(); } catch(Exception e) {e.printStackTrace();}
            if (conn != null ) try {conn.close(); } catch(Exception e) {e.printStackTrace();}
        }
    }

    public void delete(int id) {
        //Recetario para el acceso a la BD
        Connection conn = null;
        //PreparedStatement pstmt = null;
        CallableStatement cstmt = null;
        try {
            //1 y 2. Se registra el driver y se obtiene la conexion a la BD
            conn = UtilDAO.getConnection(DAOFactory.MYSQL);
            //3. Se prepara la sentencia SQL
            String sql = "{call usp_delProducto(?)}";
            cstmt = conn.prepareCall(sql);
            cstmt.setInt(1, id);
            //4. Se ejecuta la sentencia SQL
            cstmt.execute();

            //5. Se interpretan los resultados
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           //6. Se cierran los objetos de conexion
            if (cstmt != null ) try {cstmt.close(); } catch(Exception e) {e.printStackTrace();}
            if (conn != null ) try {conn.close(); } catch(Exception e) {e.printStackTrace();}
        }
    }

}
